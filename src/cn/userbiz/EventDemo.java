package cn.userbiz;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.*;


@SuppressWarnings("all")
public class EventDemo extends JFrame implements MouseListener
{
	Set dy = new HashSet();
	JLabel label;
	
//	private Set Hobbies = new HashSet();
	
	
	static int limitSec;
	JPanel time;
	static JLabel t1;
	static JLabel t2;
	JLabel zgjm;
	JPanel mb;
	JButton z1,z2,z3,z4,z5,z6,z7,z8,z9,z10;
	JButton z21,z22,z23,z24,z25,z26,z27,z28,z29,z20;
	JButton z31,z32,z33,z34,z35,z36,z37,z38,z39,z30;
	JButton z41,z42,z43,z44,z45,z46,z47,z48,z49,z40;
	JLabel guo,dao;
	JButton ys,kx,yx;
	JLabel yishou,kexuan,yixuan;
	JLabel ndxz;
	JButton cx,tj,button2,button3;
	ImageIcon icon1,icon2,icon3;
	private JTextArea textArea_2;
	
	public static void main(String[] args)
	{
		EventDemo e = new EventDemo();
	}
	
	public EventDemo()
	{
		countDown();
		//
		icon1 = new ImageIcon("image/xuan3.jpg");
	    icon2 = new ImageIcon("image/xuan1.jpg");
	    icon3 = new ImageIcon("image/xuan2.jpg");
	    button2 = new JButton(icon2);
	    button3 = new JButton(icon3);
		
		time = new JPanel();
		zgjm = new JLabel("中    国    巨    幕");
		mb = new JPanel();
		t1 = new JLabel();
		t2 = new JLabel();
		z1 = new JButton();		z2 = new JButton();		z3 = new JButton();
		z4 = new JButton();		z5 = new JButton();		z6 = new JButton();
		z7 = new JButton();		z8 = new JButton();		z9 = new JButton();
		z10 = new JButton();	z21 = new JButton();	z22 = new JButton();				
		z23 = new JButton();	z24 = new JButton();	z25 = new JButton();		
		z26 = new JButton();	z27 = new JButton();	z28 = new JButton();		
		z29 = new JButton();	z20 = new JButton();	z31 = new JButton();		

		z32 = new JButton();	z33 = new JButton();	z34 = new JButton();		
		z35 = new JButton();	z36 = new JButton();	z37 = new JButton();	
		z38 = new JButton();	z39 = new JButton();	z30 = new JButton();

		z41 = new JButton();	z42 = new JButton();	z43 = new JButton();
		z44 = new JButton();	z45 = new JButton();	z46 = new JButton();
		z47 = new JButton();	z48 = new JButton();	z49 = new JButton();
		z40 = new JButton();	ys = new JButton();		kx = new JButton();
		yx = new JButton();
		
		guo = new JLabel("过");
		dao = new JLabel("道");
		
        yishou = new JLabel("已售座位");
        yixuan = new JLabel("已选座位");
        kexuan = new JLabel("可选座位");
        ndxz = new JLabel("您的选座:");

        cx = new JButton("重新选座");
        tj = new JButton("提交订单");
        tj.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		dispose();
        		Paypage paypage=new Paypage();
        		paypage.main(null);
        	}
        });
		
		guo.setFont(new Font("仿宋", Font.BOLD, 40));
		guo.setBounds(558, 219, 50, 80);
        
		dao.setFont(new Font("仿宋", Font.BOLD, 40));
		dao.setBounds(558, 332, 50, 80);
		
		zgjm.setForeground(new Color(255, 99, 71));
		zgjm.setBackground(Color.WHITE);
		zgjm.setFont(new Font("华文新魏", Font.BOLD, 58));
		zgjm.setBounds(383, 78, 448, 80);
		
		mb.setBackground(new Color(255, 127, 80));
        mb.setBounds(154, 164, 863, 31);
        
        z1.setBounds(154, 213, 50, 40);
        z2.setBounds(234, 213, 50, 40);
        z3.setBounds(316, 213, 50, 40);
        z4.setBounds(391, 213, 50, 40);
        z5.setBounds(465, 213, 50, 40);
        z6.setBounds(640, 213, 50, 40);
        z7.setBounds(719, 213, 50, 40);
        z8.setBounds(800, 213, 50, 40);
        z9.setBounds(884, 213, 50, 40);
        z10.setBounds(967, 213, 50, 40);
        
        z21.setBounds(154, 285, 50, 40);
        z22.setBounds(234, 285, 50, 40);
        z23.setBounds(316, 285, 50, 40);
        z24.setBounds(391, 285, 50, 40);
        z25.setBounds(465, 285, 50, 40);
        z26.setBounds(640, 285, 50, 40);
        z27.setBounds(719, 285, 50, 40);
        z28.setBounds(800, 285, 50, 40);
        z29.setBounds(884, 285, 50, 40);
        z20.setBounds(967, 285, 50, 40);
        
        z31.setBounds(154, 350, 50, 40);
        z32.setBounds(234, 350, 50, 40);
        z33.setBounds(316, 350, 50, 40);
        z34.setBounds(391, 350, 50, 40);
        z35.setBounds(465, 350, 50, 40);
        z36.setBounds(640, 350, 50, 40);
        z37.setBounds(719, 350, 50, 40);
        z38.setBounds(800, 350, 50, 40);
        z39.setBounds(884, 350, 50, 40);
        z30.setBounds(967, 350, 50, 40);
        
        z41.setBounds(154, 411, 50, 40);
        z42.setBounds(234, 411, 50, 40);
        z43.setBounds(316, 411, 50, 40);
        z44.setBounds(391, 411, 50, 40);
        z45.setBounds(465, 411, 50, 40);
        z46.setBounds(640, 411, 50, 40);
        z47.setBounds(719, 411, 50, 40);
        z48.setBounds(800, 411, 50, 40);
        z49.setBounds(884, 411, 50, 40);
        z40.setBounds(967, 411, 50, 40);
        ys.setBounds(213, 496, 50, 40);
        kx.setBounds(503, 496, 50, 40);
        yx.setBounds(794, 496, 50, 40);
        
        ys.setIcon(icon3);
        kx.setIcon(icon1);
        yx.setIcon(icon2);
        
        yishou.setFont(new Font("宋体", Font.BOLD, 25));
        yishou.setBounds(278, 496, 122, 49);
        
        kexuan.setFont(new Font("宋体", Font.BOLD, 25));
        kexuan.setBounds(568, 496, 122, 49);
        
        yixuan.setFont(new Font("宋体", Font.BOLD, 25));
        yixuan.setBounds(859, 496, 122, 49);
        
        ndxz.setFont(new Font("宋体", Font.BOLD, 30));
        ndxz.setBounds(47, 577, 192, 44);
        
        cx.setFont(new Font("华文楷体", Font.BOLD, 30));
        cx.addMouseListener(this);
        cx.setBounds(737, 567, 173, 66);
        
        t1.setFont(new Font("宋体", Font.BOLD, 25));
		t2.setFont(new Font("宋体", Font.BOLD, 25));
		
		z1.setText("1排01座");	z2.setText("1排02座"); 	z3.setText("1排03座");
		z4.setText("1排04座");	z5.setText("1排05座");	z6.setText("1排06座");
		z7.setText("1排07座");	z8.setText("1排08座");
		z24.setText("2排04座");	z25.setText("2排05座");	z26.setText("2排06座");
		z27.setText("2排07座");	z28.setText("2排08座");
		z34.setText("3排04座");	z35.setText("3排05座");	z38.setText("3排08座");
		
		

		z1.setIcon(icon1);		z2.setIcon(icon1);		z3.setIcon(icon1);
		z4.setIcon(icon1);		z5.setIcon(icon1);		z6.setIcon(icon1);
		z7.setIcon(icon1);		z8.setIcon(icon1);		z9.setIcon(icon3);
		z10.setIcon(icon3);		z21.setIcon(icon3);		z22.setIcon(icon3);
		z23.setIcon(icon3);		z24.setIcon(icon1);		z25.setIcon(icon1);
		z26.setIcon(icon1);		z27.setIcon(icon1);		z28.setIcon(icon1);
		z29.setIcon(icon3);		z20.setIcon(icon3);		z31.setIcon(icon3);
		z32.setIcon(icon3);		z33.setIcon(icon3);		z34.setIcon(icon1);
		z35.setIcon(icon1);		z36.setIcon(icon3);		z37.setIcon(icon3);
		z38.setIcon(icon1);		z39.setIcon(icon3);		z30.setIcon(icon3);
		z41.setIcon(icon3);		z42.setIcon(icon3);		z43.setIcon(icon3);
		z44.setIcon(icon3);		z45.setIcon(icon3);		z46.setIcon(icon3);
		z47.setIcon(icon3);		z48.setIcon(icon3);		z49.setIcon(icon3);
		z40.setIcon(icon3);		
		
		
		z1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z1.isEnabled()){
					z1.setIcon(icon2);
					dy.add(z1.getText());
					
				}
				PrintJTextArea();
			}
		});
		
		z2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z2.isEnabled()){
					z2.setIcon(icon2);
					dy.add(z2.getText());
				}
				PrintJTextArea();
			}
		});
		
		z3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z3.isEnabled()){
					z3.setIcon(icon2);
					dy.add(z3.getText());
				}
				PrintJTextArea();
			}
		});

		z4.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z4.isEnabled()){
					z4.setIcon(icon2);
					dy.add(z4.getText());
				}
				PrintJTextArea();
			}
		});
		
		z5.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z5.isEnabled()){
					z5.setIcon(icon2);
					dy.add(z5.getText());
				}
				PrintJTextArea();
			}
		});
		
		z6.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z6.isEnabled()){
					z6.setIcon(icon2);
					dy.add(z6.getText());
				}
				PrintJTextArea();
			}
		});

		z7.addActionListener(new ActionListener() {
	
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z7.isEnabled()){
					z7.setIcon(icon2);
					dy.add(z7.getText());
				}
				PrintJTextArea();
			}
		});

		z8.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z8.isEnabled()){
					z8.setIcon(icon2);
					dy.add(z8.getText());
				}
				PrintJTextArea();
			}
		});
		
		z24.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z24.isEnabled()){
					z24.setIcon(icon2);
					dy.add(z24.getText());
				}
					PrintJTextArea();
				}
			});
		
		z25.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z25.isEnabled()){
					z25.setIcon(icon2);
					dy.add(z25.getText());
				}
				PrintJTextArea();
			}
		});
		
		z26.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z26.isEnabled()){
					z26.setIcon(icon2);
					dy.add(z26.getText());
				}
				PrintJTextArea();
			}
		});
		
		z27.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z27.isEnabled()){
					z27.setIcon(icon2);
					dy.add(z27.getText());
				}
				PrintJTextArea();
			}
		});
		
		z28.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z28.isEnabled()){
					z28.setIcon(icon2);
					dy.add(z28.getText());
				}
				PrintJTextArea();
			}
		});
		
		z34.addActionListener(new ActionListener() {
					
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z34.isEnabled()){
					z34.setIcon(icon2);
					dy.add(z34.getText());
				}
				PrintJTextArea();
			}
		});
		
		z35.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z35.isEnabled()){
					z35.setIcon(icon2);
					dy.add(z35.getText());
				}
				PrintJTextArea();
			}
		});
		
		z38.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(z38.isEnabled()){
					z38.setIcon(icon2);
					dy.add(z38.getText());
				}
				PrintJTextArea();
			}
		});
		
		
		
		time.setBounds(234,26,622,44);
		time.setOpaque(true);
		time.setBackground(new Color(255, 245, 238));
		time.add(label);
        
        tj.setForeground(new Color(255, 0, 0));
        tj.setFont(new Font("华文楷体", Font.BOLD, 38));
        tj.setBounds(925, 564, 203, 65);
		
        this.add(time);
		getContentPane().add(z1);	getContentPane().add(z2);	getContentPane().add(z3);
		getContentPane().add(z4);	getContentPane().add(z5);	getContentPane().add(z6);
		getContentPane().add(z7);	getContentPane().add(z8);	getContentPane().add(z9);
		getContentPane().add(z10);	getContentPane().add(z21);	getContentPane().add(z22);
		getContentPane().add(z23);	getContentPane().add(z24);	getContentPane().add(z25);
		getContentPane().add(z26);	getContentPane().add(z27);	getContentPane().add(z28);
		getContentPane().add(z29);	getContentPane().add(z20);	getContentPane().add(z31);
		getContentPane().add(z32);	getContentPane().add(z33);	getContentPane().add(z30);
		getContentPane().add(z34);	getContentPane().add(z35);	getContentPane().add(z36);
		getContentPane().add(z37);	getContentPane().add(z38);	getContentPane().add(z39);
		getContentPane().add(z41);	getContentPane().add(z42);	getContentPane().add(z43);
		getContentPane().add(z44);	getContentPane().add(z45);	getContentPane().add(z46);
		getContentPane().add(z47);	getContentPane().add(z48);	getContentPane().add(z49);	getContentPane().add(z40);
		getContentPane().add(yx);	getContentPane().add(ys);	getContentPane().add(kx);
		getContentPane().add(yishou);	getContentPane().add(kexuan);	getContentPane().add(yixuan);
		getContentPane().add(ndxz);		getContentPane().add(cx);		getContentPane().add(tj);
		
		getContentPane().add(zgjm);getContentPane().add(mb);getContentPane().add(guo);getContentPane().add(dao);
		this.setTitle("选座");
        getContentPane().setBackground(new Color(255, 245, 238));
		this.setBounds(228, 39, 1189,702);
		getContentPane().setLayout(null);
		
		textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("宋体", Font.PLAIN, 30));
		textArea_2.setEditable(false);
		textArea_2.setBounds(194, 577, 496, 66);
		getContentPane().add(textArea_2);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
			
	}

	
	@Override
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==cx)
		{
			this.dispose();
			new EventDemo();
		}
		
