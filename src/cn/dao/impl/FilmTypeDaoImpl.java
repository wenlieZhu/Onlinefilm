package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bean.FilmType;
import cn.dao.FilmTypeDao;
import cn.dbc.BaseDao;

public class FilmTypeDaoImpl implements FilmTypeDao {
	BaseDao bs=new BaseDao();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;

	@Override
	public List<FilmType> findTypeById(int id) {
		List<FilmType> list=null;
		String sql="select * from filmtype where id=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		list=bs.query(sql, lp, FilmType.class);
		return list;
	}

	@Override
	public boolean doFilmType(FilmType filmtype) {
		boolean isFlag=false;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="insert into filmtype set id=?,name=?";		
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,filmtype.getId());
				pstmt.setString(2, filmtype.getName());
				int num = pstmt.executeUpdate();
				if(num>0) 
				{
					isFlag = true;
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
		return isFlag;
	}

	@Override
	public List<FilmType> findFilmType(int id) {
		List<FilmType> list=null;
		String sql="select * from filmtype where id IN (select filmtypeid from film where id=?)";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		list=bs.query(sql, lp, FilmType.class);
		return list;
	}

}
