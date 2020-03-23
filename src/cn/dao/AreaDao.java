package cn.dao;

import java.util.List;

import cn.bean.Area;

public interface AreaDao {
	public List<Area> findAllArea();//查询所有的区域信息
	
	public List<Area> findAreaByCity(int cityid);//查询某个城市的所有区域

}
