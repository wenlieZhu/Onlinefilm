package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bean.VideoHall;
import cn.dao.VideoHallDao;
import cn.dbc.BaseDao;

public class VideoHallDaoImpl implements VideoHallDao {
	BaseDao bs=new BaseDao();
	PreparedStatement pstmt=null;
	Connection conn=null;
	ResultSet rs=null;

	@Override
	public List<VideoHall> findVideoHall() {
		List<VideoHall> list=new ArrayList<VideoHall>();
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="select * from videohall";
			try
			{
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					VideoHall vh=new VideoHall();
					vh.setId(rs.getInt(1));
					vh.setName(rs.getString(2));
					vh.setSeatid(rs.getInt(3));
					list.add(vh);
				}
			} 
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				bs.closeConn(conn, pstmt, rs);
			}
		}
		return list;
	}

	@Override
	public VideoHall findVideoHallById(int id) {
		VideoHall vh=null;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="select * from videohall where id=?";
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				rs=pstmt.executeQuery();
				if(rs.next())
				{
					vh=new VideoHall();
					vh.setId(rs.getInt(1));
					vh.setName(rs.getString(2));
					vh.setSeatid(rs.getInt(3));
				}
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
			finally
			{
				bs.closeConn(conn, pstmt, rs);
			}
			
		}
		return vh;
	}
	
	@Override
	public List<VideoHall> findOrdersVideoHallById(String name)  //通过座位查看放映厅
	{
		List<VideoHall> list=null;
		String sql="select name from videohall where seatid IN (select id from seat where name=?)";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list= bs.query(sql, lp, VideoHall.class);
		return list;
	}

}
