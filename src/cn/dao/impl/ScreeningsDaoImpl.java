package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bean.Screenings;
import cn.dao.ScreeningsDao;
import cn.dbc.BaseDao;

public class ScreeningsDaoImpl implements ScreeningsDao
{
	BaseDao bs=new BaseDao();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	@Override
	public List<Screenings> findFilmScByFilmid(int filmid)
	{
		List<Screenings> list=null;
		String sql="select * from screenings where filmid=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(filmid);
		list=bs.query(sql, lp, Screenings.class);
		return list;
	}

	@Override
	public List<Screenings> findFilmScByVideoid(int videoid)
	{
		List<Screenings> list=null;
		String sql="select * from screenings where videoid=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(videoid);
		list=bs.query(sql, lp, Screenings.class);
		return list;
	}

	@Override
	public boolean updateScreenings(Screenings screenings)
	{
		boolean isFlag=false;		
		conn=bs.getConnection();
		if(conn!=null)
		{			
			String sql="update screenings set id=?,playtime=?,language=?,price=?,videoid=? where filmid=?";		
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1, screenings.getId());
				pstmt.setString(2,screenings.getPlaytime());
				pstmt.setString(3, screenings.getLanguage());
				pstmt.setDouble(4, screenings.getPrice());
				pstmt.setInt(5,screenings.getVideoid());
				pstmt.setInt(6,screenings.getFilmid());
				int num = pstmt.executeUpdate();
				if(num>0) 
				{
					isFlag = true;
				} 
			} 
			catch (SQLException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			finally
			{
				bs.closeConn(conn, pstmt, rs);
			}
		}		
		return isFlag;
	}
	
	@Override
	public List<Screenings> findScByOrdersId(String name)
	{
		List<Screenings> list=null;
		String sql="select playtime from screenings where videoid IN (select id from videohall where seatid IN (select id from seat where name=?))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list=bs.query(sql, lp, Screenings.class);
		return list;
	}
	
	@Override
	public List<Screenings> findScrByOrdersId(String name)  //通过订单id查看语言版本
	{
		List<Screenings> list=null;
		String sql="select language from screenings where videoid IN (select id from videohall where seatid IN (select id from seat where name=?))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list=bs.query(sql, lp, Screenings.class);
		return list;
	}
	
	
	@Override
	public List<Screenings> findScreenByOrdersId(String name)  //通过订单id查看价格
	{
		List<Screenings> list=null;
		String sql="select price from screenings where videoid IN (select id from videohall where seatid IN (select id from seat where name=?))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list=bs.query(sql, lp, Screenings.class);
		return list;
	}
	
	@Override
	public List<Screenings>  findScreByOrdersId(String name)  //通过座位查看场次
	{
		List<Screenings> list=null;
		String sql="select id from screenings where videoid IN (select id from videohall where seatid IN (select id from seat where name=?))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list=bs.query(sql, lp, Screenings.class);
		return list;
	}
}
