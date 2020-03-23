package cn.dao;

import java.util.List;

import cn.bean.Orders;

public interface OrdersDao {
public List<Orders> findAllOrders();  //查看所有订单
	
	public List<Orders> findOrdersByUid(int uid);  //通过用户编号查看订单
	
	public List<Orders> findScreeningsBySid(int filmid); //通过电影编号查看订单
	
	public List<Orders> findOrdersById(String name);  //通过订单编号查看交易时间
	
	public List<Orders> findOrdersBySid(String name);  //通过订单编号查看场次
	

}
