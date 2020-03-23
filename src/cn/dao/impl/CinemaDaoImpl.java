package cn.dao.impl;

import java.util.ArrayList;
import java.util.List;

import cn.bean.Cinema;
import cn.dao.CinemaDao;
import cn.dbc.BaseDao;

public class CinemaDaoImpl implements CinemaDao {
	BaseDao bs = new BaseDao();

	@Override
	public List<Cinema> findAllCinema() {
		List<Cinema> list = null;
		String sql = "select * from cinema";
		List<Object> lp = new ArrayList<Object>();
		list = bs.query(sql, lp, Cinema.class);
		return list;
	}

	@Override
	public List<Cinema> findCinemaByArea(int areaid) {
		List<Cinema> list = null;
		String sql = "select * from cinema where areaid=?";
		List<Object> lp = new ArrayList<Object>();
		lp.add(areaid);
		list = bs.query(sql, lp, Cinema.class);
		return list;
	}

	@Override
	public List<Cinema> findCinemaByCity(int cityid) {
		List<Cinema> list = null;
		String sql = "select * from cinema where areaid in (select id from area where cityid=?)";
		List<Object> lp = new ArrayList<Object>();
		lp.add(cityid);
		list = bs.query(sql, lp, Cinema.class);
		return list;
	}

	@Override
	public Cinema findCinemaById(int id) {
		Cinema cinema = null;
		String sql = "select * from cinema where id=?";
		List<Object> lp = new ArrayList<Object>();
		lp.add(id);
		cinema = (Cinema) bs.query(sql, lp, Cinema.class).get(0);
		return cinema;
	}

}
