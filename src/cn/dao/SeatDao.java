package cn.dao;

import java.util.List;

import cn.bean.Seat;

public interface SeatDao {
	public List<Seat> findSeat();  //查询所有座位
	
	public Seat findSeatById(int id);		//根据id查座位

}