//		else if(e.getSource()==tj)
//		{
//			this.dispose();
//			Paypage paypage=new Paypage();
//			paypage.main(null);
//		}
		
	}
	
	//
	protected void PrintJTextArea() {
		textArea_2.setText(""); 
		if(dy.size()>4)
		{
            JOptionPane.showMessageDialog(null, "最多只能选4个座位,请重新选择","提示",JOptionPane.ERROR_MESSAGE);
            new EventDemo();
            this.dispose();
		}
	      if (dy.size() > 0)//如果 Set 集合中有元素，打印兴趣  
	    	  textArea_2.append(""); 
	     Iterator it = dy.iterator(); 
	     while (it.hasNext()) { 
	    	 textArea_2.append(it.next() + " "); 
	      }
	}
	
	
	public void countDown()
	{
		// 创建窗体对象倒计时的内容将显示在该窗体上面
		JFrame frame = new JFrame();
		frame.setSize(400, 150);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 将倒计时字幕显示在正中间
		label = new JLabel("", JLabel.CENTER);
		frame.getContentPane().setLayout(new BorderLayout());
		frame.getContentPane().add(label, BorderLayout.CENTER);

		/*
		 * 设置倒计时的时间长度 创建timer对象，再根据timer的schedule方法创键匿名内部类 并实现线程
		 */
		final long end = System.currentTimeMillis() + 1 * 1000 * 900;
		Timer timer = new Timer();
		timer.schedule(new TimerTask()
		{
			// 获取剩余的倒计时长
			public void run()
			{
				long sub = end - System.currentTimeMillis();
				if (sub < 0)
				{
					return;
				}
				updateTimer(sub);
				
			}

		}, 0, 1000);
		
	}

	// 显示成HH：mm：ss样的格式，刷新剩余的时长
	public void updateTimer(long sub)
	{
		int m = (int) (sub / 1000 / 60 % 60);
		int s = (int) (sub / 1000 % 60);
		String str = /*h + ":" + */m + ":" + s;
		// 将String类型转换成Date类型的格式
		SimpleDateFormat sdf = new SimpleDateFormat("mm:ss");
		Date date = new Date();
		Font font = new Font("Default", Font.PLAIN, 30);
		label.setFont(font);
		try
		{
			date = sdf.parse(str);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		// 将Date类型的数设置成想要显示的时间格式,并写入JLable中
		label.setText("请在"+sdf.format(date)+"内完成购票");
		if(sdf.format(date).equals("00:00"))
		{
            JOptionPane.showMessageDialog(null, "购票时间已过，请重新选座!","提示",JOptionPane.ERROR_MESSAGE);
			this.dispose();
			new HomePage();
		}
	}
	//

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
