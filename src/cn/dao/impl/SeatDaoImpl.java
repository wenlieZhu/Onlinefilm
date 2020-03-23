package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bean.Seat;
import cn.dao.SeatDao;
import cn.dbc.BaseDao;

public class SeatDaoImpl implements SeatDao {
	BaseDao bs=new BaseDao();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;

	@Override
	public List<Seat> findSeat() {
		List<Seat> list=new ArrayList<Seat>();
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="select * from seat";
			try
			{
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					Seat s=new Seat();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
					list.add(s);
				}
			} catch (SQLException e)
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
	public Seat findSeatById(int id) {
		Seat s=null;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="select * from seat where id=?";
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				rs=pstmt.executeQuery();
				if(rs.next())
				{
					s=new Seat();
					s.setId(rs.getInt(1));
					s.setName(rs.getString(2));
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
		return s;
	}

}
