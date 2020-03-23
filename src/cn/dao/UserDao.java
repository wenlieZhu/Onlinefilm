package cn.dao;

import java.util.List;

import cn.bean.User;

public interface UserDao {
	public List<User> findUserById(int id,String password); 
	
	public User findUser(int id ,String password);	//用户登录
	
	public List<User> findUser();		//查询所有用户
	
	public boolean updatePassword(int id,String password);	//用户修改密码	//用户修改密码，需要原密码
	
	public boolean doUser(User user);		//用户注册
	
	public User findUserById(int id);		//根据id查用户

}
