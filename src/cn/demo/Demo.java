package cn.demo;


import java.util.List;


import org.junit.Test;

import cn.bean.Administrator;
import cn.bean.Area;
import cn.bean.Cinema;
import cn.bean.City;
import cn.bean.Film;
import cn.bean.FilmType;
import cn.bean.Orders;
import cn.bean.Screenings;
import cn.bean.Seat;
import cn.bean.User;
import cn.bean.VideoHall;
import cn.dao.FilmDao;
import cn.dao.FilmTypeDao;
import cn.dao.OrdersDao;
import cn.dao.ScreeningsDao;
import cn.dao.SeatDao;
import cn.dao.UserDao;
import cn.dao.VideoHallDao;
import cn.dao.AdministratorDao;
import cn.dao.AreaDao;
import cn.dao.CinemaDao;
import cn.dao.CityDao;
import cn.dao.impl.AdministratorDaoImpl;
import cn.dao.impl.AreaDaoImpl;
import cn.dao.impl.CinemaDaoImpl;
import cn.dao.impl.CityDaoImpl;
import cn.dao.impl.FilmDaoImpl;
import cn.dao.impl.FilmTypeDaoImpl;
import cn.dao.impl.OrdersDaoImpl;
import cn.dao.impl.ScreeningsDaoImpl;
import cn.dao.impl.SeatDaoImpl;
import cn.dao.impl.UserDaoImpl;
import cn.dao.impl.VideoHallDaoImpl;
import cn.dbc.BaseDao;

public class Demo {
	BaseDao bs=new BaseDao();
	FilmTypeDao filmtypeDao=new FilmTypeDaoImpl();
	FilmDao filmDao=new FilmDaoImpl();
	OrdersDao ordersDao=new OrdersDaoImpl();
	ScreeningsDao screeningsDao=new ScreeningsDaoImpl();
	AdministratorDao administratorDao=new AdministratorDaoImpl();
	AreaDao areaDao=new AreaDaoImpl();
	CinemaDao cinemaDao=new CinemaDaoImpl();
	UserDao userDao=new UserDaoImpl();
	VideoHallDao videoHallDao=new VideoHallDaoImpl();
	CityDao cityDao=new CityDaoImpl();
	SeatDao seatDao=new SeatDaoImpl();
	
	//测试数据库连接
	@Test
	public void conn(){
		BaseDao bs=new BaseDao();
		bs.getConnection();
	}
	
	//通过id查看电影类型
	@Test
	public void FilmTypeDao01(){
		List<FilmType> list=filmtypeDao.findTypeById(2);
		for(FilmType ft:list)
		{
			System.out.println(ft.getId()+"\t"+ft.getName());			
		}	
	}
	
	//添加电影类型
	@Test
	public void FilmTypeDao02(){
		boolean ft=filmtypeDao.doFilmType(new FilmType(6,"恐怖片"));
		System.out.println(ft);
	}
	
	//通过电影编号查询电影类型
		@Test
		public void FilmTypeDao03(){
			List<FilmType> list=filmtypeDao.findFilmType(2);
			for(FilmType ft:list)
			{
				System.out.println(ft.getId()+"\t"+ft.getName());			
			}
		}
	
	//查看所有电影信息
	@Test
	public void FilmDao01(){
		List<Film> list=filmDao.findAllFilm();
		for(Film f:list)
		{
			System.out.println(f.getId()+"\t"+f.getName());
			System.out.println(f.getIntroduce());
			System.out.println(f.getActor());
			System.out.println(f.getGrade());
		}	
	}
	
	//通过电影类型查看电影信息
	@Test
	public void FilmDao02(){
		List<Film> list=filmDao.findFilmByTypeid(2);
		for(Film f:list)
		{
			System.out.println(f.getId()+"\t"+f.getName());
			System.out.println(f.getIntroduce());
			System.out.println(f.getActor());
			System.out.println(f.getGrade());
		}
	}
	
