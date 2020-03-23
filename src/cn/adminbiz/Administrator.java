package cn.adminbiz;



import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.LayoutManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Administrator extends JFrame implements MouseListener
{
	JLabel label,label2,label3,label4,label5,label6,label7,label8,label9,label10,label11,label12;
	JPanel panel;
	public static void main(String []args)
	{
		Administrator admini=new Administrator();
	}
	
	public Administrator()
	{
		panel=new JPanel();
		panel.setBackground(new Color(211,211,211));
		panel.setLayout(null);
		
		label=new JLabel("添加电影");
		label.setFont(new Font("微软雅黑",Font.BOLD,19));
		label.setBounds(34,114,105,63);
		label.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseEntered(MouseEvent arg0) {
        		label.setForeground(new Color(255, 0, 0));
        	}
        	@Override
        	public void mouseExited(MouseEvent e) {
        		label.setForeground(Color.BLACK);
        	}
        });
		label.addMouseListener(this);
    	panel.add(label);
		
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
		label6 = new JLabel(image2);
		label6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label6.setBounds(10, 4, 177, 115);
		label6.addMouseListener(this);
		panel.add(label6);
		
		label7=new JLabel(new ImageIcon("image/zm.jpg"));
		label7.setBounds(149, 114, 714, 442);
		panel.add(label7);
		ImageIcon icon=new ImageIcon("image/zm.jpg");
		
		ImageIcon image3 = new ImageIcon("image/gly.jpg");
		Image img3 = image3.getImage();
        img3 = img3.getScaledInstance(120,125,Image.SCALE_DEFAULT); 
        image3.setImage(img3);
		label8 = new JLabel(image3);
		label8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		label8.setBounds(650, 4, 120, 115);
		panel.add(label8);
		
		label9 = new JLabel("管理员号：");
		label9.setBounds(750, 23, 70, 32);
		panel.add(label9);
		
		label10 = new JLabel("名字：");
		label10.setBounds(760, 52, 70, 32);
		panel.add(label10);
		
		label11 = new JLabel("id");
		label11.setBounds(825, 32, 54, 15);
		panel.add(label11);
		
		label12 = new JLabel("name");
		label12.setBounds(800, 61, 54, 15);
		panel.add(label12);
		
		getContentPane().add(panel);
		this.setTitle("管理员首页");
		this.setBounds(228,39,906,639);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}	
	
	@Override
	public void mouseClicked(MouseEvent e){
		if(e.getSource()==label)
		{
			this.dispose();
			new AddPage();
		}
		else if(e.getSource()==label2)
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
		else if(e.getSource()==label6)
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