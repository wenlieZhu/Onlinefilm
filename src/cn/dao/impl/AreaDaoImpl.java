package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.Area;
import cn.dao.AreaDao;
import cn.dbc.BaseDao;

public class AreaDaoImpl implements AreaDao {
	BaseDao bs = new BaseDao();

	@Override
	public List<Area> findAllArea() {
		List<Area> list = null;
		String sql = "select * from area";
		List<Object> lp = new ArrayList<Object>();
		list = bs.query(sql, lp, Area.class);
		return list;
	}

	@Override
	public List<Area> findAreaByCity(int cityid) {
		List<Area> list = null;
		String sql = "select * from area where cityid=?";
		List<Object> lp = new ArrayList<Object>();
		lp.add(cityid);
		list = bs.query(sql, lp, Area.class);
		return list;
	}

}