	//添加电影信息
	@Test
	public void FilmDao03(){
		boolean t=filmDao.doFilm(new Film(11, "侏罗纪世界2", "侏罗纪世界主题公园及豪华度假村被失控的恐龙们摧毁已有三年。如今，纳布拉尔岛已经被人类遗弃，岛上幸存的恐龙们在丛林中自给自足。当岛上的休眠火山开始活跃以后，欧文（克里斯·帕拉特 饰）与克莱尔（布莱丝·达拉斯·霍华德 饰）发起了一场运动，想要保护岛上幸存的恐龙们免于灭绝。", "克里斯·帕拉特,布莱丝·达拉斯·霍华德,伊莎贝拉·瑟蒙,杰夫·高布伦", 8.5, 1));
		System.out.println(t);
	}
	
	//删除电影信息
	@Test
	public void FilmDao04(){
		boolean isFlag=filmDao.delFilm(11);
		System.out.println(isFlag);
	}
	
	//修改电影信息
	@Test
	public void FilmDao05(){
		boolean t=filmDao.updateFilm(new Film(11,"侏罗纪世界1", "侏罗纪世界主题公园及豪华度假村被失控的恐龙们摧毁已有三年。如今，纳布拉尔岛已经被人类遗弃，岛上幸存的恐龙们在丛林中自给自足。当岛上的休眠火山开始活跃以后，欧文（克里斯·帕拉特 饰）与克莱尔（布莱丝·达拉斯·霍华德 饰）发起了一场运动，想要保护岛上幸存的恐龙们免于灭绝。", "克里斯·帕拉特,布莱丝·达拉斯·霍华德,伊莎贝拉·瑟蒙,杰夫·高布伦", 8.5, 2));
		System.out.println(t);
	}
	
	//通过电影编号查看电影详细信息
	@Test
	public void FilmDao06(){
		List<Film> list=filmDao.findFilmById(10);
		for(Film f:list)
		{
			System.out.println(f.getId()+"\t"+f.getName());
			System.out.println(f.getIntroduce());
			System.out.println(f.getActor());
			System.out.println(f.getGrade());
		}
	}
	
	//查看所有订单
	@Test
	public void ordersDao01(){
		List<Orders> list=ordersDao.findAllOrders();
		for(Orders o:list)
		{
			System.out.println(o.getId()+"\t"+o.getUsername()+"\t"+o.getPaytime()+"\t"+o.getUid()+"\t"+o.getSid());
		}
	}
	
	//通过用户编号查看订单
	@Test
	public void ordersDao02(){
		List<Orders> list=ordersDao.findOrdersByUid(1);
		for(Orders o:list)
		{
			System.out.println(o.getId()+"\t"+o.getUsername()+"\t"+o.getPaytime()+"\t"+o.getSid());
		}
	}
	
	//通过电影编号查看订单
	@Test
	public void ordersDao03(){
		List<Orders> list=ordersDao.findScreeningsBySid(2);
		for(Orders o:list)
		{
			System.out.println(o.getId()+"\t"+o.getUsername()+"\t"+o.getPaytime()+"\t"+o.getUid());
		}
	}
	
	//通过电影编号查看放映厅场次信息
	@Test
	public void ScreeningsDao01(){
		List<Screenings> list=screeningsDao.findFilmScByFilmid(2);
		for(Screenings s:list)
		{
			System.out.println(s.getId()+"\t"+s.getPlaytime()+"\t"+s.getLanguage()+"\t"+s.getPrice()+"\t"+s.getVideoid());
		}
	}
	
	//通过放映厅编号查看场次信息
	@Test
	public void ScreeningsDao02(){
		List<Screenings> list=screeningsDao.findFilmScByVideoid(3);
		for(Screenings s:list)
		{
			System.out.println(s.getId()+"\t"+s.getPlaytime()+"\t"+s.getLanguage()+"\t"+s.getPrice()+"\t"+s.getFilmid());
		}
	}
	
	//通过电影编号修改放映厅场次信息
/*	@Test
	public void ScreeningsDao03(){
		boolean isFlag=screeningsDao.updateScreenings(2,40);
		//Screenings s=new Screenings(3, "2018-7-20,19:00-21:00", "国语3D", 50, 2, 5);
		//System.out.println(s);
		System.out.println(isFlag);
	} */
	
