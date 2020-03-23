package cn.dao;

import java.util.List;

import cn.bean.Cinema;

public interface CinemaDao {
	public List<Cinema> findAllCinema();//查询所有的影院
	
	public List<Cinema> findCinemaByArea(int areaid);//查询某个区域的所有影院
	
	public List<Cinema> findCinemaByCity(int cityid);//查询某个城市的所有影院
	
	public Cinema findCinemaById(int id);//查询具体的某个影院

}
