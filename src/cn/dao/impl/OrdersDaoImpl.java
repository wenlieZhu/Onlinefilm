package cn.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.bean.Orders;
import cn.dao.OrdersDao;
import cn.dbc.BaseDao;

public class OrdersDaoImpl implements OrdersDao
{
	BaseDao bs=new BaseDao();
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	@Override
	public List<Orders> findAllOrders()
	{
		List<Orders> list=null;
		String sql="select * from orders ";
		List<Object> lp=new ArrayList<Object>();
		list=bs.query(sql, lp, Orders.class);
		return list;
	}

	@Override
	public List<Orders> findOrdersByUid(int uid)
	{
		List<Orders> list=null;
		String sql="select * from orders where uid=?";
		List<Object> lp=new ArrayList<Object>();
		lp.add(uid);
		list=bs.query(sql, lp, Orders.class);
		return list;
	}
	
	@Override
	public List<Orders> findScreeningsBySid(int filmid)
	{
		List<Orders> list=null;
		String sql="select * from orders where sid IN (select id from screenings where filmid=?) ";
		List<Object> lp=new ArrayList<Object>();
		lp.add(filmid);
		list=bs.query(sql, lp, Orders.class);
		return list;
	}
	
	@Override
	public List<Orders> findOrdersById(String name)
	{
		List<Orders> list=null;
		String sql="select paytime from orders where sid IN (select id from screenings where videoid IN (select id from videohall where seatid IN (select id from seat where name=?)))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list=bs.query(sql, lp, Orders.class);
		return list;
	}
	
	@Override
	public List<Orders> findOrdersBySid(String name)  //订单编号
	{
		List<Orders> list=null;
		String sql="select id from orders where sid IN (select id from screenings where videoid IN (select id from videohall where seatid IN (select id from seat where name=?)))";
		List<Object> lp=new ArrayList<Object>();
		lp.add(name);
		list=bs.query(sql, lp, Orders.class);
		return list;
	}
}
