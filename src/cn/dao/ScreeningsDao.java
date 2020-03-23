package cn.dao;

import java.util.List;

import cn.bean.Screenings;

public interface ScreeningsDao {
	public List<Screenings> findFilmScByFilmid(int filmid);   //通过电影编号查看放映厅场次信息
	
	public List<Screenings> findFilmScByVideoid(int videoid);  //通过放映厅编号查看场次信息
	
	public boolean updateScreenings(Screenings screenings);  //修改放映场次

	public List<Screenings> findScByOrdersId(String name);  //通过座位查看放映时间
	
	public List<Screenings> findScrByOrdersId(String name);  //通过座位查看语言版本
	
	public List<Screenings> findScreenByOrdersId(String name);  //通过座位查看价格
	
	public List<Screenings> findScreByOrdersId(String name);  //通过座位查看场次
}
