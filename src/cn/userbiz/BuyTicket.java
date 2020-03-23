package cn.userbiz;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import cn.bean.Film;
import cn.dao.FilmDao;
import cn.dao.impl.FilmDaoImpl;
import cn.dbc.BaseDao;
import cn.visitorbiz.Login;
@SuppressWarnings("all")
public class BuyTicket extends JFrame implements MouseListener
{
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	BaseDao bs=null;
	FilmDao filmDao=new FilmDaoImpl();
	
	
	JScrollPane scrollPane_2 = new JScrollPane();
	JTable table;
	JLabel logo,homepage,film,cinema,login;
	JPanel mb;
	
	JLabel score,yylb;
	JPanel mb2;
	JButton more;
	JLabel  jianj,zhuyan,mz,lx;
	static JLabel tp,name,type,zy,jj,grade;
	
	ImageIcon image;
	Image img;
	
	public BuyTicket()
	{
		homepage = new JLabel("首页");
		film = new JLabel("电影");
		cinema = new JLabel("影院");
		login = new JLabel("我的信息");
		mb = new JPanel();
		
		tp = new JLabel();
		name = new JLabel();
		type = new JLabel();		
		mz = new JLabel("电影名称");
		mz.setFont(new Font("微软雅黑", Font.BOLD, 12));
		mz.setForeground(Color.GRAY);
		lx = new JLabel("电影类型");
		lx.setForeground(Color.GRAY);
		lx.setFont(new Font("微软雅黑", Font.BOLD, 12));
		score = new JLabel("用户评分");
		grade = new JLabel("分数");
		more = new JButton("查看更多影讯");
		jj = new JLabel("简介:");
		
		yylb = new JLabel("影院列表");
		mb2 = new JPanel();
		
		image = new ImageIcon("image/logo.png");
		img = image.getImage();
        img = img.getScaledInstance(177, 72, Image.SCALE_DEFAULT); 
        image.setImage(img);
        logo = new JLabel(image);
        logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logo.setBounds(10, 4, 177, 72);
        logo.addMouseListener(this);
        
        homepage.setHorizontalAlignment(SwingConstants.CENTER);
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
        homepage.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        homepage.setForeground(Color.BLACK);
        homepage.addMouseListener(this);
        homepage.setFont(new Font("宋体", Font.BOLD, 23));
        homepage.setBounds(196, 10, 92, 66);
        
        film.setHorizontalAlignment(SwingConstants.CENTER);
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
        film.addMouseListener(this);
        film.setFont(new Font("宋体", Font.BOLD, 23));
        film.setBounds(391, 10, 81, 66);
        
        cinema.setHorizontalAlignment(SwingConstants.CENTER);
        cinema.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        cinema.addMouseListener(this);
        cinema.setForeground(new Color(255, 0, 0));
        cinema.setFont(new Font("宋体", Font.BOLD, 23));
        cinema.setBounds(583, 10, 86, 66);
        
        login.setHorizontalAlignment(SwingConstants.CENTER);
        login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        login.setForeground(new Color(0, 0, 255));
        login.setFont(new Font("微软雅黑", Font.BOLD, 20));
        login.setBounds(727, 10, 134, 66);
        login.addMouseListener(this);
		
        mb.setBackground(Color.WHITE);
        mb.setBounds(10, 10, 870, 72);
        
        
        jianj= new JLabel("简介:");
    	jianj.setHorizontalAlignment(SwingConstants.CENTER);
    	jianj.setFont(new Font("微软雅黑", Font.BOLD, 12));
    	jianj.setBounds(484, 172, 54, 15);
        jj.setText(Detail.mb4.getText());
        jj.setForeground(Color.GRAY);
    	jj.setBounds(534, 172, 269, 66);
    	
    	
    	zhuyan = new JLabel("主演:");
    	zhuyan.setHorizontalAlignment(SwingConstants.CENTER);
    	zhuyan.setFont(new Font("微软雅黑", Font.BOLD, 12));
    	zhuyan.setBounds(484, 92, 54, 15);
    	zy= new JLabel();
    	
    	zy.setText(Detail.mb3.getText());
        zy.setForeground(Color.GRAY);
    	zy.setBounds(534, 92, 186, 51);
        
        tp.setIcon(Detail.tp.getIcon());
        tp.setHorizontalAlignment(SwingConstants.CENTER);
		tp.setBounds(46, 86, 214, 233);
		
		name.setText(Detail.mb1.getText());
		name.setHorizontalAlignment(SwingConstants.CENTER);
		mz.setHorizontalAlignment(SwingConstants.CENTER);
		mz.setBounds(302, 86, 146, 61);
		name.setBounds(302, 116, 146, 61);
        
		type.setText(Detail.mb2.getText());
		type.setHorizontalAlignment(SwingConstants.CENTER);
		lx.setHorizontalAlignment(SwingConstants.CENTER);
		lx.setBounds(312, 157, 126, 40);
		type.setBounds(312, 187, 126, 40);
		
		
		score.setHorizontalAlignment(SwingConstants.CENTER);
		score.setFont(new Font("微软雅黑", Font.BOLD, 12));
		score.setBounds(466, 248, 126, 40);
		
		grade.setText(Detail.mb5.getText());
		grade.setHorizontalAlignment(SwingConstants.CENTER);
		grade.setForeground(new Color(255, 204, 0));
		grade.setBounds(482, 287, 86, 40);
		
		more.setBackground(Color.RED);
		more.setForeground(Color.WHITE);
		more.addMouseListener(this);
		more.setBounds(302, 272, 146, 45);
		
        yylb.setHorizontalAlignment(SwingConstants.CENTER);
        yylb.setFont(new Font("微软雅黑", Font.BOLD, 16));
        yylb.setBounds(10, 294, 92, 40);
        
        mb2.setBackground(Color.WHITE);
        mb2.setBounds(10, 344, 860, 233);
        
        //cs
        
		Vector columnNames = new Vector();
		Vector rowData=new Vector();
		JPanel jpforbutton = new JPanel(new GridLayout(1,1));
		columnNames = new Vector();
        columnNames.add("影院名称");
        columnNames.add("影院地址");
        rowData = new Vector();
		try 
		{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinefilm?characterEncoding=utf-8",
					"root", "123456");
            pstmt = conn.prepareStatement("select * from cinema");
            rs = pstmt.executeQuery();
            while (rs.next())
            {
            	cn.bean.Cinema ci = new cn.bean.Cinema();
                Vector hang = new Vector();
                hang.add(rs.getString(2));
                hang.add(rs.getString(3));
                rowData.add(hang);
            }
        }
		catch (Exception q)
		{
            q.printStackTrace();
        }
		finally
		{
            try
            {
                rs.close();
                pstmt.close();
                conn.close();
            }
            catch (SQLException o)
            {
                o.printStackTrace();
            }
        }
		table = new JTable(rowData,columnNames);
		table.addMouseListener(this);
		scrollPane_2.setViewportView(table);//这句很重要
		scrollPane_2.setBounds(20, 329, 906, 262);
		table.setRowHeight(20);
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();    
		r.setHorizontalAlignment(JLabel.CENTER);   
		table.setDefaultRenderer(Object.class,r);
        this.add(scrollPane_2);
        //cs
        this.add(logo);	this.add(homepage);this.add(film);
        this.add(cinema);this.add(login);this.add(mb);
        this.add(yylb);this.add(mb2);this.add(tp);
        this.add(name);this.add(type);this.add(score);
        this.add(grade);this.add(more);this.add(jj);
        this.add(zhuyan);this.add(zy);this.add(jianj);
        this.add(mz);this.add(lx);
        
