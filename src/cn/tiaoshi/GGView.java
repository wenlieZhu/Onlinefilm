package cn.tiaoshi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JMenuBar;
import javax.swing.JTextPane;

import org.junit.Test;

import cn.dao.UserDao;
import cn.dao.impl.UserDaoImpl;

import javax.swing.JList;
import javax.swing.JSplitPane;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class GGView {

	private JFrame frame;
	private static JTextField textField6;
	private JTextField textField_1;
	private final Action action = new SwingAction();
	private JLabel label;
	
	
	
	

	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GGView window = new GGView();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GGView() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 637, 499);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField6 = new JTextField();
		textField6.setFont(new Font("宋体", Font.PLAIN, 25));
		textField6.setBounds(158, 131, 281, 65);
		frame.getContentPane().add(textField6);
		textField6.setColumns(10);
		
		//textField6.setText("2");
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("宋体", Font.PLAIN, 25));
		textField_1.setBounds(163, 211, 276, 71);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnLogin = new JButton("登录");
		btnLogin.setFont(new Font("宋体", Font.PLAIN, 24));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UserDao userDao=new UserDaoImpl();
				
				String a=textField6.getText();
				String b=textField_1.getText();
				Integer c = Integer.parseInt(a);
				userDao.findUser(c, b);
				
				new Yes();
				
			}
		});
		btnLogin.setBounds(218, 316, 154, 55);
		frame.getContentPane().add(btnLogin);
		
		
		
		
		label = new JLabel("欢迎进入影城票务管理系统");
		label.setFont(new Font("华文隶书", Font.BOLD, 32));
		label.setBackground(Color.GREEN);
		label.setBounds(128, 64, 426, 55);
		frame.getContentPane().add(label);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
