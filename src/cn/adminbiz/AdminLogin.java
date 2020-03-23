package cn.adminbiz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import cn.bean.Administrator;
import cn.adminbiz.*;
import cn.dao.AdministratorDao;
import cn.dao.impl.AdministratorDaoImpl;

@SuppressWarnings("all")
public class AdminLogin extends JFrame implements MouseListener
{
	static Administrator admini;
	public static Administrator administrator;
	JLabel account,pwd,logo,click,register;
	JTextField text;
	JPasswordField password;
	JButton adminlogin;
	AdministratorDao adminiDao=new AdministratorDaoImpl();
	
	public AdminLogin()
	{
		account = new JLabel("账号:");
		pwd = new JLabel("密码:");
		text = new JTextField();
		password = new JPasswordField();
		adminlogin = new JButton("管理员登录");
		
		ImageIcon image = new ImageIcon("image/logo.jpg");
		Image img = image.getImage();
        img = img.getScaledInstance(313, 150, Image.SCALE_DEFAULT); 
        image.setImage(img);
        logo = new JLabel(image);
        logo.setBounds(10, 10, 313, 150);
		
        account = new JLabel("账号:");
		account.setFont(new Font("微软雅黑", Font.BOLD, 15));
		account.setHorizontalAlignment(SwingConstants.CENTER);
		account.setBounds(41, 170, 99, 29);
		
		pwd = new JLabel("密码:");
		pwd.setHorizontalAlignment(SwingConstants.CENTER);
		pwd.setFont(new Font("微软雅黑", Font.BOLD, 15));
		pwd.setBounds(41, 221, 99, 29);
		
		ImageIcon image1 = new ImageIcon("image/logo.jpg");
		Image img1 = image1.getImage();
        img1 = img1.getScaledInstance(313, 150, Image.SCALE_DEFAULT); 
        image1.setImage(img1);
        logo = new JLabel(image1);
        logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		logo.setBounds(52, 10, 313, 150);
		
		text = new JTextField();
		text.setBounds(111, 170, 215, 34);
		text.setColumns(10);

		password = new JPasswordField();
		password.setBounds(111, 217, 215, 34);
		
		adminlogin = new JButton("管理员登录");
		adminlogin.setBounds(153, 291, 115, 23);
		adminlogin.addMouseListener(this);
		
		getContentPane().add(logo);getContentPane().add(account);getContentPane().add(text);
		getContentPane().add(pwd);getContentPane().add(password);getContentPane().add(adminlogin);
		
		this.setTitle("管理员登录页面");
		this.setBounds(465, 135, 422, 418);
		getContentPane().setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.jpg").getImage());
		this.setVisible(true);
	}
	public static void main(String[] args)
	{
		AdminLogin ad = new AdminLogin();

	}
	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		if(arg0.getSource()==adminlogin)
		{
			try 
			{
				String tt1=text.getText().toString();
	            String tt2=password.getText().toString();
				Integer c = Integer.parseInt(tt1);
				admini = adminiDao.adminlogin(c, tt2);
				if(admini!=null)
				{	
	           	 JOptionPane.showMessageDialog(null, "登录成功","提示",JOptionPane.DEFAULT_OPTION);
	           	 this.dispose();
	             new cn.adminbiz.Administrator();
	            
				} 
				else
				{
	           	 JOptionPane.showMessageDialog(null,"账号或密码错误","提示",JOptionPane.ERROR_MESSAGE);
				}
			}
			catch(Exception e) 
			{
                JOptionPane.showMessageDialog(null, "账号不存在或密码不能为空","提示",JOptionPane.ERROR_MESSAGE);
			}
		}	
	}
	@Override
	public void mouseEntered(MouseEvent arg0)
	{}
	@Override
	public void mouseExited(MouseEvent arg0)
	{}
	@Override
	public void mousePressed(MouseEvent arg0)
	{}
	@Override
	public void mouseReleased(MouseEvent arg0)
	{}
		
}