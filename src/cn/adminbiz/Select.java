package cn.adminbiz;



import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

import cn.dbc.BaseDao;

public class Select extends JFrame implements MouseListener
{
	JLabel label, label2, label3, label4, label5, label6,label7,label8,label9,label10,label11;
	JPanel panel, panel2;
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	BaseDao bd=null;

	public static void main(String[] args)
	{
		Select u = new Select();
	}
	public Select()
	{
	panel = new JPanel();
	panel.setBackground(new Color(211, 211, 211));
	panel.setLayout(null);
	
	label = new JLabel("添加电影");
	label.setFont(new Font("微软雅黑", Font.BOLD, 19));
	label.setBounds(34, 114, 105, 63);
	label.addMouseListener(new MouseAdapter()
	{
		@Override
		public void mouseEntered(MouseEvent arg0)
		{
			label.setForeground(new Color(255, 0, 0));
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			label.setForeground(Color.BLACK);
		}
	});
	label.addMouseListener(this);
	panel.add(label);
	
	label2 = new JLabel("修改电影");
	label2.setFont(new Font("微软雅黑", Font.BOLD, 19));
	label2.setBounds(34, 211, 105, 63);
	label2.addMouseListener(this);
	label2.addMouseListener(new MouseAdapter()
	{
		@Override
		public void mouseEntered(MouseEvent arg0)
		{
			label2.setForeground(new Color(255, 0, 0));
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			label2.setForeground(Color.BLACK);
		}
	});
	panel.add(label2);
	
	label3 = new JLabel("删除电影");
	label3.setFont(new Font("微软雅黑", Font.BOLD, 19));
	label3.setBounds(34, 306, 105, 63);
	label3.addMouseListener(new MouseAdapter()
	{
		@Override
		public void mouseEntered(MouseEvent arg0)
		{
			label3.setForeground(new Color(255, 0, 0));
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			label3.setForeground(Color.BLACK);
		}
	});
	label3.addMouseListener(this);
	panel.add(label3);
	
	label4 = new JLabel("查询订单");
	label4.setFont(new Font("微软雅黑", Font.BOLD, 19));
	label4.setBounds(34, 402, 105, 63);
	label4.setForeground(Color.red);
	
	panel2 = new JPanel();
	panel2.setBackground(new Color(255, 255, 255));
	panel2.setBounds(149, 114, 714, 442);
	panel2.setLayout(null);
	panel.updateUI();
	panel2.setVisible(true);
	panel.add(panel2);
	label4.addMouseListener(this);
	panel.add(label4);
	
	JTable table;
	JScrollPane jscrollpane = new JScrollPane();
	Vector columnNames = new Vector();
	Vector rowData=new Vector();
	
	JPanel jpforbutton = new JPanel(new GridLayout(1,1));
	 
    columnNames = new Vector();
    columnNames.add("订单编号");
    columnNames.add("用户名");
    columnNames.add("交易时间");
    rowData = new Vector();
	try {
        Class.forName("com.mysql.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://192.168.20.187:3306/onlinefilm?characterEncoding=utf-8","wl","123456");
        pstmt = conn.prepareStatement("select * from orders");
        rs = pstmt.executeQuery();
        while (rs.next())
        {
            Vector hang = new Vector();
            hang.add(rs.getString(1));
            hang.add(rs.getString(2));
            hang.add(rs.getString(3));
            rowData.add(hang);
        }
    }catch (Exception q){
        q.printStackTrace();
    }finally{
        try{
            rs.close();
            pstmt.close();
            conn.close();
        }catch (SQLException o){
            o.printStackTrace();
        }
    }
	table = new JTable(rowData,columnNames);
	jscrollpane.setBounds(150, 115, 714, 440);
	jscrollpane.setViewportView(table);//这句很重要
	table.setRowHeight(35); 
	
	DefaultTableCellRenderer r = new DefaultTableCellRenderer();    
	r.setHorizontalAlignment(JLabel.CENTER);   
	table.setDefaultRenderer(Object.class,r);
	add(jscrollpane);
	
	
	label5 = new JLabel("退出系统");
	label5.setFont(new Font("微软雅黑", Font.BOLD, 19));
	label5.setBounds(34, 493, 105, 63);
	label5.addMouseListener(new MouseAdapter()
	{
		@Override
		public void mouseEntered(MouseEvent arg0)
		{
			label5.setForeground(new Color(255, 0, 0));
		}
		@Override
		public void mouseExited(MouseEvent e)
		{
			label5.setForeground(Color.BLACK);
		}
	});
	label5.addMouseListener(this);
	panel.add(label5);
	
	ImageIcon image2 = new ImageIcon("image/logo.jpg");
	Image img2 = image2.getImage();
	img2 = img2.getScaledInstance(177, 115, Image.SCALE_DEFAULT);
	image2.setImage(img2);
	label6 = new JLabel(image2);
	label6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	label6.setBounds(10, 4, 177, 115);
	label6.addMouseListener(this);
	panel.add(label6);
	
	ImageIcon image3 = new ImageIcon("image/gly.jpg");
	Image img3 = image3.getImage();
    img3 = img3.getScaledInstance(120,125,Image.SCALE_DEFAULT); 
    image3.setImage(img3);
	label7 = new JLabel(image3);
	label7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
	label7.setBounds(650, 4, 120, 115);
	panel.add(label7);
	
	label8 = new JLabel("管理员号：");
	label8.setBounds(750, 23, 70, 32);
	panel.add(label8);
	
	label9 = new JLabel("名字：");
	label9.setBounds(760, 52, 70, 32);
	panel.add(label9);
	
	/*label10 = new JLabel();
	Integer a=AdminLogin.admini.getId();
	label10.setText(""+a);
	label10.setBounds(825, 32, 54, 15);
	panel.add(label10);
	
	label11 = new JLabel();
	label11.setText(AdminLogin.admini.getName());
	label11.setBounds(800, 61, 54, 15);
	panel.add(label11);*/
	
	this.add(panel);
	this.setTitle("影院后台管理");
	this.setBounds(228, 39, 906, 639);
	this.setResizable(false);
	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	this.setIconImage(new ImageIcon("image/logo.jpg").getImage());
	this.setVisible(true);
}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		if (e.getSource() == label)
		{
			this.dispose();
			new AddPage();
		} else if (e.getSource() == label2)
		{
			this.dispose();
			new Update();
		} else if (e.getSource() == label3)
		{
			this.dispose();
			new Delete();
		} else if (e.getSource() == label5)
		{
			if (JOptionPane.showConfirmDialog(null, "您确定要退出系统吗?", "退出提示", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION)
			{
				System.exit(0);
			}
		} else if (e.getSource() == label6)
		{
			this.dispose();
			new Administrator();
		}
		
	}
	@Override
	public void mousePressed(MouseEvent e)
	{}
	@Override
	public void mouseReleased(MouseEvent e)
	{}
	@Override
	public void mouseEntered(MouseEvent e)
	{}
	@Override
	public void mouseExited(MouseEvent e)
	{}
}

