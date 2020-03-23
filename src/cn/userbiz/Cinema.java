package cn.userbiz;



import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;

import cn.dao.FilmDao;
import cn.dao.impl.FilmDaoImpl;
import cn.dbc.BaseDao;
@SuppressWarnings("all")
public class Cinema extends JFrame implements MouseListener
{
	JLabel logo,homepage,film,cinema,login,icon1,icon2,icon3,icon4,icon5,icon6,icon7,icon8;
	JPanel mb;
	
	JLabel dyy,yylb;
	JPanel mb1;
	JTable table;
	
	ImageIcon image;
	Image img;
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	BaseDao bs=null;
	FilmDao filmDao=new FilmDaoImpl();
	private JScrollPane scrollPane_2;
	
	public Cinema()
	{
		homepage = new JLabel("首页");
		film = new JLabel("电影");
		cinema = new JLabel("影院");
		login = new JLabel("我的信息");
		mb = new JPanel();
		
		dyy = new JLabel("电影院");
		yylb = new JLabel("影院列表");
		mb1 = new JPanel();
	
		image = new ImageIcon("image/logo.png");
		img = image.getImage();
        img = img.getScaledInstance(177, 72, Image.SCALE_DEFAULT); 
        image.setImage(img);
        logo = new JLabel(image);
        logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logo.setBounds(10, 10, 177, 66);
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
        
        dyy.setFont(new Font("微软雅黑", Font.BOLD, 16));
        dyy.setHorizontalAlignment(SwingConstants.CENTER);
        dyy.setBounds(20, 92, 92, 40);
        
        yylb.setHorizontalAlignment(SwingConstants.CENTER);
        yylb.setFont(new Font("微软雅黑", Font.BOLD, 16));
        yylb.setBounds(10, 294, 92, 40);
        
        mb1.setBackground(Color.WHITE);
        mb1.setBounds(10, 133, 870, 162);
        
        getContentPane().add(logo);	getContentPane().add(homepage);getContentPane().add(film);
        getContentPane().add(cinema);getContentPane().add(login);getContentPane().add(mb);
        getContentPane().add(dyy);getContentPane().add(mb1);
        mb1.setLayout(null);
        
        icon1 = new JLabel("");
        icon1.setIcon(new ImageIcon("image/大地影院.png"));
        icon1.setBounds(0, 0, 201, 76);
		mb1.add(icon1);
		
		icon2 = new JLabel("");
		icon2.setIcon(new ImageIcon("image/金逸影城.png"));
		icon2.setBounds(212, 0, 210, 76);
		mb1.add(icon2);
		
		icon3 = new JLabel("");
		icon3.setIcon(new ImageIcon("image/未来影院.jpg"));
		icon3.setBounds(436, 0, 210, 76);
		mb1.add(icon3);
		
		icon4 = new JLabel("");
		icon4.setIcon(new ImageIcon("image/中影数字.png"));
		icon4.setBounds(660, 0, 210, 76);
		mb1.add(icon4);
		
		icon5 = new JLabel("");
		icon5.setIcon(new ImageIcon("image/太平洋影城.jpg"));
		icon5.setBounds(0, 78, 201, 84);
		mb1.add(icon5);
		
		icon6 = new JLabel("");
		icon6.setIcon(new ImageIcon("image/中影星美.png"));
		icon6.setBounds(212, 78, 210, 84);
		mb1.add(icon6);
		
		icon7 = new JLabel("");
		icon7.setIcon(new ImageIcon("image/横店影视.png"));
		icon7.setBounds(436, 89, 210, 73);
		mb1.add(icon7);
		
		icon8 = new JLabel("");
		icon8.setIcon(new ImageIcon("image/新影联.png"));
		icon8.setBounds(660, 89, 210, 73);
		mb1.add(icon8);getContentPane().add(yylb);

        this.setTitle("影院");
		this.setBounds(228, 39, 906, 639);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);		
		
		scrollPane_2 = new JScrollPane();
		//JTable table;
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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/onlinefilm?characterEncoding=utf-8", "root", "123456");
            pstmt = conn.prepareStatement("select * from cinema");
            rs = pstmt.executeQuery();
            while (rs.next())
            {
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
		scrollPane_2.setViewportView(table);//这句很重要
		scrollPane_2.setBounds(20, 329, 906, 262);
		table.setRowHeight(30);
		DefaultTableCellRenderer r = new DefaultTableCellRenderer();    
		r.setHorizontalAlignment(JLabel.CENTER);   
		table.setDefaultRenderer(Object.class,r);
		getContentPane().add(scrollPane_2);
				
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
	
	}
	public static void main(String[] args)
	{
		Cinema c = new Cinema();
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
			//this.dispose();
			new Cinema();
		}
		else if (e.getSource()==table)
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
				//ee.main(null);
		       EventDemo2 eventDemo=new EventDemo2();
		       eventDemo.getButtonss();
		 //      eventDemo.getTime();
		     
		         
		    //    iob.getTime();
			//	new EventDemo();
				
				//new Login();
		     //   this.dispose();
				
			}
			
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