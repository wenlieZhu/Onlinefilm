package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bean.Film;
import cn.dao.FilmDao;
import cn.dbc.BaseDao;

public class FilmDaoImpl implements FilmDao
{
	BaseDao bs=new BaseDao();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	@Override
	public List<Film> findAllFilm()
	{
		List<Film> list=null;
		String sql="select * from film";
		List<Object> lp=new ArrayList<Object>();
		list=bs.query(sql, lp, Film.class);
		return list;
	}

	@Override
	public List<Film> findFilmByTypeid(int filmtypeid)
	{
		List<Film> list=null;
		String sql="select * from film where filmtypeid=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(filmtypeid);
		list=bs.query(sql, lp, Film.class);
		return list;
	}

	@Override
	public boolean doFilm(Film film)
	{
		boolean isFlag=false;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="insert into film (id,name,introduce,actor,grade,filmtypeid) values (?,?,?,?,?,?)";		
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,film.getId());
				pstmt.setString(2, film.getName());
				pstmt.setString(3, film.getIntroduce());
				pstmt.setString(4, film.getActor());
				pstmt.setDouble(5, film.getGrade());
				pstmt.setInt(6, film.getFilmtypeid());
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
	public boolean delFilm(int id)
	{
		boolean isFlag=false;
		String sql="delete  from film where id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		isFlag=bs.update(sql, lp);
		return isFlag;
	}

	@Override
	public boolean updateFilm(Film film)
	{
		boolean isFlag=false;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="update film set name=?,introduce=?,actor=?,grade=?,filmtypeid=? where id=?";		
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1, film.getName());
				pstmt.setString(2, film.getIntroduce());
				pstmt.setString(3, film.getActor());
				pstmt.setDouble(4, film.getGrade());
				pstmt.setInt(5, film.getFilmtypeid());
				pstmt.setInt(6,film.getId());
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
	public List<Film> findFilmById(int id)
	{
		List<Film> list=null;
		String sql="select * from film where id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		list=bs.query(sql, lp, Film.class);
		return list;
	}
	
	@Override
	public List<Film> findFilmScreeningsOrdersById(int id)  //通过电影编号查看电影详细信息
	{
		List<Film> list=null;
		String sql="select name from film where id IN (select filmid from screenings where id IN (select sid from orders where id=?))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		list=bs.query(sql, lp, Film.class);
		return list;
	}
	
	@Override
	public List<Film> findFilmScreeningsById(String name)  
	{
		List<Film> list=null;
		String sql="select name from film where id IN (select filmid from screenings where videoid IN (select id from videohall where seatid IN (select id from seat where name=?)))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list=bs.query(sql, lp, Film.class);
		return list;
	}

}
