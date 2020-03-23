package cn.visitorbiz;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import cn.dao.AdministratorDao;
import cn.dao.impl.AdministratorDaoImpl;

@SuppressWarnings("all")
public class AdminLogin extends JFrame implements ActionListener
{
	JLabel account,pwd,logo;
	JTextField text;
	JPasswordField password;
	JButton login;
	AdministratorDao admindao=new AdministratorDaoImpl();
	
	public AdminLogin()
	{
		account = new JLabel("账号:");
		pwd = new JLabel("密码:");
		text = new JTextField();
		password = new JPasswordField();
		login = new JButton("管理员登录");
		
		ImageIcon image = new ImageIcon("image/logo.png");
		Image img = image.getImage();
        img = img.getScaledInstance(313, 150, Image.SCALE_DEFAULT); 
        image.setImage(img);
        logo = new JLabel(image);
        logo.setBounds(10, 10, 313, 150);
		
		account.setHorizontalAlignment(SwingConstants.CENTER);
		account.setFont(new Font("微软雅黑", Font.BOLD, 15));
		account.setBounds(10, 185, 99, 29);
				
		pwd.setHorizontalAlignment(SwingConstants.CENTER);
		pwd.setFont(new Font("微软雅黑", Font.BOLD, 15));
		pwd.setBounds(10, 236, 99, 29);
		
		text.setColumns(10);
		text.setBounds(80, 185, 215, 34);
		
		password.setBounds(80, 232, 215, 34);
		
		login.setForeground(Color.DARK_GRAY);
		login.setBackground(Color.WHITE);
		login.setFont(new Font("微软雅黑", Font.BOLD, 16));
		login.addActionListener(this);
		login.setBounds(115, 286, 128, 34);
		
		getContentPane().add(logo);getContentPane().add(account);getContentPane().add(text);
		getContentPane().add(pwd);getContentPane().add(password);getContentPane().add(login);
		
		this.setTitle("管理员登陆页面");
		this.setBounds(510, 155,336, 387);
		getContentPane().setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setIconImage(new ImageIcon("image/logo.png").getImage());
		this.setVisible(true);
	}
	public static void main(String[] args)
	{
		AdminLogin ad = new AdminLogin();
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==login)
		{
			String tt1=text.getText().toString();
            String tt2=password.getText().toString();
            Integer tt3=Integer.parseInt(tt1);
            
			if(tt3.equals("")||tt2.equals(""))
			{
                JOptionPane.showMessageDialog(null, "账号或密码不能为空","提示",JOptionPane.ERROR_MESSAGE);
			}
			else{
				admindao.adminlogin(tt3, tt2);
				this.dispose();
				new cn.adminbiz.Administrator();
			}
		}
	}

}
