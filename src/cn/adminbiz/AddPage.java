package cn.adminbiz;



import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import cn.bean.Film;
import cn.bean.User;
import cn.dao.FilmDao;
import cn.dao.UserDao;
import cn.dao.impl.AdministratorDaoImpl;
import cn.dao.impl.FilmDaoImpl;
import cn.dao.impl.UserDaoImpl;

public class AddPage extends JFrame implements MouseListener
{
	JLabel label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12,label13,label14;
	JPanel panel,panel2,panel3,panel4,panel5,panel6,panel7,panel8,panel9;
	JTextField textField,textField1,textField2,textField3,textField4,textField5;
	JButton button1,button2;
	FilmDao filmDao=new FilmDaoImpl();
	
	public static void main(String []args)
	{
		AddPage ap=new AddPage();
	}
	
	public AddPage()
	{
		
		panel=new JPanel();
		panel.setBackground(new Color(211,211,211));
		panel.setLayout(null);
		
		label=new JLabel("添加电影");
		label.setFont(new Font("微软雅黑",Font.BOLD,19));
		label.setBounds(34,114,105,63);
		label.setForeground(Color.red);
		label.addMouseListener(this);
    	panel.add(label);
    	
    	panel2=new JPanel();
		panel2.setBackground(new Color(255, 255, 255));
		panel2.setBounds(149, 114, 714, 442);
		panel2.setLayout(null);
		panel2.setVisible(true);
		panel.add(panel2);
		
		
		label6 = new JLabel("电影编号：");
		label6.setFont(new Font("微软雅黑", Font.BOLD, 17));
		label6.setBounds(141, 26, 106, 46);
		panel2.add(label6);
		
		textField = new JTextField();
		textField.setBounds(237, 36, 283, 31);
		panel2.add(textField);
		textField.setColumns(10);
		
		label7 = new JLabel("电影名称：");
		label7.setFont(new Font("微软雅黑", Font.BOLD, 17));
		label7.setBounds(141, 82, 106, 46);
		panel2.add(label7);
		
		textField1 = new JTextField();
		textField1.setColumns(10);
		textField1.setBounds(237, 92, 283, 31);
		panel2.add(textField1);
		
		label8 = new JLabel("主演:");
		label8.setFont(new Font("微软雅黑", Font.BOLD, 17));
		label8.setBounds(175, 138, 106, 46);
		panel2.add(label8);
		
		textField2 = new JTextField();
		textField2.setColumns(10);
		textField2.setBounds(237, 148, 283, 31);
		panel2.add(textField2);
		
		label9 = new JLabel("简介:");
		label9.setFont(new Font("微软雅黑", Font.BOLD, 17));
		label9.setBounds(175, 190, 106, 46);
		panel2.add(label9);
		
		textField3 = new JTextField();
		textField3.setColumns(10);
		textField3.setBounds(237, 200, 283, 66);
		panel2.add(textField3);
		
		label10 = new JLabel("电影评分：");
		label10.setFont(new Font("微软雅黑", Font.BOLD, 17));
		label10.setBounds(141, 284, 106, 46);
		panel2.add(label10);
		
		textField4 = new JTextField();
		textField4.setColumns(10);
		textField4.setBounds(237, 294, 283, 31);
		panel2.add(textField4);
		
		label11 = new JLabel("电影类型：");
		label11.setFont(new Font("微软雅黑", Font.BOLD, 17));
		label11.setBounds(141, 340, 106, 46);
		panel2.add(label11);
		
		textField5 = new JTextField();
		textField5.setColumns(10);
		textField5.setBounds(237, 350, 283, 31);
		panel2.add(textField5);
		
		button1 = new JButton("添加");
		button1.setFont(new Font("微软雅黑", Font.BOLD, 13));
		button1.setBounds(185, 400, 106, 31);
		button1.addMouseListener(this);
		panel2.add(button1);
		
		
		button2 = new JButton("取消");
		button2.setFont(new Font("微软雅黑", Font.BOLD, 13));
		button2.setBounds(414, 400, 106, 31);
		button2.addMouseListener(this);
		panel2.add(button2);
		
		label2=new JLabel("修改电影");
		label2.setFont(new Font("微软雅黑",Font.BOLD,19));
		label2.setBounds(34,211,105,63);
		label2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		label2.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		label2.setForeground(Color.BLACK);
        	}
        });
		label2.addMouseListener(this);
		panel.add(label2);
		
		label3=new JLabel("删除电影");
		label3.setFont(new Font("微软雅黑",Font.BOLD,19));
		label3.setBounds(34,306,105,63);
		label3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		label3.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		label3.setForeground(Color.BLACK);
        	}
        });
		label3.addMouseListener(this);
		panel.add(label3);
		
		label4=new JLabel("查询订单");
		label4.setFont(new Font("微软雅黑",Font.BOLD,19));
		label4.setBounds(34,402,105,63);
		label4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		label4.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		label4.setForeground(Color.BLACK);
        	}
        });
		label4.addMouseListener(this);
		panel.add(label4);
		
		label5=new JLabel("退出系统");
		label5.setFont(new Font("微软雅黑",Font.BOLD,19));
		label5.setBounds(34,493,105,63);
		label5.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		label5.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		label5.setForeground(Color.BLACK);
        	}
        });
		label5.addMouseListener(this);
		panel.add(label5);

		ImageIcon image2 = new ImageIcon("image/logo.jpg");
		Image img2 = image2.getImage();
        img2 = img2.getScaledInstance(177, 115, Image.SCALE_DEFAULT); 
        image2.setImage(img2);
		label9 = new JLabel(image2);
		label9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label9.setBounds(10, 4, 177, 115);
		label9.addMouseListener(this);
		panel.add(label9);
		
		ImageIcon image3 = new ImageIcon("image/gly.jpg");
		Image img3 = image3.getImage();
        img3 = img3.getScaledInstance(120,125,Image.SCALE_DEFAULT); 
        image3.setImage(img3);
		label10 = new JLabel(image3);
		label10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label10.setBounds(650, 4, 120, 115);
		panel.add(label10);
		
		label11 = new JLabel("管理员号：");
		label11.setBounds(750, 23, 70, 32);
		panel.add(label11);
		
		label12 = new JLabel("名字：");
		label12.setBounds(760, 52, 70, 32);
		panel.add(label12);
		
		label13 = new JLabel();
		Integer a=AdminLogin.admini.getId();
		label13.setText(""+a);
		label13.setBounds(825, 32, 54, 15);
		panel.add(label13);
		
		label14 = new JLabel();
		label14.setText(AdminLogin.admini.getName());
		label14.setBounds(800, 61, 54, 15);
		panel.add(label14);
		
		this.add(panel);
		this.setTitle("影院后台管理");
		this.setBounds(228,39,906,639);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.jpg").getImage());
		this.setVisible(true);
	}	
	@Override
	public void mouseClicked(MouseEvent e){
		if(e.getSource()==label2)
		{	
			this.dispose();
			new Update();
		}
		else if(e.getSource()==label3)
		{
			this.dispose();
			new Delete();
		}
		else if(e.getSource()==label4)
		{
			this.dispose();
			new Select();
		}
		else if(e.getSource()==label5)
		{
		if(JOptionPane.showConfirmDialog(null, "您确定要退出系统吗?","退出提示",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==JOptionPane.YES_OPTION){
			 System.exit(0);
		}		
		}
		
		else if(e.getSource()==label9)
		{
			this.dispose();
			new Administrator();
		}
		else if(e.getSource()==button1)
		{
			try 
			{
				String t1=textField.getText().toString();
				Integer a = Integer.parseInt(t1);
				List<Film> list = filmDao.findFilmById(a);
				for(Film f:list){
					f.getId();
					
					
				}
	
	            String sql = "select id from film";
	            String t2=textField1.getText().toString();
				String t3=textField2.getText().toString();
	            String t4=textField3.getText().toString();
	            String t5=textField4.getText().toString();
	            Double b=Double.valueOf(t5);
	            String t6=textField5.getText().toString();
	            Integer c = Integer.parseInt(t6);
	            
	            if(t1.equals("")||t2.equals("")||t3.equals("")||t4.equals("")||t5.equals("")||t6.equals(""))
				{
	                JOptionPane.showMessageDialog(null, "不能为空","提示",JOptionPane.ERROR_MESSAGE);
				}			
//	            else if(a!=null)
//				{
//					JOptionPane.showMessageDialog(null, "电影已存在","提示",JOptionPane.ERROR_MESSAGE);
//				}
	            else
				{
					 filmDao.doFilm(new Film(a,t2,t3,t4,b,c));
		           	 JOptionPane.showMessageDialog(null, "添加成功","提示",JOptionPane.DEFAULT_OPTION);
		           	 this.dispose();
		           	 new AddPage();
				}
			}
			catch(Exception a)
				{
					JOptionPane.showMessageDialog(null, "电影已存在或不能为空","提示",JOptionPane.ERROR_MESSAGE);
				}
		}
		else if(e.getSource()==button2)
		{
			this.dispose();
			new Administrator();
		}
	}
	@Override
	public void mousePressed(MouseEvent e){}
	@Override
	public void mouseReleased(MouseEvent e){}
	@Override
	public void mouseEntered(MouseEvent e){}
	@Override
	public void mouseExited(MouseEvent e){}
}
