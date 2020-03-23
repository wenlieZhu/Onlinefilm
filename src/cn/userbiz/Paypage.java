package cn.userbiz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import java.awt.Toolkit;
import java.awt.Color;

public class Paypage {

	private JFrame frame;
	//创建背景面板。
		

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paypage window = new Paypage();
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
	public Paypage() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\android_development\\Workspace_qf\\OnlineFilm\\image\\logo.png"));
		frame.setTitle("在线安全支付");
		frame.setBounds(100, 100, 712, 737);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("请选择支付方式");
		label.setForeground(Color.RED);
		label.setFont(new Font("楷体", Font.BOLD, 35));
		label.setBounds(184, 15, 326, 65);
		frame.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("去支付");
		btnNewButton.setBackground(Color.PINK);
		btnNewButton.setForeground(Color.YELLOW);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Paypagehou paypagehou=new Paypagehou();
				paypagehou.main(null);
				frame.dispose();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 30));
		btnNewButton.setBounds(523, 611, 152, 55);
		frame.getContentPane().add(btnNewButton);
		
		JRadioButton radioButton = new JRadioButton("微信");
		radioButton.setFont(new Font("宋体", Font.BOLD, 30));
		radioButton.setBounds(48, 91, 124, 29);
		radioButton.setContentAreaFilled(false);
		frame.getContentPane().add(radioButton);
		
		
		JRadioButton radioButton_1 = new JRadioButton("支付宝");
		radioButton_1.setFont(new Font("宋体", Font.BOLD, 30));
		radioButton_1.setBounds(48, 178, 177, 29);
		radioButton_1.setContentAreaFilled(false);
		frame.getContentPane().add(radioButton_1);
		
		JRadioButton radioButton_2 = new JRadioButton("银联");
		radioButton_2.setFont(new Font("宋体", Font.BOLD, 30));
		radioButton_2.setBounds(48, 270, 177, 29);
		radioButton_2.setContentAreaFilled(false);
		frame.getContentPane().add(radioButton_2);
		
		JRadioButton rdbtnVisa = new JRadioButton("VISA");
		rdbtnVisa.setFont(new Font("宋体", Font.BOLD, 30));
		rdbtnVisa.setBounds(48, 376, 177, 29);
		rdbtnVisa.setContentAreaFilled(false);
		frame.getContentPane().add(rdbtnVisa);
		
		JRadioButton rdbtnMastercard = new JRadioButton("MasterCard");
		rdbtnMastercard.setFont(new Font("宋体", Font.BOLD, 30));
		rdbtnMastercard.setBounds(48, 471, 210, 29);
		rdbtnMastercard.setContentAreaFilled(false);
		frame.getContentPane().add(rdbtnMastercard);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("image\\weixinpay.jpg"));
		lblNewLabel.setBounds(250, 95, 200, 65);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel label_1 = new JLabel("New label");
		label_1.setIcon(new ImageIcon("image\\alipay.jpg"));
		label_1.setBounds(250, 178, 200, 65);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("New label");
		label_2.setIcon(new ImageIcon("image\\yinlianpay.jpg"));
		label_2.setBounds(250, 277, 200, 65);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("New label");
		label_3.setIcon(new ImageIcon("image\\visapay.jpg"));
		label_3.setBounds(250, 376, 200, 65);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("New label");
		label_4.setIcon(new ImageIcon("image\\wanshidapay.jpg"));
		label_4.setBounds(250, 471, 200, 65);
		frame.getContentPane().add(label_4);
		
		JLabel lblNewLabel_1 = new JLabel("bg");
		lblNewLabel_1.setIcon(new ImageIcon("image\\zhifubeijing.jpg"));
		lblNewLabel_1.setBounds(0, 0, 690, 681);
		frame.getContentPane().add(lblNewLabel_1);
		
		ButtonGroup button = new ButtonGroup();
		button.add(radioButton);
		button.add(radioButton_1);
		button.add(radioButton_2);
		button.add(rdbtnVisa);
		button.add(rdbtnMastercard);
		//frame.add(panel);
		
		
	}
}