	//管理员登录
	@Test
	public void AdministratorDao(){
		Administrator c=administratorDao.adminlogin(1, "123456");
		if(c!=null){
			System.out.println("登录成功！");
		} 
		else{
			System.out.println("登录失败！");
		}
	}
	
	//查询所有的区域信息
	@Test
	public void AreaDao01(){
		List<Area> list=areaDao.findAllArea();
		for(Area a:list)
		{
			System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getCityid());
		}
	}
	
	//查询某个城市的所有区域
	@Test
	public void AreaDao02(){
		List<Area> list=areaDao.findAreaByCity(2);
		for(Area a:list)
		{
			System.out.println(a.getId()+"\t"+a.getName()+"\t"+a.getCityid());
		}
	}
	
	//查询所有的影院
	@Test
	public void CinemaDao01(){
		List<Cinema> list=cinemaDao.findAllCinema();
		for(Cinema c:list){
			System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAddress()+"\t"+c.getAreaid());
		}
	}
	
	//查询某个区域的所有影院
	@Test
	public void CinemaDao02(){
		List<Cinema> list=cinemaDao.findCinemaByArea(12);
		for(Cinema c:list){
			System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAddress()+"\t"+c.getAreaid());
		}
	}
	
	//查询某个城市的所有影院
	@Test
	public void CinemaDao03(){
		List<Cinema> list=cinemaDao.findCinemaByCity(2);
		for(Cinema c:list){
			System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAddress()+"\t"+c.getAreaid());
		}
	}
	
	//查询具体的某个影院
	@Test
	public void CinemaDao04(){
		Cinema c=cinemaDao.findCinemaById(121);
		System.out.println(c.getId()+"\t"+c.getName()+"\t"+c.getAddress()+"\t"+c.getAreaid());
	}
	
	//查询所有城市
	@Test
	public void CityDao01(){
		List<City> list=cityDao.findAllCity();
		for(City c:list){
			System.out.println(c.getId()+"\t"+c.getName());
		}
	}
	
	//查询所有座位
	@Test
	public void SeatDao01(){
		List<Seat> list=seatDao.findSeat();
		for(Seat s:list){
			System.out.println(s.getId()+"\t"+s.getName());
		}
	}
	
	//根据id查座位
	@Test
	public void SeatDao02(){
		Seat s=seatDao.findSeatById(2);
		System.out.println(s.getId()+"\t"+s.getName());
	}
	
	//用户登录
	@Test
	public void UserDao01(){
		
		User u=userDao.findUser(1, "012345");
		if(u!=null){
			System.out.println("登录成功！");
		} 
		else{
			System.out.println("登录失败！");
		}
	}
	
	//查询所有用户
	@Test
	public void UserDao02(){
		List<User> list=userDao.findUser();
		for(User u:list){
			System.out.println(u.getId()+"\t"+u.getName()+"\t"+u.getPhone());
		}
	}
	
	/*用户修改密码
	@Test
	public void UserDao03(){
		boolean u=userDao.updatePwd(2, "123456", "456789");
		System.out.println(u);
	}*/
	
	//用户注册
	@Test
	public void UserDao04(){
		boolean u=userDao.doUser(new User(7, "马化腾", "mahuateng", "18098738374"));
		System.out.println(u);
	}
	
	//根据id查用户
	@Test
	public void UserDao05(){
		User user=userDao.findUserById(3);
		System.out.println(user.getId()+"\t"+user.getName()+"\t"+user.getPhone());
	}
	
	//查询所有的放映厅
	@Test
	public void VideoHallDao01(){
		List<VideoHall> list=videoHallDao.findVideoHall();
		for(VideoHall v:list){
			System.out.println(v.getId()+"\t"+v.getName()+"\t"+v.getSeatid());
		}
	}
	
	//根据id查放映厅
	@Test
	public void VideoHallDao02(){
		VideoHall v=videoHallDao.findVideoHallById(2);
		System.out.println(v.getId()+"\t"+v.getName()+"\t"+v.getSeatid());
	}
	 
	

}
