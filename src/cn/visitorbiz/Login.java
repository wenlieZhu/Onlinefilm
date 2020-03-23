package cn.visitorbiz;
import java.awt.*;
import javax.swing.*;

import cn.bean.User;
import cn.dao.UserDao;
import cn.dao.impl.UserDaoImpl;
import cn.userbiz.HomePage;

import java.awt.event.*;
@SuppressWarnings("all")
public class Login extends JFrame implements MouseListener
{
	public static User user;
	UserDao userDao = new UserDaoImpl();
	JLabel account,pwd,logo,click,register;
	JTextField text;
	JPasswordField password;
	JButton login;
	public static void main(String[] args)
	{
		Login lo = new Login();
	}
	
	public Login()
	{
		account = new JLabel("账号:");
		account.setFont(new Font("微软雅黑", Font.BOLD, 15));
		account.setHorizontalAlignment(SwingConstants.CENTER);
		account.setBounds(41, 170, 99, 29);
		
		pwd = new JLabel("密码:");
		pwd.setHorizontalAlignment(SwingConstants.CENTER);
		pwd.setFont(new Font("微软雅黑", Font.BOLD, 15));
		pwd.setBounds(41, 221, 99, 29);
		
	    click = new JLabel("还没有账号？点击此处:");
		click.setFont(new Font("微软雅黑", Font.PLAIN, 15));
		click.setBounds(70, 335, 168, 29);
		
		register = new JLabel("免费注册");
        register.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		register.setFont(new Font("微软雅黑", Font.BOLD, 16));
		register.setForeground(Color.RED);
		register.addMouseListener(this);
		register.setBounds(232, 336, 85, 26);
		
		ImageIcon image = new ImageIcon("image/logo.png");
		Image img = image.getImage();
        img = img.getScaledInstance(313, 150, Image.SCALE_DEFAULT); 
        image.setImage(img);
        logo = new JLabel(image);
        logo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        logo.addMouseListener(this);
		logo.setBounds(52, 10, 313, 150);
		
		text = new JTextField();
		text.setBounds(111, 170, 215, 34);
		text.setColumns(10);

		password = new JPasswordField();
		password.setBounds(111, 217, 215, 34);
		
		login = new JButton("登录");
		login.setBounds(153, 291, 115, 23);
		login.addMouseListener(this);
		
		this.add(logo);this.add(account);this.add(text);
		this.add(pwd);this.add(password);this.add(login);
		this.add(click);this.add(register);
		
		this.setTitle("用户登录页面");
		this.setBounds(465, 135, 422, 418);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent arg0)
	{
		if(arg0.getSource()==register)
		{
			this.dispose();
			new Register();
		}else if(arg0.getSource()==login)
		{
			try {
				String tt1=text.getText().toString();
	            String tt2=password.getText().toString();
				Integer c = Integer.parseInt(tt1);
				user=userDao.findUser(c, tt2);
				if(user!=null){
	           	 JOptionPane.showMessageDialog(null, "登录成功","提示",JOptionPane.DEFAULT_OPTION);
	           	 this.dispose();
	           	 new HomePage();
				} 
				else{
	           	 JOptionPane.showMessageDialog(null,"账号或密码错误","提示",JOptionPane.ERROR_MESSAGE);
				}
			}catch(Exception e) {
                JOptionPane.showMessageDialog(null, "账号不存在或密码不能为空","提示",JOptionPane.ERROR_MESSAGE);
			}
		}
		else if(arg0.getSource()==logo)
		{
			this.dispose();
			new cn.visitorbiz.HomePage();
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
