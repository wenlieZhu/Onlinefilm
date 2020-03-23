package cn.userbiz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import cn.dao.FilmDao;
import cn.dao.impl.FilmDaoImpl;

@SuppressWarnings("all")
public class Detail extends JFrame implements MouseListener
{
	public static Film f;
	FilmDao filmDao = new FilmDaoImpl();
	JLabel logo,homepage,film,cinema,login;
	JPanel mb;
	static JLabel tp;
	JLabel name,type,person,introduce,score;
	static JLabel mb1,mb2,mb3,mb4,mb5;
	JButton buy;
	ImageIcon image;
	Image img;
	public Detail()
	{
		homepage = new JLabel("首页");
		film = new JLabel("电影");
		cinema = new JLabel("影院");
		login = new JLabel("我的信息");
		mb = new JPanel();
		
		tp = new JLabel();
		name = new JLabel("电影名称:");
		type = new JLabel("电影类型:");
		person = new JLabel("主演:");
		introduce = new JLabel("简介:");
		score = new JLabel("评分:");
		mb1 = new JLabel();
		mb2 = new JLabel();
		mb3 = new JLabel();
		mb4 = new JLabel();
		mb5 = new JLabel();
		buy = new JButton("特惠购票");
		
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
        homepage.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		homepage.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		homepage.setForeground(Color.BLACK);
        	}
        });
        homepage.setForeground(Color.BLACK);
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
        
        tp.setHorizontalAlignment(SwingConstants.CENTER);
		tp.setBounds(28, 150, 295, 403);
		
		name.setFont(new Font("微软雅黑", Font.BOLD, 16));
		name.setHorizontalAlignment(SwingConstants.CENTER);
		name.setBounds(333, 183, 84, 28);
		
		type.setHorizontalAlignment(SwingConstants.CENTER);
		type.setFont(new Font("微软雅黑", Font.BOLD, 16));
		type.setBounds(333, 251, 84, 28);
		
		person.setHorizontalAlignment(SwingConstants.CENTER);
		person.setFont(new Font("微软雅黑", Font.BOLD, 16));
		person.setBounds(350, 321, 67, 28);
		
		introduce.setHorizontalAlignment(SwingConstants.CENTER);
		introduce.setFont(new Font("微软雅黑", Font.BOLD, 16));
		introduce.setBounds(350, 386, 67, 28);
		
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setFont(new Font("微软雅黑", Font.BOLD, 16));
		score.setBounds(350, 455, 67, 28);
		
		
		mb1.setOpaque(true);
		mb2.setOpaque(true);
		mb3.setOpaque(true);
		mb4.setOpaque(true);
		mb5.setOpaque(true);
		mb1.setHorizontalAlignment(SwingConstants.CENTER);
		mb2.setHorizontalAlignment(SwingConstants.CENTER);
		mb3.setHorizontalAlignment(SwingConstants.CENTER);
		mb4.setHorizontalAlignment(SwingConstants.CENTER);
		mb5.setHorizontalAlignment(SwingConstants.CENTER);

		mb1.setBackground(Color.WHITE);
		mb2.setBackground(Color.WHITE);
		mb3.setBackground(Color.WHITE);
		mb4.setBackground(Color.WHITE);
		mb5.setBackground(Color.WHITE);

		
		mb1.setBounds(416, 168, 253, 50);
		mb1.setFont(new Font("微软雅黑", Font.BOLD, 16));
		mb2.setFont(new Font("微软雅黑", Font.BOLD, 16));
		mb3.setFont(new Font("微软雅黑", Font.BOLD, 16));
		mb4.setFont(new Font("微软雅黑", Font.BOLD, 16));
		mb5.setFont(new Font("微软雅黑", Font.BOLD, 16));

		mb2.setBounds(416, 237, 253, 50);
		mb3.setBounds(416, 310, 253, 50);
		mb4.setBounds(416, 379, 253, 50);
		mb5.setBounds(416, 450, 92, 35);
		
		buy.setBackground(new Color(255, 0, 0));
		buy.addMouseListener(this);
		buy.setForeground(Color.WHITE);
		buy.setFont(new Font("宋体", Font.BOLD, 25));
		buy.setBounds(416, 523, 253, 42);
		
		this.add(logo);	this.add(homepage);this.add(film);
        this.add(cinema);this.add(login);this.add(mb);
        this.add(tp);this.add(name);this.add(type);
        this.add(person);this.add(introduce);this.add(score);
        this.add(mb1);this.add(mb2);this.add(mb3);
        this.add(mb4);this.add(mb5);this.add(buy);
        
        this.setTitle("电影详细");
		this.setBounds(228, 39, 906, 639);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
	}
	public static void main(String[] args)
	{
		Detail d = new Detail();
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
		}else if(e.getSource()==buy)
		{
			mb1.setOpaque(false);
			mb2.setOpaque(false);
			mb3.setOpaque(false);
			mb4.setOpaque(false);
			mb5.setOpaque(false);
			this.dispose();
			new BuyTicket();
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
