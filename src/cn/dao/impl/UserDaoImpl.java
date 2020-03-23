package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import cn.bean.User;
import cn.dao.UserDao;
import cn.dbc.BaseDao;

public class UserDaoImpl implements UserDao {
	BaseDao bs=new BaseDao();
	PreparedStatement pstmt=null;
	Connection conn=null;
	ResultSet rs=null;
	
	@Override
	public List<User> findUserById(int id, String password)
	{
		List<User> list=null;
		String sql="select * from user where id=? and password=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(id);
		lp.add(password);
		list=bs.query(sql, lp, User.class);
		return list;
	}

	@Override
	public User findUser(int id, String password) {
		User user=null;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="select * from user where id=? and password=?";
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				pstmt.setString(2,password);
				rs=pstmt.executeQuery();
				if(rs.next())
				{
					user=new User();
					user.setId(rs.getInt(1));
					user.setName(rs.getString(2));
					user.setPhone(rs.getString(3));
					user.setPassword(rs.getString(4));
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
		return user;
	}

	@Override
	public List<User> findUser() {
		List<User> list=new ArrayList<User>();
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="select * from user";
			try
			{
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while(rs.next())
				{
					User user=new User();
					user.setId(rs.getInt(1));
					user.setName(rs.getString(2));
					user.setPassword(rs.getString(3));
					user.setPhone(rs.getString(4));
					list.add(user);
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
	public boolean updatePassword(int id, String password)
	{
		boolean isFlag=false;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="update user set password=? where id=?";
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setString(1,password);
				pstmt.setInt(2,id);
				int num=pstmt.executeUpdate(); 
				if(num>0)
				{
					isFlag=true;
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
	public boolean doUser(User user) {
		boolean isFlag=false;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="insert into user (id,name,phone,password) values(?,?,?,?)";
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,user.getId());
				pstmt.setString(2, user.getName());
				pstmt.setString(3,user.getPhone());
				pstmt.setString(4, user.getPassword());
				int num=pstmt.executeUpdate();
				if(num>0)
				{
					isFlag=true;
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
	public User findUserById(int id) {
		User u=null;
		conn=bs.getConnection();
		if(conn!=null)
		{
			String sql="select * from user where id=?";
			try
			{
				pstmt=conn.prepareStatement(sql);
				pstmt.setInt(1,id);
				rs=pstmt.executeQuery();
				if(rs.next())
				{
					u=new User();
					u.setId(rs.getInt(1));
					u.setName(rs.getString(2));
					u.setPassword(rs.getString(3));
					u.setPhone(rs.getString(4));
				}
				else {
					
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
		return u;
	}

}
