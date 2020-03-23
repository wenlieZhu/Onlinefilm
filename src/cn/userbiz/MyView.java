package cn.userbiz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import cn.bean.User;
import cn.dao.UserDao;
import cn.dao.impl.UserDaoImpl;
import cn.visitorbiz.Login;
import javax.swing.JButton;

@SuppressWarnings("all")
public class MyView extends JFrame implements MouseListener
{	
	JLabel logo,homepage,film,cinema,login,useri,orders,exit,u1,u2,u4;
	JLabel uid,uname,upassword,phone;
	JPanel mb,mb1,mb2;
	JButton btn1,btn2;
	
	ImageIcon image;
	Image img;
	
	private JTextField u3;
	UserDao userDao=new UserDaoImpl();	

	public static void main(String[] args)
	{
		User user;
		MyView myview = new MyView();		
	}
	public MyView()
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
        mb.setBounds(10, 10, 870, 72);
		
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
	    useri.setFont(new Font("宋体", Font.BOLD, 28));
		useri.setBounds(40, 181, 154, 59);
		
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
		orders.setFont(new Font("宋体", Font.BOLD, 28));
		orders.setBounds(40, 310, 154, 59);
		
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
		exit.setFont(new Font("宋体", Font.BOLD, 28));
		exit.setBounds(40, 445, 154, 59);
		getContentPane().add(exit);
			
		u1 = new JLabel();
		Integer a = Login.user.getId();
		u1.setText(""+a);
		u1.setBackground(Color.LIGHT_GRAY);
		u1.setHorizontalAlignment(SwingConstants.CENTER);
		u1.setBounds(587, 189, 109, 47);
		getContentPane().add(u1);		
		
		u2 = new JLabel();
		u2.setText(Login.user.getName());
		u2.setBackground(Color.LIGHT_GRAY);
		u2.setHorizontalAlignment(SwingConstants.CENTER);
		u2.setBounds(587, 269, 109, 47);
		getContentPane().add(u2);
		
		u3 = new JTextField();
		u3.setText(Login.user.getPhone());
		u3.setBackground(Color.LIGHT_GRAY);
		u3.setHorizontalAlignment(SwingConstants.CENTER);
		u3.setBounds(587, 355, 109, 47);
		getContentPane().add(u3);
		u3.setColumns(10);
		
		u4 = new JLabel();
		u4.setText(Login.user.getPassword());
		u4.setBackground(Color.LIGHT_GRAY);
		u4.setHorizontalAlignment(SwingConstants.CENTER);
		u4.setBounds(587, 432, 109, 47);
		getContentPane().add(u4);
		
		uid = new JLabel("用户编号");
		uid.setFont(new Font("宋体", Font.PLAIN, 18));
		uid.setHorizontalAlignment(SwingConstants.CENTER);
		uid.setBounds(396, 187, 109, 47);
		getContentPane().add(uid);
		
		uname = new JLabel("用户昵称");
		uname.setFont(new Font("宋体", Font.PLAIN, 18));
		uname.setHorizontalAlignment(SwingConstants.CENTER);
		uname.setBounds(396, 267, 109, 47);
		getContentPane().add(uname);
		
		upassword = new JLabel("密    码");
		upassword.setFont(new Font("宋体", Font.PLAIN, 18));
		upassword.setHorizontalAlignment(SwingConstants.CENTER);
		upassword.setBounds(396, 353, 109, 47);
		getContentPane().add(upassword);
		
		phone = new JLabel("联系电话");
		phone.setFont(new Font("宋体", Font.PLAIN, 18));
		phone.setHorizontalAlignment(SwingConstants.CENTER);
		phone.setBounds(396, 430, 109, 47);
		getContentPane().add(phone);
		
		mb1 = new JPanel();
		mb1.setBounds(10, 141, 223, 437);

		btn1 = new JButton("保存并修改");
		btn1.setBounds(396, 526, 109, 27);
		btn1.addMouseListener(this);
		getContentPane().add(btn1);
        	
		btn2 = new JButton("取消");
		btn2.setBounds(583, 526, 113, 27);
		getContentPane().add(btn2);	
		
		mb2 = new JPanel();
		mb2.setBounds(304, 141, 526, 437);
		
		
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
        getContentPane().add(mb2);
          
		this.setTitle("我的信息");
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
			new HomePage();
		}
		else if(e.getSource()==login)
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
		else if(e.getSource()==exit)
		{
			if(JOptionPane.showConfirmDialog(null, "您确定要退出系统吗?","退出提示",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
			{
			 System.exit(0);
			}
		}
		else if(e.getSource()==btn1)
		{			
			try 
			{
				int a = Login.user.getId();
				u1.setText(""+a);
				User u = userDao.findUserById(a);
				String sql = "select id from user";
				String t2= u2.getText().toString();
				String t3=u3.getText().toString();
				String t4=u4.getText().toString();                      
				if(t2.equals("")||t3.equals("")||t4.equals(""))
				{
					JOptionPane.showMessageDialog(null, "密码不能为空","提示",JOptionPane.ERROR_MESSAGE);
				}							
				else
				{
					userDao.updatePassword(a,t3);
					if(JOptionPane.showConfirmDialog(null, "您确定要修改吗?","修改提示",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION)
					{
						JOptionPane.showMessageDialog(null, "修改成功","提示",JOptionPane.OK_OPTION);
						this.dispose();
		           	 	new Login();
					}
				}
			}
			catch(Exception a)
			{
			}
		}
		else if(e.getSource()==orders)
		{
			this.dispose();
			new Orders();
		}
	}
	@Override
	public void mouseEntered(MouseEvent arg0)
	{}
	@Override
	public void mouseExited(MouseEvent arg0)
	{}
	@Override
	public void mousePressed(MouseEvent e)
	{}
	@Override
	public void mouseReleased(MouseEvent e)
	{}
}
