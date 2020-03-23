package cn.dao;

import java.util.List;

import cn.bean.VideoHall;

public interface VideoHallDao {
	public List<VideoHall> findVideoHall();			//查询所有的放映厅
	
	public VideoHall findVideoHallById(int id);		//根据id查放映厅
	
	public List<VideoHall> findOrdersVideoHallById(String name);  //通过座位查看放映厅

}
