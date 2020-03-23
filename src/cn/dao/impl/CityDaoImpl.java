package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.City;
import cn.dao.CityDao;
import cn.dbc.BaseDao;

public class CityDaoImpl implements CityDao {
	BaseDao bs = new BaseDao();

	@Override
	public List<City> findAllCity() {
		List<City> list = null;
		String sql = "select * from city";
		List<Object> lp = new ArrayList<Object>();
		list = bs.query(sql, lp, City.class);
		return list;
	}

}
