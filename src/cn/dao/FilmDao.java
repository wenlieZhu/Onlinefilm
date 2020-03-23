package cn.dao;

import java.util.List;

import cn.bean.Film;

public interface FilmDao {
	public List<Film> findAllFilm();    //查看所有电影信息
	
	public List<Film> findFilmByTypeid(int filmtypeid);  //通过电影类型查看电影信息
	
	public boolean doFilm(Film film);  //添加电影信息
	
	public boolean delFilm(int id);  //删除电影信息
	
	public boolean updateFilm(Film film);  //修改电影信息
	
	public List<Film> findFilmById(int id);  //通过电影编号查看电影详细信息
	
	public List<Film> findFilmScreeningsOrdersById(int id);  //通过电影编号查看电影详细信息
	
	public List<Film> findFilmScreeningsById(String name);

}
