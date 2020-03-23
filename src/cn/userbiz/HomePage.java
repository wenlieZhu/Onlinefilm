package cn.userbiz;
import java.awt.*;
import java.awt.event.*;
import java.util.List;

import javax.swing.*;

import cn.bean.FilmType;
import cn.dao.FilmDao;
import cn.dao.FilmTypeDao;
import cn.dao.impl.FilmDaoImpl;
import cn.dao.impl.FilmTypeDaoImpl;
@SuppressWarnings("all")

public class HomePage extends JFrame implements MouseListener
{
	FilmDao filmDao=new FilmDaoImpl();
	FilmTypeDao filmtypeDao=new FilmTypeDaoImpl();
	JLabel logo,homepage,film,cinema,login;
	JPanel mb;
	
	JLabel hot,all,t1,t2,t3;
	
	JLabel b1,b2,b3;
	JPanel mb1,mb2,mb3;
	
	ImageIcon image,image1,image2,image3;
	Image img;
	public static void main(String[] args)
	{
		HomePage h= new HomePage();
	}
	public HomePage()
	{
		homepage = new JLabel("首页");
		film = new JLabel("电影");
		cinema = new JLabel("影院");
		login = new JLabel("我的信息");
		mb = new JPanel();
		
		hot = new JLabel("正在热映：");
		all = new JLabel("全部>");
		
		b1 = new JLabel("购票");
		b2 = new JLabel("购票");
		b3 = new JLabel("购票");
		mb1 = new JPanel();
		mb2 = new JPanel();
		mb3 = new JPanel();
		
		image1 = new ImageIcon("image/dlds.jpg");
		img = image1.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image1.setImage(img);
		
		image2 = new ImageIcon("image/wbsys.jpg");
		img = image2.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image2.setImage(img);
		
		image3 = new ImageIcon("image/xbyz.jpg");
		img = image3.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image3.setImage(img);
		
		image = new ImageIcon("image/logo.png");
		img = image.getImage();
        img = img.getScaledInstance(177, 72, Image.SCALE_DEFAULT); 
        image.setImage(img);
        logo = new JLabel(image);
        logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logo.setBounds(10, 4, 177, 72);
        logo.addMouseListener(this);
        
        homepage.setHorizontalAlignment(SwingConstants.CENTER);
        homepage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homepage.setForeground(new Color(255, 0, 0));
        homepage.addMouseListener(this);
        homepage.setFont(new Font("宋体", Font.BOLD, 23));
        homepage.setBounds(196, 10, 92, 66);
        
        film.setHorizontalAlignment(SwingConstants.CENTER);
        film.addMouseListener(this);
        film.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		film.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		film.setForeground(Color.BLACK);
        	}
        });
        film.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        film.setForeground(Color.BLACK);
        film.setFont(new Font("宋体", Font.BOLD, 23));
        film.setBounds(391, 10, 81, 66);
        
        cinema.setHorizontalAlignment(SwingConstants.CENTER);
        cinema.addMouseListener(this);

        cinema.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		cinema.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		cinema.setForeground(Color.BLACK);
        	}
        });
        cinema.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cinema.setForeground(Color.BLACK);
        cinema.setFont(new Font("宋体", Font.BOLD, 23));
        cinema.setBounds(583, 10, 86, 66);
        
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        login.setForeground(new Color(0, 0, 255));
        login.setFont(new Font("微软雅黑", Font.BOLD, 21));
        login.setBounds(727, 10, 134, 66);
        login.addMouseListener(this);
       
        mb.setBackground(Color.WHITE);
        mb.setBounds(10, 10, 880, 72);
        
        hot.setFont(new Font("微软雅黑 Light", Font.BOLD, 22));
        hot.setForeground(Color.RED);
        hot.setHorizontalAlignment(SwingConstants.CENTER);
        hot.setBounds(10, 86, 119, 35);
        
        all.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        all.addMouseListener(this);
        all.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		all.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		all.setForeground(Color.BLUE);
        	}
        });
        all.setForeground(Color.BLUE);
        all.setFont(new Font("宋体", Font.BOLD, 22));
        all.setBounds(759, 87, 81, 35);
        
        image = new ImageIcon("image/1.jpg");
        img = image.getImage();
        img = img.getScaledInstance(278, 415, Image.SCALE_DEFAULT); 
        image.setImage(img);
        t1 = new JLabel(image);
        t1.addMouseListener(this);
        t1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t1.setBounds(10, 130, 278, 415);
        
        image = new ImageIcon("image/2.jpg");
        img = image.getImage();
        img = img.getScaledInstance(278, 415, Image.SCALE_DEFAULT); 
        image.setImage(img); 
        t2 = new JLabel(image);
        t2.addMouseListener(this);
        t2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t2.setBounds(305, 130, 278, 415);
        
        image = new ImageIcon("image/3.jpg");
        img = image.getImage();
        img = img.getScaledInstance(278, 415, Image.SCALE_DEFAULT); 
        image.setImage(img); 
        t3 = new JLabel(image);
        t3.addMouseListener(this);
        t3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        t3.setBounds(602, 130, 278, 415);
        
        mb1.setBackground(Color.WHITE);
        mb1.setBounds(10, 544, 278, 35);
        
        mb2.setBackground(Color.WHITE);
        mb2.setBounds(305, 544, 278, 35);
        
        mb3.setBackground(Color.WHITE);
        mb3.setBounds(602, 544, 278, 35);
        
        b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b1.setFont(new Font("微软雅黑", Font.BOLD, 16));
        b1.addMouseListener(this);
        b1.setForeground(Color.RED);
        
        b2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b2.setFont(new Font("微软雅黑", Font.BOLD, 16));
        b2.addMouseListener(this);
        b2.setForeground(Color.RED);
        
        b3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        b3.setFont(new Font("微软雅黑", Font.BOLD, 16));
        b3.addMouseListener(this);
        b3.setForeground(Color.RED);
        
        mb1.add(b1);mb2.add(b2);mb3.add(b3);
        
        this.add(logo);	this.add(homepage);this.add(film);
        this.add(cinema);this.add(login);this.add(mb);
        
        this.add(hot);this.add(all);this.add(t1);
        this.add(t2);this.add(t3);this.add(mb1);
        this.add(mb2);this.add(mb3);
        
        this.setTitle("首页");
		this.setBounds(228, 39, 906, 639);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==logo||e.getSource()==homepage)
		{
			this.dispose();
			new HomePage();
		}else if(e.getSource()==login)
		{
			this.dispose();
			new MyView();
		}else if(e.getSource()==film)
		{
			this.dispose();
			new Film();
		}else if(e.getSource()==cinema)
		{
			this.dispose();
			new Cinema();
		}else if(e.getSource()==b1||e.getSource()==t1)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(12);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(12);
			for(cn.bean.Film ft:list)
			{
				String a = ft.getName();
				String b = ft.getActor();
				String c = ft.getIntroduce();
				double a1 = ft.getGrade();
				d.mb1.setText(a);
				d.mb3.setText(b);
				d.mb4.setText(c);
				d.mb5.setText(""+a1);
			}
			d.tp.setIcon(image1);
			this.dispose();
		}else if(e.getSource()==b2||e.getSource()==t2)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(5);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(5);
			for(cn.bean.Film ft:list)
			{
				String a = ft.getName();
				String b = ft.getActor();
				String c = ft.getIntroduce();
				double a1 = ft.getGrade();
				d.mb1.setText(a);
				d.mb3.setText(b);
				d.mb4.setText(c);
				d.mb5.setText(""+a1);
			}
			d.tp.setIcon(image2);
			this.dispose();
		}else if(e.getSource()==b3||e.getSource()==t3)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(9);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(9);
			for(cn.bean.Film ft:list)
			{
				String a = ft.getName();
				String b = ft.getActor();
				String c = ft.getIntroduce();
				double a1 = ft.getGrade();
				d.mb1.setText(a);
				d.mb3.setText(b);
				d.mb4.setText(c);
				d.mb5.setText(""+a1);
			}
			d.tp.setIcon(image3);
			this.dispose();
		}
		
		else if(e.getSource()==all)
		{
			this.dispose();
			new Film();
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
