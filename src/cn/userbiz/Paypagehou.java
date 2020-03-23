package cn.userbiz;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.Toolkit;

public class Paypagehou {

	private JFrame framehou;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Paypagehou window = new Paypagehou();
					window.framehou.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Paypagehou() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		framehou = new JFrame();
		framehou.setIconImage(Toolkit.getDefaultToolkit().getImage("D:\\android_development\\Workspace_qf\\OnlineFilm\\image\\logo.png"));
		framehou.setTitle("在线安全支付");
		framehou.setBounds(100, 100, 772, 587);
		framehou.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		framehou.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("恭喜您，支付成功！");
		label.setForeground(Color.RED);
		label.setFont(new Font("宋体", Font.BOLD, 30));
		label.setBounds(107, 40, 349, 65);
		framehou.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("查看购票信息");
		btnNewButton.setBackground(Color.LIGHT_GRAY);
		btnNewButton.setForeground(Color.RED);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				framehou.dispose();
		  		new Orders();
			}
		});
		btnNewButton.setFont(new Font("宋体", Font.BOLD, 30));
		btnNewButton.setBounds(485, 461, 250, 55);
		framehou.getContentPane().add(btnNewButton);
		
		JLabel label_1 = new JLabel("请凭手机短信验证码到影院取票");
		label_1.setForeground(Color.RED);
		label_1.setFont(new Font("宋体", Font.BOLD, 30));
		label_1.setBounds(106, 103, 601, 65);
		framehou.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("祝您观影愉快！");
		label_2.setForeground(Color.RED);
		label_2.setFont(new Font("宋体", Font.BOLD, 30));
		label_2.setBounds(105, 168, 543, 65);
		framehou.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("温馨提示：有问题及时联系客服，谨防上当受骗！");
		label_3.setBackground(Color.YELLOW);
		label_3.setForeground(Color.BLACK);
		label_3.setFont(new Font("宋体", Font.BOLD, 20));
		label_3.setBounds(99, 233, 512, 43);
		framehou.getContentPane().add(label_3);
		
		JLabel lblBg = new JLabel("bg");
		lblBg.setIcon(new ImageIcon("D:\\android_development\\Workspace_qf\\OnlineFilm\\image\\zhifubeijinghou.jpg"));
		lblBg.setBounds(0, 0, 750, 531);
		framehou.getContentPane().add(lblBg);
	}
}
