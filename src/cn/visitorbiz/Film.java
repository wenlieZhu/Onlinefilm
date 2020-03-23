package cn.visitorbiz;

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

public class Film extends JFrame implements MouseListener
{
	FilmDao filmDao=new FilmDaoImpl();
	FilmTypeDao filmtypeDao=new FilmTypeDaoImpl();

	public static cn.bean.Film f;
	
	JLabel logo, homepage, film, cinema, login;
	JPanel mb;

	JLabel city, area, type;
	JLabel q1,q2,q3,q4,q5;

	JLabel t1, t2, t3, t4;
	JLabel n1, n2, n3, n4;
	JLabel s1, s2, s3, s4;
	JPanel mb1;

	JLabel hhxd,mcgj,mzt,wbsys,ndmz,xbyz,zl2,dlds;
	
	ImageIcon image,image1,image2,image3,image4,image5,image6,image7,image8,image9,image10,image11,image12;
	Image img;
	private JLabel shai;
	private JLabel gz;
	private JLabel beijing;
	private JLabel kehuan;
	private JLabel dongzuo;
	private JLabel xiju;
	private JLabel dongman;
	private JLabel zhanzheng;
	private JLabel kb;

	public static void main(String[] args)
	{
		Film f = new Film();
	}

	public Film()
	{
		homepage = new JLabel("首页");
		film = new JLabel("电影");
		cinema = new JLabel("影院");
		login = new JLabel("登录/注册");
		mb = new JPanel();

		city = new JLabel("城市:");
		city.setForeground(Color.LIGHT_GRAY);

		beijing = new JLabel("北京");
		shai = new JLabel("上海");
		gz = new JLabel("广州");
		kehuan = new JLabel("科幻");
		dongman = new JLabel("动漫");
		zhanzheng = new JLabel("战争");
		xiju = new JLabel("喜剧");
		kb = new JLabel("恐怖");
		dongzuo = new JLabel("动作");
		
		q1 = new JLabel("东城区");
		q2 = new JLabel("丰台区");
		q3 = new JLabel("西城区");
		q4 = new JLabel("朝阳区");
		q5 = new JLabel("海淀区");

		area = new JLabel("区域:");
		area.setForeground(Color.LIGHT_GRAY);
		type = new JLabel("类型:");
		type.setForeground(Color.LIGHT_GRAY);

//		t1 = new JLabel("图1");
		t2 = new JLabel("图2");
		t3 = new JLabel("图3");
		t4 = new JLabel("图4");

		n1 = new JLabel("红海行动");
		n1.setHorizontalAlignment(SwingConstants.CENTER);
		n2 = new JLabel("战狼2");

		n3 = new JLabel("邪不压正");
		n4 = new JLabel("狂暴巨兽");
		s1 = new JLabel("8.6");
		s2 = new JLabel("8.8");
		s3 = new JLabel("7.4");
		s4 = new JLabel("9.0");

		image = new ImageIcon("image/logo.png");
		img = image.getImage();
		img = img.getScaledInstance(177, 72, Image.SCALE_DEFAULT);
		image.setImage(img);
		logo = new JLabel(image);
		logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logo.setBounds(10, 4, 177, 72);
		logo.addMouseListener(this);

		homepage.setHorizontalAlignment(SwingConstants.CENTER);
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
		homepage.setBounds(196, 10, 92, 66);

		film.setHorizontalAlignment(SwingConstants.CENTER);
		film.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		film.setForeground(new Color(255, 0, 0));
		film.addMouseListener(this);
		film.setFont(new Font("宋体", Font.BOLD, 23));
		film.setBounds(391, 10, 81, 66);

		cinema.setHorizontalAlignment(SwingConstants.CENTER);
		cinema.addMouseListener(this);
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
		cinema.setFont(new Font("宋体", Font.BOLD, 23));
		cinema.setBounds(583, 10, 86, 66);

		login.setHorizontalAlignment(SwingConstants.CENTER);
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login.setForeground(new Color(0, 0, 255));
		login.setFont(new Font("微软雅黑", Font.BOLD, 21));
		login.setBounds(727, 10, 134, 66);
		login.addMouseListener(this);

		mb.setBackground(Color.WHITE);
		mb.setBounds(10, 10, 870, 72);

		city.setHorizontalAlignment(SwingConstants.CENTER);
		city.setFont(new Font("微软雅黑", Font.BOLD, 16));
		city.setBounds(41, 127, 92, 35);

		area.setHorizontalAlignment(SwingConstants.CENTER);
		area.setFont(new Font("微软雅黑", Font.BOLD, 16));
		area.setBounds(41, 203, 92, 35);

		type.setHorizontalAlignment(SwingConstants.CENTER);
		type.setFont(new Font("微软雅黑", Font.BOLD, 16));
		type.setBounds(41, 278, 92, 35);

		beijing.setHorizontalAlignment(SwingConstants.CENTER);
		beijing.addMouseListener(this);
		beijing.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				beijing.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				beijing.setForeground(Color.BLACK);
			}
		});
		beijing.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		beijing.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		beijing.setBounds(119, 132, 54, 24);

		shai.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		shai.addMouseListener(this);
		shai.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				shai.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				shai.setForeground(Color.BLACK);
			}
		});
		shai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		shai.setHorizontalAlignment(SwingConstants.CENTER);
		shai.setBounds(196, 132, 54, 24);

		gz.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		gz.addMouseListener(this);
		gz.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				gz.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				gz.setForeground(Color.BLACK);
			}
		});
		gz.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		gz.setHorizontalAlignment(SwingConstants.CENTER);
		gz.setBounds(271, 132, 54, 24);

		q1.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		q1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				q1.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				q1.setForeground(Color.BLACK);
			}
		});
		q1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		q1.setHorizontalAlignment(SwingConstants.CENTER);
		q1.setBounds(119, 208, 64, 24);
		
		q2.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		q2.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				q2.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				q2.setForeground(Color.BLACK);
			}
		});
		q2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		q2.setHorizontalAlignment(SwingConstants.CENTER);
		q2.setBounds(196, 208, 54, 24);
		
		q3.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		q3.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				q3.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				q3.setForeground(Color.BLACK);
			}
		});
		q3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		q3.setHorizontalAlignment(SwingConstants.CENTER);
		q3.setBounds(271, 208, 54, 24);
		
		q4.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		q4.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				q4.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				q4.setForeground(Color.BLACK);
			}
		});
		q4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		q4.setHorizontalAlignment(SwingConstants.CENTER);
		q4.setBounds(344, 208, 54, 24);
		
		q5.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		q5.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				q5.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				q5.setForeground(Color.BLACK);
			}
		});
		q5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		q5.setHorizontalAlignment(SwingConstants.CENTER);
		q5.setBounds(418, 208, 54, 24);
		
		
		kehuan.setHorizontalAlignment(SwingConstants.CENTER);
		kehuan.addMouseListener(this);
		kehuan.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				kehuan.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				kehuan.setForeground(Color.BLACK);
			}
		});
		kehuan.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		kehuan.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		kehuan.setBounds(119, 283, 54, 24);

		dongzuo.setHorizontalAlignment(SwingConstants.CENTER);
		dongzuo.addMouseListener(this);
		dongzuo.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				dongzuo.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				dongzuo.setForeground(Color.BLACK);
			}
		});
		dongzuo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dongzuo.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		dongzuo.setBounds(196, 283, 54, 24);

		xiju.setHorizontalAlignment(SwingConstants.CENTER);
		xiju.addMouseListener(this);
		xiju.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				xiju.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				xiju.setForeground(Color.BLACK);
			}
		});
		xiju.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		xiju.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		xiju.setBounds(271, 283, 54, 24);

		dongman.setHorizontalAlignment(SwingConstants.CENTER);
		dongman.addMouseListener(this);
		dongman.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				dongman.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				dongman.setForeground(Color.BLACK);
			}
		});
		dongman.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dongman.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		dongman.setBounds(357, 283, 54, 24);

		zhanzheng.setHorizontalAlignment(SwingConstants.CENTER);
		zhanzheng.addMouseListener(this);
		zhanzheng.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				zhanzheng.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				zhanzheng.setForeground(Color.BLACK);
			}
		});
		zhanzheng.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		zhanzheng.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		zhanzheng.setBounds(434, 283, 54, 24);

		kb.setHorizontalAlignment(SwingConstants.CENTER);
		kb.addMouseListener(this);
		kb.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseEntered(MouseEvent arg0)
			{
				kb.setForeground(new Color(255, 0, 0));
			}

			@Override
			public void mouseExited(MouseEvent e)
			{
				kb.setForeground(Color.BLACK);
			}
		});
		kb.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		kb.setFont(new Font("微软雅黑", Font.PLAIN, 16));
		kb.setBounds(509, 283, 54, 24);

		mb1 = new JPanel();
		mb1.setBackground(Color.WHITE);
		mb1.setBounds(52, 117, 797, 219);

		image1 = new ImageIcon("image/fcz.jpg");
		img = image1.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image1.setImage(img);
		t1 = new JLabel(image1);
		t1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t1.setBounds(65, 366, 174, 177);
		t1.addMouseListener(this);

		image2 = new ImageIcon("image/htpy.jpg");
		img = image2.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image2.setImage(img);
		t2 = new JLabel(image2);
		t2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t2.addMouseListener(this);
		t2.setBounds(270, 366, 174, 177);
		t2.setHorizontalAlignment(SwingConstants.CENTER);

		
		image3 = new ImageIcon("image/zljsj.jpg");
		img = image3.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image3.setImage(img);
		t3 = new JLabel(image3);
		t3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t3.addMouseListener(this);
		t3.setBounds(476, 366, 177, 174);
		t3.setHorizontalAlignment(SwingConstants.CENTER);

		image4 = new ImageIcon("image/kbjs.jpg");
		img = image4.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image4.setImage(img);
		t4 = new JLabel(image4);
		t4.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		t4.addMouseListener(this);
		t4.setBounds(680, 366, 177, 174);
		t4.setHorizontalAlignment(SwingConstants.CENTER);
		
		image5 = new ImageIcon("image/hhxd.jpg");
		img = image5.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image5.setImage(img);
		hhxd = new JLabel(image5);
		hhxd.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		hhxd.setBounds(65, 366, 174, 177);
		hhxd.addMouseListener(this);
		
		image6 = new ImageIcon("image/zl2.jpg");
		img = image6.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image6.setImage(img);
		zl2 = new JLabel(image6);
		zl2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		zl2.setBounds(270, 366, 174, 177);
		zl2.addMouseListener(this);
		
		image7 = new ImageIcon("image/xbyz.jpg");
		img = image7.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image7.setImage(img);
		xbyz = new JLabel(image7);
		xbyz.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		xbyz.addMouseListener(this);
		xbyz.setBounds(476, 366, 177, 174);
		xbyz.setHorizontalAlignment(SwingConstants.CENTER);
		
		image8 = new ImageIcon("image/wbsys.jpg");
		img = image8.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image8.setImage(img);
		wbsys = new JLabel(image8);
		wbsys.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		wbsys.setBounds(65, 366, 174, 177);
		wbsys.addMouseListener(this);
		
		image9 = new ImageIcon("image/mcgj.jpg");
		img = image9.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image9.setImage(img);
		mcgj = new JLabel(image9);
		mcgj.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mcgj.setBounds(270, 366, 174, 177);
		mcgj.addMouseListener(this);
		
		image10 = new ImageIcon("image/mzt.jpg");
		img = image10.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image10.setImage(img);
		mzt = new JLabel(image10);
		mzt.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mzt.setBounds(65, 366, 174, 177);
		mzt.addMouseListener(this);
		
		image11 = new ImageIcon("image/ndmz.jpg");
		img = image11.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image11.setImage(img);
		ndmz = new JLabel(image11);
		ndmz.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ndmz.setBounds(270, 366, 174, 177);
		ndmz.addMouseListener(this);
		
		image12 = new ImageIcon("image/dlds.jpg");
		img = image12.getImage();
		img = img.getScaledInstance(174, 177, Image.SCALE_DEFAULT);
		image12.setImage(img);
		dlds = new JLabel(image12);
		dlds.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dlds.addMouseListener(this);
		dlds.setBounds(476, 366, 177, 174);
		dlds.setHorizontalAlignment(SwingConstants.CENTER);

		n1.setBounds(65, 550, 180, 15);
		n2.setBounds(338, 550, 180, 15);
		n3.setBounds(539, 550, 180, 15);
		n4.setBounds(743, 550, 180, 15);

		s1.setForeground(Color.black);
		s1.setBounds(128, 575, 45, 15);

		s1.setHorizontalAlignment(SwingConstants.CENTER);

		s2.setForeground(Color.black);
		s2.setBounds(330, 575, 54, 15);
		s2.setHorizontalAlignment(SwingConstants.CENTER);

		s3.setForeground(Color.black);
		s3.setBounds(539, 575, 54, 15);
		s3.setHorizontalAlignment(SwingConstants.CENTER);

		s4.setForeground(Color.black);
		s4.setBounds(743, 575, 54, 15);
		s4.setHorizontalAlignment(SwingConstants.CENTER);

		getContentPane().add(logo);		getContentPane().add(homepage);		getContentPane().add(film);
		getContentPane().add(cinema);		getContentPane().add(login);		getContentPane().add(beijing);
		getContentPane().add(shai);		getContentPane().add(gz);		getContentPane().add(kb);
		getContentPane().add(q1);	getContentPane().add(q2);	getContentPane().add(q3);	getContentPane().add(q4);	getContentPane().add(q5);
		getContentPane().add(dongzuo);		getContentPane().add(zhanzheng);		getContentPane().add(xiju);
		getContentPane().add(dongman);		getContentPane().add(kehuan);		getContentPane().add(mb);

		getContentPane().add(city);	getContentPane().add(area);	getContentPane().add(type);	getContentPane().add(mb1);
		getContentPane().add(hhxd); getContentPane().add(zl2);	getContentPane().add(xbyz); getContentPane().add(wbsys);
		getContentPane().add(mcgj);getContentPane().add(ndmz);getContentPane().add(mzt);getContentPane().add(dlds);
		

		getContentPane().add(t1);	getContentPane().add(t2);	getContentPane().add(t3);	getContentPane().add(t4);
		getContentPane().add(n1);	
		getContentPane().add(n2);	getContentPane().add(n3);	getContentPane().add(n4);
		getContentPane().add(s1);	getContentPane().add(s2);	getContentPane().add(s3);	getContentPane().add(s4);
		this.setTitle("电影");
		this.setBounds(228, 39, 906, 639);
		getContentPane().setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);

	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		if (e.getSource() == logo || e.getSource() == homepage)
		{
			this.dispose();
			new HomePage();
		} else if (e.getSource() == login)
		{
			this.dispose();
			new Login();
		} else if (e.getSource() == film)
		{
			this.dispose();
			new Film();
		} else if (e.getSource() == cinema)
		{
			this.dispose();
			new Cinema();
		}
		else if(e.getSource()==beijing)
		{
			q1.setText("东城区");
			q2.setText("丰台区");
			q3.setText("西城区");
			q4.setText("朝阳区");
			q5.setText("海淀区");
		}
		else if(e.getSource()==shai)
		{
			q1.setText("浦东新区");
			q2.setText("宝山区");
			q3.setText("黄浦区");
			q4.setText("静安区");
			q5.setText("金山区");
		}
		else if(e.getSource()==gz)
		{
			q1.setText("天河区");
			q2.setText("黄埔区");
			q3.setText("越秀区");
			q4.setText("海珠区");
			q5.setText("荔湾区");
		}
		else if(e.getSource() == kehuan)
		{
			dlds.setVisible(false);
			ndmz.setVisible(false);
			mcgj.setVisible(false);
			mzt.setVisible(false);
			wbsys.setVisible(false);
			zl2.setVisible(false);
			hhxd.setVisible(false);
			xbyz.setVisible(false);
			t1.setVisible(true);
			t2.setVisible(true);
			t3.setVisible(true);
			t4.setVisible(true);
			
			n2.setHorizontalAlignment(SwingConstants.LEFT);
			s1.setHorizontalAlignment(SwingConstants.CENTER);
			s2.setHorizontalAlignment(SwingConstants.CENTER);
			s3.setHorizontalAlignment(SwingConstants.CENTER);
			s4.setHorizontalAlignment(SwingConstants.CENTER);


			List<cn.bean.Film> list = filmDao.findFilmById(1);
			for(cn.bean.Film ft:list)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n1.setText(a);
				s1.setText(a1+"");
			}
			List<cn.bean.Film> list1 = filmDao.findFilmById(2);
			for(cn.bean.Film ft:list1)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n2.setText(a);
				n2.setBounds(308, 550, 180, 15);
				s2.setText(a1+"");
			}
			List<cn.bean.Film> list2 = filmDao.findFilmById(10);
			for(cn.bean.Film ft:list2)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n3.setText(a);
				n3.setBounds(530, 550, 180, 15);
				s3.setText(a1+"");
			}
			List<cn.bean.Film> list3 = filmDao.findFilmById(11);
			for(cn.bean.Film ft:list3)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n4.setText(a);
				n4.setBounds(743, 550, 180, 15);
				s4.setText(a1+"");
			}
		}else if(e.getSource() == dongzuo)
		{
			zl2.setVisible(true);
			hhxd.setVisible(true);
			xbyz.setVisible(true);
			dlds.setVisible(false);
			ndmz.setVisible(false);
			mcgj.setVisible(false);
			mzt.setVisible(false);
			wbsys.setVisible(false);
			t1.setVisible(false);
			t2.setVisible(false);
			t3.setVisible(false);
			t4.setVisible(false);
			List<cn.bean.Film> list = filmDao.findFilmById(3);
			for(cn.bean.Film ft:list)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n1.setText(a);
				s1.setText(a1+"");
			}
			
			List<cn.bean.Film> list1 = filmDao.findFilmById(4);
			for(cn.bean.Film ft:list1)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n2.setText(a);
				n2.setBounds(338, 550, 180, 15);
				s2.setText(a1+"");
			}
			List<cn.bean.Film> list2 = filmDao.findFilmById(9);
			for(cn.bean.Film ft:list2)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n3.setText(a);
				n3.setBounds(539, 550, 180, 15);
				s3.setText(a1+"");
			}
			t4.setVisible(false);
			n4.setText("暂无");
			n4.setBounds(756, 550, 180, 15);
			s4.setText("评分");
		}
		else if(e.getSource() == xiju)
		{
			dlds.setVisible(true);
			wbsys.setVisible(true);
			mcgj.setVisible(true);
			
			zl2.setVisible(false);
			hhxd.setVisible(false);
			xbyz.setVisible(false);
			ndmz.setVisible(false);
			mzt.setVisible(false);
			t1.setVisible(false);
			t2.setVisible(false);
			t3.setVisible(false);
			t4.setVisible(false);
			List<cn.bean.Film> list = filmDao.findFilmById(5);
			for(cn.bean.Film ft:list)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n1.setText(a);
				s1.setText(a1+"");
			}
			
			List<cn.bean.Film> list1 = filmDao.findFilmById(6);
			for(cn.bean.Film ft:list1)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n2.setText(a);
				n2.setBounds(330, 550, 180, 15);
				s2.setText(a1+"");
			}
			List<cn.bean.Film> list2 = filmDao.findFilmById(12);
			for(cn.bean.Film ft:list2)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n3.setText(a);
				n3.setBounds(539, 550, 180, 15);
				s3.setText(a1+"");
			}
