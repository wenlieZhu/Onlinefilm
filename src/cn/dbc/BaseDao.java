package cn.dbc;

import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BaseDao {
	public Connection getConnection(){
		Connection conn=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinefilm?characterEncoding=utf-8","root","123456");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public void closeConn(Connection conn,PreparedStatement pstmt,ResultSet rs)
	{
		try
		{
			if(rs!=null)
			{
				rs.close();
			}
			if(pstmt!=null)
			{
				pstmt.close();
			}
			if(conn!=null)
			{
				conn.close();
			}
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public boolean update(String sql,List<Object> lp){
		boolean isFlag=false;
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn=getConnection();
		if(conn!=null)
		{
			try
			{
				pstmt=conn.prepareStatement(sql);
				if(lp.size()>0)
				{
					for(int i=0;i<lp.size();i++)
					{
						pstmt.setObject(i+1,lp.get(i));
					}
				}
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
				closeConn(conn, pstmt, rs);
			}
		}
		return isFlag;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public <T>List<T> query(String sql,List<Object> lp,Class clazz)
	{
		List<T> list=new ArrayList<T>();
		Connection conn=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		conn=getConnection();
		if(conn!=null)
		{
			try
			{
				pstmt=conn.prepareStatement(sql);
				if(lp.size()>0)
				{
					for(int i=0;i<lp.size();i++)
					{
						pstmt.setObject(i+1,lp.get(i));
					}
				}
				rs=pstmt.executeQuery();
				ResultSetMetaData rm=rs.getMetaData();//rm中存储了结果集中查询的表的所有列名
				int num=rm.getColumnCount();
				while(rs.next())
				{
					Object obj=clazz.newInstance();
					for(int i=1;i<=num;i++)
					{
						String name=rm.getColumnName(i); //通过rm拿到列名以及属性名
						Field f=clazz.getDeclaredField(name);//通过反射拿到属性对象
						f.setAccessible(true);//设置属性可以访问
						Object o=rs.getObject(i);//读取到列值
						f.set(obj,o);
					}
					list.add((T)obj);
				}
			} 
			catch (Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				closeConn(conn, pstmt, rs);
			}
		}
		return list;
	}

}
