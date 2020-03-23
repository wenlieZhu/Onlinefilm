package cn.tiaoshi;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ChangePicture {

	private JFrame frame;
	
	ImageIcon icon1 = new ImageIcon("image/xuan3.jpg");
	JButton btnNewButton = new JButton(icon1);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChangePicture window = new ChangePicture();
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
	public ChangePicture() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				btnNewButton.setIcon(icon1);
			}
		});
		btnNewButton.setIcon(new ImageIcon("D:\\android_development\\Workspace_qf\\OnlineFilm\\image\\xuan3.jpg"));
		btnNewButton.setBounds(35, 51, 123, 58);
		frame.getContentPane().add(btnNewButton);
	}
}