//				t3.setVisible(false);
				t4.setVisible(false);
//				n3.setText("暂无");
//				n3.setBounds(550, 550, 180, 15);
//				s3.setText("评分");
//				s3.setBounds(537, 575, 54, 15);
				n4.setText("暂无");
				n4.setBounds(756, 550, 180, 15);
				s4.setText("评分");
		}
		else if(e.getSource() == dongman)
		{
			ndmz.setVisible(true);
			mzt.setVisible(true);
			dlds.setVisible(false);

			wbsys.setVisible(false);
			mcgj.setVisible(false);
			zl2.setVisible(false);
			hhxd.setVisible(false);
			xbyz.setVisible(false);
			t1.setVisible(false);
			t2.setVisible(false);
			t3.setVisible(false);
			t4.setVisible(false);
			
			List<cn.bean.Film> list = filmDao.findFilmById(7);
			for(cn.bean.Film ft:list)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n1.setText(a);
				s1.setText(a1+"");
			}
			
			List<cn.bean.Film> list1 = filmDao.findFilmById(8);
			for(cn.bean.Film ft:list1)
			{
				String a = ft.getName();
				double a1 = ft.getGrade();
				n2.setText(a);
				n2.setBounds(330, 550, 180, 15);
				s2.setText(a1+"");
			}
				t3.setVisible(false);
				t4.setVisible(false);
				n3.setText("暂无");
				n3.setBounds(550, 550, 180, 15);
				s3.setText("评分");
				s3.setBounds(537, 575, 54, 15);
				n4.setText("暂无");
				n4.setBounds(756, 550, 180, 15);
				s4.setText("评分");
		}else if(e.getSource() == zhanzheng)
		{			
			dlds.setVisible(false);
			ndmz.setVisible(false);
			mzt.setVisible(false);
			wbsys.setVisible(false);
			mcgj.setVisible(false);
			zl2.setVisible(false);
			hhxd.setVisible(false);
			xbyz.setVisible(false);
			t1.setVisible(false);
			t2.setVisible(false);
			t3.setVisible(false);
			t4.setVisible(false);
			
			n1.setText("暂无");
			n2.setText("暂无");
			n3.setText("暂无");
			n4.setText("暂无");
			s1.setText("评分");
			s2.setText("评分");
			s3.setText("评分");
			s4.setText("评分");
			n1.setBounds(60, 550, 180, 15);
			n2.setBounds(342, 550, 180, 15);
			n3.setBounds(552, 550, 180, 15);
			n4.setBounds(755, 550, 180, 15);
			
			s1.setBounds(128, 575, 45, 15);
			s2.setBounds(330, 575, 54, 15);
			s3.setBounds(539, 575, 54, 15);
			s4.setBounds(743, 575, 54, 15);
		}else if(e.getSource() == kb)
		{
			dlds.setVisible(false);
			ndmz.setVisible(false);
			mzt.setVisible(false);
			wbsys.setVisible(false);
			mcgj.setVisible(false);
			zl2.setVisible(false);
			hhxd.setVisible(false);
			xbyz.setVisible(false);
			t1.setVisible(false);
			t2.setVisible(false);
			t3.setVisible(false);
			t4.setVisible(false);
			
			n1.setText("暂无");
			n2.setText("暂无");
			n3.setText("暂无");
			n4.setText("暂无");
			
			s1.setText("评分");
			s2.setText("评分");
			s3.setText("评分");
			s4.setText("评分");
			n1.setBounds(60, 550, 180, 15);
			n2.setBounds(342, 550, 180, 15);
			n3.setBounds(552, 550, 180, 15);
			n4.setBounds(755, 550, 180, 15);
			
			s1.setBounds(128, 575, 45, 15);
			s2.setBounds(330, 575, 54, 15);
			s3.setBounds(539, 575, 54, 15);
			s4.setBounds(743, 575, 54, 15);
		}else if(e.getSource()==t1)
		{
			Detail d = new Detail();
//			n1.getText();
			List<FilmType> list1=filmtypeDao.findFilmType(1);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(1);
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
		}else if(e.getSource()==t2)
		{
			Detail d = new Detail();
//			n1.getText();
			List<FilmType> list1=filmtypeDao.findFilmType(2);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(2);
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
		}else if(e.getSource()==t3)
		{
			Detail d = new Detail();
//			n1.getText();
			List<FilmType> list1=filmtypeDao.findFilmType(10);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(10);
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
		}else if(e.getSource()==t4)
		{
			Detail d = new Detail();
//			n1.getText();
			List<FilmType> list1=filmtypeDao.findFilmType(11);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(11);
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
			d.tp.setIcon(image4);
			this.dispose();
		}
		else if(e.getSource()==hhxd)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(3);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(3);
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
			d.tp.setIcon(image5);
			this.dispose();
		}else if(e.getSource()==zl2)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(4);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(4);
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
			d.tp.setIcon(image6);
			this.dispose();
		}else if(e.getSource()==xbyz)
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
			d.tp.setIcon(image7);
			this.dispose();
		}else if(e.getSource()==wbsys)
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
			d.tp.setIcon(image8);
			this.dispose();
		}else if(e.getSource()==mcgj)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(6);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(6);
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
			d.tp.setIcon(image9);
			this.dispose();
		}else if(e.getSource()==mzt)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(7);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(7);
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
			d.tp.setIcon(image10);
			this.dispose();
		}else if(e.getSource()==ndmz)
		{
			Detail d = new Detail();
			List<FilmType> list1=filmtypeDao.findFilmType(8);
			for(FilmType ft:list1)
			{
				String a = ft.getName();
				d.mb2.setText(a);
			}
			List<cn.bean.Film> list = filmDao.findFilmById(8);
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
			d.tp.setIcon(image11);
			this.dispose();
		}
		
		else if(e.getSource()==dlds)
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
			d.tp.setIcon(image12);
			this.dispose();
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
