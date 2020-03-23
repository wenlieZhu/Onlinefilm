package cn.visitorbiz;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import cn.bean.User;
import cn.dao.UserDao;
import cn.dao.impl.UserDaoImpl;

@SuppressWarnings("all")
public class Register extends JFrame implements MouseListener
{
	JLabel logo,account,phone,pwd,name,click,login;
	JTextField text,pho,cfpwd;
	JPasswordField password;
	JButton register;
	UserDao userDao = new UserDaoImpl();

	public static void main(String[] args)
	{
		Register re = new Register();
	}
	
	public Register()
	{
		account = new JLabel("请输入账号:");
		phone = new JLabel("请输入手机号:");
		pwd = new JLabel("请输入密码:");
		name = new JLabel("请输入昵称:");
		click = new JLabel("已经有账号？点击此处:");
		login = new JLabel("登录");
		text = new JTextField();
		pho = new JTextField();
		password = new JPasswordField();
		cfpwd = new JTextField();
		register = new JButton("注册");
		
		ImageIcon image = new ImageIcon("image/logo.png");
		Image img = image.getImage();
        img = img.getScaledInstance(313, 150, Image.SCALE_DEFAULT); 
        image.setImage(img);
        logo = new JLabel(image);
        logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logo.addMouseListener(this);
        logo.setBounds(35, 10, 313, 150);

        account.setHorizontalAlignment(SwingConstants.CENTER);
        account.setFont(new Font("微软雅黑", Font.BOLD, 15));
        account.setBounds(23, 173, 99, 29);

        name.setHorizontalAlignment(SwingConstants.CENTER);
        name.setFont(new Font("微软雅黑", Font.BOLD, 15));
        name.setBounds(10, 221, 112, 29);

        pwd.setHorizontalAlignment(SwingConstants.CENTER);
        pwd.setFont(new Font("微软雅黑", Font.BOLD, 15));
        pwd.setBounds(25, 269, 99, 29);
        
        phone.setHorizontalAlignment(SwingConstants.CENTER);
        phone.setFont(new Font("微软雅黑", Font.BOLD, 15));
        phone.setBounds(10, 318, 126, 29);
        
        text.setColumns(10);
		text.setBounds(134, 169, 215, 35);
		
		pho.setColumns(10);
		pho.setBounds(134, 217, 215, 35);
		
		password.setBounds(134, 265, 215, 35);
		cfpwd.setBounds(134,314 , 215, 35);
		
		register.setBounds(144, 364, 96, 26);
		register.addMouseListener(this);

		
		click.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		click.setBounds(72, 400, 168, 29);
		
		login.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		login.addMouseListener(this);
		login.setForeground(Color.RED);
		login.setFont(new Font("微软雅黑", Font.BOLD, 18));
		login.setBounds(237, 400, 59, 26);
		
		this.add(logo);this.add(account);this.add(text);
		this.add(phone);this.add(pho);this.add(pwd);
		this.add(password);this.add(name);this.add(cfpwd);
		this.add(register);this.add(click);this.add(login);
		
		this.setTitle("用户注册页面");
		this.setBounds(465, 135, 422, 468);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
	}
	@Override
	public void mouseClicked(MouseEvent e)
	{
		if(e.getSource()==login)
		{
			this.dispose();
			new Login();
		}else if(e.getSource()==register)
		{
			try 
			{
				String t1=text.getText().toString();
				Integer a = Integer.parseInt(t1);
				User u = userDao.findUserById(a);
	
	            String sql = "select id from user";
	            String t2=pho.getText().toString();
				String t3=password.getText().toString();
	            String t4=cfpwd.getText().toString();
	            
	            
	            if(t1.equals("")||t2.equals("")||t3.equals("")||t4.equals(""))
				{
	                JOptionPane.showMessageDialog(null, "账号或密码不能为空","提示",JOptionPane.ERROR_MESSAGE);
				}			
	            else if(u!=null)
				{
					JOptionPane.showMessageDialog(null, "账号已存在","提示",JOptionPane.ERROR_MESSAGE);
	            	
				}
	            else
				{
					 userDao.doUser(new User(a,t2,t3,t4));
		           	 JOptionPane.showMessageDialog(null, "注册成功","提示",JOptionPane.DEFAULT_OPTION);
		           	 this.dispose();
		           	 new Login();
				}
			}
			catch(Exception a)
				{
					JOptionPane.showMessageDialog(null, "账号不能为空","提示",JOptionPane.ERROR_MESSAGE);
				}
			}else if(e.getSource()==logo)
			{
			this.dispose();
			new HomePage();
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
