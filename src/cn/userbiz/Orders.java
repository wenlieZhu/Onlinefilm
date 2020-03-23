package cn.userbiz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import cn.bean.Screenings;
import cn.bean.Seat;
import cn.bean.User;
import cn.bean.VideoHall;
import cn.dao.FilmDao;
import cn.dao.OrdersDao;
import cn.dao.ScreeningsDao;
import cn.dao.SeatDao;
import cn.dao.UserDao;
import cn.dao.VideoHallDao;
import cn.dao.impl.FilmDaoImpl;
import cn.dao.impl.OrdersDaoImpl;
import cn.dao.impl.ScreeningsDaoImpl;
import cn.dao.impl.SeatDaoImpl;
import cn.dao.impl.UserDaoImpl;
import cn.dao.impl.VideoHallDaoImpl;
import cn.visitorbiz.HomePage;
import cn.visitorbiz.Login;

@SuppressWarnings("all")
public class Orders extends JFrame	implements MouseListener
{
	JLabel logo,homepage,film,cinema,login,useri,orders,exit;
	JPanel mb,mb1;
	JLabel ordersid,filmname,language,playtime,videohall,screenings,seat,price,paytime;
	JLabel u1,u2,u3,u4,u5,u6,u7,u8,u9;	
	ImageIcon image;
	Image img;
		
	UserDao userDao=new UserDaoImpl();
	OrdersDao ordersDao=new OrdersDaoImpl();
	ScreeningsDao screeningsDao=new ScreeningsDaoImpl();
	FilmDao filmDao=new FilmDaoImpl();
	VideoHallDao videohallDao=new VideoHallDaoImpl();
	SeatDao seatDao=new SeatDaoImpl();
	
	public static void main(String[] args)
	{
		Orders orders = new Orders();
	}				
	
