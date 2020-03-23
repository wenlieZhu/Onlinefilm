package cn.dao;

import java.util.List;

import cn.bean.FilmType;

public interface FilmTypeDao {
	public List<FilmType> findTypeById(int id);  //通过id查看电影类型
	
	public boolean doFilmType(FilmType filmtype);   //添加电影类型
	
	public List<FilmType> findFilmType(int id); //通过电影编号查询电影类型

}