        this.setTitle("购票");
		this.setBounds(228, 39, 906, 639);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);

	}

	public static void main(String[] args)
	{
		BuyTicket b = new BuyTicket();
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
			new MyView();
		} else if (e.getSource() == film)
		{
			this.dispose();
			new cn.userbiz.Film();
		} else if (e.getSource() == cinema)
		{
			this.dispose();
			new Cinema();
		} else if (e.getSource() == more)
		{
			Detail d = new Detail();
			d.tp.setIcon(tp.getIcon());
			d.mb4.setText(jj.getText());
			d.mb1.setText(name.getText());
			d.mb2.setText(type.getText());
			d.mb3.setText(zy.getText());
			d.mb5.setText(grade.getText());
			this.dispose();
		} else if (e.getSource() == table)
		{
			int r = table.getSelectedRow();

			int c = table.getSelectedColumn();

			// 得到选中的单元格的值，表格中都是字符串

			Object value = table.getValueAt(r, c);

			String info = value.toString();
			

			if (JOptionPane.showConfirmDialog(null, "您选择的是:" + info, "提示",
			 JOptionPane.YES_NO_OPTION,JOptionPane
			 .QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
			{
				this.dispose();
				new EventDemo();
				//ee.main(null);
		    //   EventDemo2 eventDemo=new EventDemo2();
		     //  eventDemo.getButtonss();
		 //      eventDemo.getTime();
		     
		         
		    //    iob.getTime();
			//	new EventDemo();
				
				//new Login();
		     //   this.dispose();
				
			}
			
		}
		//setVisible(true);
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
	}

}
