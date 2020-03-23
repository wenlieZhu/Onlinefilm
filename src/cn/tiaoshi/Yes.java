package cn.tiaoshi;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.junit.Test;

import javax.swing.JLabel;
import java.awt.Font;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import cn.bean.Area;
import cn.bean.User;
import cn.dao.AreaDao;
import cn.dao.UserDao;
import cn.dao.impl.AreaDaoImpl;
import cn.dao.impl.UserDaoImpl;

import java.awt.event.ActionListener;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JTextArea;

public class Yes extends JDialog {
	UserDao userDao=new UserDaoImpl();
	
	public void display(){
		User user=userDao.findUserById(1);
		System.out.println(user.getName());
		
	}

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Yes dialog = new Yes();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public Yes() {
		setTitle("登录成功，欢迎您！");
		
		setBounds(100, 100, 681, 447);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel label = new JLabel("登录成功");
			label.setFont(new Font("楷体", Font.PLAIN, 30));
			label.setBounds(51, 15, 231, 74);
			contentPanel.add(label);
			
			
			
			JTextArea textArea = new JTextArea();
			textArea.setFont(new Font("Monospaced", Font.PLAIN, 25));
			textArea.setBounds(35, 94, 587, 243);
			textArea.setLineWrap(true);
			//把数据传过来
			textArea.setText("jij");
			
			contentPanel.add(textArea);
			{
				GGView gg=new GGView();
				
			
			
				User user=userDao.findUserById(4);
				JLabel label_1 = new JLabel("欢迎用户"+user.getName());
				label_1.setFont(new Font("宋体", Font.PLAIN, 24));
				label_1.setBounds(207, 38, 259, 29);
				contentPanel.add(label_1);
			}
			setVisible(true);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.exit(0);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
}