	public Orders()
	{
		homepage = new JLabel("首页");
		film = new JLabel("电影");
		cinema = new JLabel("影院");
		login = new JLabel("我的信息");
		
		
		useri=new JLabel("用户信息");
		orders=new JLabel("我的订单");
		exit=new JLabel("退出系统");
		
		image = new ImageIcon("image/logo.png");
		img = image.getImage();
        img = img.getScaledInstance(177, 72, Image.SCALE_DEFAULT); 
        image.setImage(img);
                				
		logo= new JLabel(image);
		logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logo.setHorizontalAlignment(SwingConstants.CENTER);			
		logo.setBounds(10, 4, 177, 72);
		logo.addMouseListener(this);
		
		homepage = new JLabel("首页");
		homepage .setHorizontalAlignment(SwingConstants.CENTER);
		homepage.addMouseListener(new MouseAdapter() 
		{
        	@Override
        	public void mouseEntered(MouseEvent arg0) 
        	{
        		homepage.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) 
        	{
        		homepage.setForeground(Color.BLACK);
        	}
        });
        homepage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homepage.setForeground(Color.BLACK);
        homepage.addMouseListener(this);
        homepage.setFont(new Font("宋体", Font.BOLD, 23));		
		homepage .setBounds(196, 10, 92, 66);		
		
		film = new JLabel("电影");
		film.setHorizontalAlignment(SwingConstants.CENTER);
		film.addMouseListener(new MouseAdapter() 
		{
	        @Override
	        public void mouseEntered(MouseEvent arg0) 
	        {
	        	film.setForeground(new Color(255, 0, 0));
	        }
	        @Override
	        public void mouseExited(MouseEvent e) 
	        {
	        	film.setForeground(Color.BLACK);
	        }
	    });
	    film.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    film.setForeground(Color.BLACK);
	    film.addMouseListener(this);
	    film.setFont(new Font("宋体", Font.BOLD, 23));
		film.setBounds(391, 10, 81, 66);
		
		cinema = new JLabel("影院");
		cinema.setHorizontalAlignment(SwingConstants.CENTER);
		cinema.addMouseListener(new MouseAdapter() 
		{
	        @Override
	        public void mouseEntered(MouseEvent arg0)
	        {
	        	cinema.setForeground(new Color(255, 0, 0));
	        }
	        @Override
	        public void mouseExited(MouseEvent e)
	        {
	        	cinema.setForeground(Color.BLACK);
	        }
	    });
	    cinema.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    cinema.setForeground(Color.BLACK);
	    cinema.addMouseListener(this);
	    cinema.setFont(new Font("宋体", Font.BOLD, 23));
		cinema.setBounds(583, 10, 86, 66);
		
		login = new JLabel("我的信息");
		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.addMouseListener(new MouseAdapter() 
		{
	        @Override
	        public void mouseEntered(MouseEvent arg0)
	        {
	        	login.setForeground(new Color(255, 0, 0));
	        }
	        @Override
	        public void mouseExited(MouseEvent e)
	        {
	        	login.setForeground(Color.BLUE);
	        }
	    });
	    login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));	    
	    login.setForeground(new Color(0, 0, 255));
        login.setFont(new Font("微软雅黑", Font.BOLD, 21));
		login.setBounds(727, 10, 134, 66);
		login.addMouseListener(this);
		
		mb = new JPanel();
		mb.setBackground(Color.WHITE);
        mb.setBounds(10, 10, 880, 72);
		
		useri = new JLabel("用户信息");
		useri.setHorizontalAlignment(SwingConstants.CENTER);
		useri.addMouseListener(new MouseAdapter() 
		{			
	        @Override
	        public void mouseEntered(MouseEvent arg0)
	        {
	        	useri.setForeground(new Color(255, 0, 0));
	        }
	        @Override
	        public void mouseExited(MouseEvent e)
	        {
	        	useri.setForeground(Color.BLACK);
	        }
	    });
	    useri.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	    useri.setForeground(Color.BLACK);
	    useri.addMouseListener(this);
	    useri.setFont(new Font("楷体", Font.BOLD, 28));
		useri.setBounds(40, 180, 154, 59);
		
		orders = new JLabel("我的订单");
		orders.setHorizontalAlignment(SwingConstants.CENTER);
		orders.addMouseListener(new MouseAdapter() 
		{
	        @Override
	        public void mouseEntered(MouseEvent arg0)
	        {
	        	orders.setForeground(new Color(255, 0, 0));
	        }
	        @Override
	        public void mouseExited(MouseEvent e)
	        {
	        	orders.setForeground(Color.BLACK);
	        }
	    });
		orders.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		orders.setForeground(Color.BLACK);
		orders.addMouseListener(this);
		orders.setFont(new Font("楷体", Font.BOLD, 28));
		orders.setBounds(40, 330, 154, 59);
		
		exit = new JLabel("退出系统");
		exit.setHorizontalAlignment(SwingConstants.CENTER);
		exit.addMouseListener(new MouseAdapter() 
		{
	        @Override
	        public void mouseEntered(MouseEvent arg0)
	        {
	        	exit.setForeground(new Color(255, 0, 0));	        	
	        }
	        @Override
	        public void mouseExited(MouseEvent e)
	        {
	        	exit.setForeground(Color.BLACK);
	        }
	    });
		exit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		exit.setForeground(Color.BLACK);
		exit.addMouseListener(this);
		exit.setFont(new Font("楷体", Font.BOLD, 28));
		exit.setBounds(40, 470, 154, 59);
		getContentPane().add(exit);
		
		String a="3排05座";       //-------------------------------------------------------
		
		u1 = new JLabel();	  //订单编号		
		List<cn.bean.Orders> list1=ordersDao.findOrdersBySid(a);
		for(cn.bean.Orders or:list1)
		{
			u1.setText(""+or.getId());
		}	
		u1.setBackground(Color.LIGHT_GRAY);
		u1.setHorizontalAlignment(SwingConstants.CENTER);
		u1.setFont(new Font("楷体", Font.PLAIN, 21));
		u1.setBounds(587, 160, 109, 28);
		getContentPane().add(u1);
		
		u2 = new JLabel();		//电影名
		List<cn.bean.Film> list2=filmDao.findFilmScreeningsById(a);
		for(cn.bean.Film f:list2)
		{
			u2.setText(f.getName());
		}
		u2.setBackground(Color.LIGHT_GRAY);
		u2.setHorizontalAlignment(SwingConstants.LEFT);
		u2.setFont(new Font("楷体", Font.PLAIN, 21));
		u2.setBounds(563, 205, 239, 28);
		getContentPane().add(u2);
		
		u3 = new JLabel();		//语言版本
		List<Screenings> list3=screeningsDao.findScrByOrdersId(a);
		for(Screenings s:list3)
		{
			u3.setText(s.getLanguage());
		}		
		u3.setBackground(Color.LIGHT_GRAY);
		u3.setHorizontalAlignment(SwingConstants.CENTER);
		u3.setFont(new Font("楷体", Font.PLAIN, 21));
		u3.setBounds(587, 250, 109, 28);
		getContentPane().add(u3);
		
		u4 = new JLabel();		//放映时间
		List<Screenings> list4=screeningsDao.findScByOrdersId(a);
		for(Screenings s:list4)
		{
			u4.setText(s.getPlaytime());
		}		
		u4.setBackground(Color.LIGHT_GRAY);
		u4.setHorizontalAlignment(SwingConstants.LEFT);
		u4.setFont(new Font("楷体", Font.PLAIN, 21));
		u4.setBounds(563, 295, 239, 28);
		getContentPane().add(u4);
		
		u5 = new JLabel();		//放映厅
		List<VideoHall> list5=videohallDao.findOrdersVideoHallById(a);
		for(VideoHall v:list5)
		{
			u5.setText(v.getName());
		}
		u5.setBackground(Color.LIGHT_GRAY);
		u5.setHorizontalAlignment(SwingConstants.CENTER);
		u5.setFont(new Font("楷体", Font.PLAIN, 21));
		u5.setBounds(587, 340, 109, 28);
		getContentPane().add(u5);
		
		u6 = new JLabel();		//场次
		List<Screenings> list6=screeningsDao.findScreByOrdersId(a);
		for(Screenings s:list6)
		{
			u6.setText(""+s.getId());
		}		
		u6.setBackground(Color.LIGHT_GRAY);
		u6.setHorizontalAlignment(SwingConstants.CENTER);
		u6.setFont(new Font("楷体", Font.PLAIN, 21));
		u6.setBounds(587, 385, 109, 28);
		getContentPane().add(u6);
		
		u7 = new JLabel();		//座位		
		u7.setText(""+a);
		u7.setBackground(Color.LIGHT_GRAY);
		u7.setHorizontalAlignment(SwingConstants.CENTER);
		u7.setFont(new Font("楷体", Font.PLAIN, 21));
		u7.setBounds(587, 430, 109, 28);
		getContentPane().add(u7);
		
		u8 = new JLabel();		//价格
		List<Screenings> list8=screeningsDao.findScreenByOrdersId(a);
		for(Screenings s:list8)
		{
			u8.setText(""+s.getPrice()+"元");
		}			
		u8.setBackground(Color.LIGHT_GRAY);
		u8.setHorizontalAlignment(SwingConstants.CENTER);
		u8.setFont(new Font("楷体", Font.PLAIN, 21));
		u8.setBounds(587, 475, 109, 28);
		getContentPane().add(u8);
		
		u9 = new JLabel();		//交易时间
		List<cn.bean.Orders> list9=ordersDao.findOrdersById(a);
		for(cn.bean.Orders o:list9)
		{
			u9.setText(o.getPaytime());
		}		
		u9.setBackground(Color.LIGHT_GRAY);
		u9.setHorizontalAlignment(SwingConstants.LEFT);
		u9.setFont(new Font("楷体", Font.PLAIN, 21));
		u9.setBounds(563, 520, 239, 28);
		getContentPane().add(u9);
		
		ordersid = new JLabel("订单编号");
		ordersid.setFont(new Font("楷体", Font.PLAIN, 20));
		ordersid.setHorizontalAlignment(SwingConstants.CENTER);
		ordersid.setBounds(396, 160, 109, 28);
		getContentPane().add(ordersid);
		
		filmname = new JLabel("电 影 名");
		filmname.setFont(new Font("楷体", Font.PLAIN, 20));
		filmname.setHorizontalAlignment(SwingConstants.CENTER);
		filmname.setBounds(396, 205, 109, 28);
		getContentPane().add(filmname);
		
		language = new JLabel("语言版本");
		language.setFont(new Font("楷体", Font.PLAIN, 20));
		language.setHorizontalAlignment(SwingConstants.CENTER);
		language.setBounds(396, 250, 109, 28);
		getContentPane().add(language);
		
		playtime = new JLabel("放映时间");
		playtime.setFont(new Font("楷体", Font.PLAIN, 20));
		playtime.setHorizontalAlignment(SwingConstants.CENTER);
		playtime.setBounds(396, 295, 109, 28);
		getContentPane().add(playtime);
		
		videohall= new JLabel("放 映 厅");
		videohall.setFont(new Font("楷体", Font.PLAIN, 20));
		videohall.setHorizontalAlignment(SwingConstants.CENTER);
		videohall.setBounds(396, 340, 109, 28);
		getContentPane().add(videohall);
		
		screenings = new JLabel("场    次");
		screenings.setFont(new Font("楷体", Font.PLAIN, 20));
		screenings.setHorizontalAlignment(SwingConstants.CENTER);
		screenings.setBounds(396, 385, 109, 28);
		getContentPane().add(screenings);
		
		seat = new JLabel("座    位");
		seat.setFont(new Font("楷体", Font.PLAIN, 20));
		seat.setHorizontalAlignment(SwingConstants.CENTER);
		seat.setBounds(396, 430, 109, 28);
		getContentPane().add(seat);
		
		price = new JLabel("价    格");
		price.setFont(new Font("楷体", Font.PLAIN, 20));
		price.setHorizontalAlignment(SwingConstants.CENTER);
		price.setBounds(396, 475, 109, 28);
		getContentPane().add(price);
		
		paytime = new JLabel("交易时间");
		paytime.setFont(new Font("楷体", Font.PLAIN, 20));
		paytime.setHorizontalAlignment(SwingConstants.CENTER);
		paytime.setBounds(396, 520, 109, 28);
		getContentPane().add(paytime);
		
		mb1 = new JPanel();
		mb1.setBounds(10, 140, 223, 437);
				
		getContentPane().add(logo);	
		getContentPane().add(homepage);
		getContentPane().add(film);
        getContentPane().add(cinema);
        getContentPane().add(login);
        getContentPane().add(mb);
        getContentPane().add(useri);
        getContentPane().add(orders);
        getContentPane().add(exit);
        getContentPane().add(mb1);
           
		this.setTitle("我的订单");
		this.setFont(new Font("楷体", Font.PLAIN, 10));
		this.setBounds(228, 39, 906, 639);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
		getContentPane().setLayout(null);							
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==logo||e.getSource()==homepage)
		{
			this.dispose();
			new cn.userbiz.HomePage();
		}
		else if(e.getSource()==useri)
		{
			this.dispose();
			new MyView();
		}
		else if(e.getSource()==film)
		{
			this.dispose();
			new Film();
		}
		else if(e.getSource()==cinema)
		{
			this.dispose();
			new Cinema();
		}
		else if(e.getSource()==login)
		{
			this.dispose();
			new MyView();
		}
		else if(e.getSource()==exit)
		{	
			if(JOptionPane.showConfirmDialog(null, "您确定要退出系统吗?","退出提示",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
			{
			 System.exit(0);
			}						
		}		
		else if(e.getSource()==orders)
		{
			this.dispose();
			new Orders();
		}
	}
	@Override
	public void mouseEntered(MouseEvent e)
	{}
	@Override
	public void mouseExited(MouseEvent e)
	{}
	@Override
	public void mousePressed(MouseEvent e)
	{}
	@Override
	public void mouseReleased(MouseEvent e)
	{}
}
