package cn.tiaoshi;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.Icon;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseMotionAdapter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.JFormattedTextField;
import java.awt.Panel;
import java.awt.Canvas;
/**
 * 自定义图片按钮
 * @author lenovo
 *
 */
public class EventDemo {
	
	private JLabel t1;
	private JLabel t2;
	private JLabel t3;
	
	
    //声明窗体
    private JFrame frame = null;
    
    //获取按钮方法
    public void getButtonss(){
        //创建窗体并设置标题
        frame = new JFrame("选座位界面");
        frame.getContentPane().setBackground(new Color(255, 245, 238));
        frame.getContentPane().setForeground(Color.WHITE);
        
        //创建图片容器并赋予图片路径
        //可选择座位
        ImageIcon icon = new ImageIcon("C:/Users/1540664154/Desktop/项目/xuan3.jpg");
        JButton button = new JButton(icon);
        //已选择座位
        ImageIcon icon2 = new ImageIcon("C:/Users/1540664154/Desktop/项目/xuan1.jpg");
        JButton button2 = new JButton(icon2);
        //已售出
        ImageIcon icon3 = new ImageIcon("C:/Users/1540664154/Desktop/项目/xuan2.jpg");
        JButton button3 = new JButton(icon3);
        button.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button.setIcon(icon2);
        	}
        });
        button.setLocation(154, 213);
        //设置图片大小
        button.setSize(50,40);
        //使窗体居中
        frame.setLocationRelativeTo(null);
        
        //窗体大小自定义
        frame.setSize(1189,702);
        //点击窗体关闭时同时关闭后台服务
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //使窗体可视化
        frame.setVisible(true);
        frame.getContentPane().setLayout(null);
        //把按钮放进窗体中
        frame.getContentPane().add(button);
        
        JButton button_1 = new JButton((Icon) null);
       
        button_1.addActionListener(new ActionListener() {
        	
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        
        
        
        button_1.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        			button_1.setIcon(icon2);
        			
        		}
        		
        		
        	
        	
        	
        });
        button_1.setBounds(234, 213, 50, 40);
        button_1.setIcon(icon);
        frame.getContentPane().add(button_1);
       
        
        
        JButton button_2 = new JButton((Icon) null);
        button_2.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_2.setIcon(icon2);
        	}
        });
        button_2.setBounds(316, 213, 50, 40);
        button_2.setIcon(icon);
        frame.getContentPane().add(button_2);
        
        JButton button_3 = new JButton((Icon) null);
        button_3.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_3.setIcon(icon2);
        	}
        });
        button_3.setBounds(391, 213, 50, 40);
        button_3.setIcon(icon);
        frame.getContentPane().add(button_3);
        
        JButton button_4 = new JButton((Icon) null);
        button_4.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_4.setIcon(icon2);
        	}
        });
        button_4.setBounds(465, 213, 50, 40);
        button_4.setIcon(icon);
        frame.getContentPane().add(button_4);
        
        JButton button_5 = new JButton((Icon) null);
        button_5.setBounds(154, 285, 50, 40);
        button_5.setIcon(icon3);
        frame.getContentPane().add(button_5);
        
        JButton button_6 = new JButton((Icon) null);
        button_6.setBounds(234, 285, 50, 40);
        button_6.setIcon(icon3);
        frame.getContentPane().add(button_6);
        
        JButton button_7 = new JButton((Icon) null);
        button_7.setBounds(316, 285, 50, 40);
        button_7.setIcon(icon3);
        frame.getContentPane().add(button_7);
        
        JButton button_8 = new JButton((Icon) null);
        button_8.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_8.setIcon(icon2);
        	}
        });
        button_8.setBounds(391, 285, 50, 40);
        button_8.setIcon(icon);
        frame.getContentPane().add(button_8);
        
        JButton button_9 = new JButton((Icon) null);
        button_9.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_9.setIcon(icon2);
        	}
        });
        button_9.setBounds(465, 285, 50, 40);
        button_9.setIcon(icon);
        frame.getContentPane().add(button_9);
        
        JButton button_10 = new JButton((Icon) null);
        button_10.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_10.setIcon(icon2);
        	}
        });
        button_10.setBounds(154, 350, 50, 40);
        button_10.setIcon(icon);
        frame.getContentPane().add(button_10);
        
        JButton button_11 = new JButton((Icon) null);
        button_11.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_11.setIcon(icon2);
        	}
        });
        button_11.setBounds(234, 350, 50, 40);
        button_11.setIcon(icon);
        frame.getContentPane().add(button_11);
        
        JButton button_12 = new JButton((Icon) null);
        button_12.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_12.setIcon(icon2);
        	}
        });
        button_12.setBounds(316, 350, 50, 40);
        button_12.setIcon(icon);
        frame.getContentPane().add(button_12);
        
        JButton button_13 = new JButton((Icon) null);
        button_13.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_13.setIcon(icon2);
        		JFormattedTextField fr = new JFormattedTextField();
    	        fr.setFont(new Font("宋体", Font.BOLD, 32));
    	        fr.setForeground(UIManager.getColor("textHighlight"));
    	        fr.setEditable(false);
    	        fr.setText("3排04座");
    	        fr.setBounds(213, 564, 140, 66);
    	        frame.getContentPane().add(fr);
    	       // String a=fr.getText();
    	       // System.out.println(a);
        	}
        });
        button_13.setBounds(391, 350, 50, 40);
        button_13.setIcon(icon);
        frame.getContentPane().add(button_13);
        
        JButton button_14 = new JButton((Icon) null);
        button_14.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_14.setIcon(icon2);
        		JFormattedTextField fr = new JFormattedTextField();
    	        fr.setFont(new Font("宋体", Font.BOLD, 32));
    	        fr.setForeground(UIManager.getColor("textHighlight"));
    	        fr.setEditable(false);
    	        fr.setText("3排05座");
    	        fr.setBounds(354, 564, 140, 66);
    	        frame.getContentPane().add(fr);
    	       // String a=fr.getText();
    	       // System.out.println(a);
        	}
        });
        button_14.setBounds(465, 350, 50, 40);
        button_14.setIcon(icon);
        frame.getContentPane().add(button_14);
        
        JButton button_15 = new JButton((Icon) null);
        button_15.setBounds(154, 411, 50, 40);
        button_15.setIcon(icon3);
        frame.getContentPane().add(button_15);
        
        JButton button_16 = new JButton((Icon) null);
        button_16.setBounds(234, 411, 50, 40);
        button_16.setIcon(icon3);
        frame.getContentPane().add(button_16);
        
        JButton button_17 = new JButton((Icon) null);
        button_17.setBounds(316, 411, 50, 40);
        button_17.setIcon(icon3);
        frame.getContentPane().add(button_17);
        
        JButton button_18 = new JButton((Icon) null);
        button_18.setBounds(391, 411, 50, 40);
        button_18.setIcon(icon3);
        frame.getContentPane().add(button_18);
        
        JButton button_19 = new JButton((Icon) null);
        button_19.setBounds(465, 411, 50, 40);
        button_19.setIcon(icon3);
        frame.getContentPane().add(button_19);
        
        JLabel label = new JLabel("中    国    巨    幕");
        label.setForeground(new Color(255, 99, 71));
        label.setBackground(Color.WHITE);
        label.setFont(new Font("华文新魏", Font.BOLD, 58));
        label.setBounds(383, 78, 448, 80);
        frame.getContentPane().add(label);
        
        JButton button_20 = new JButton((Icon) null);
        button_20.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_20.setIcon(icon2);
        	}
        });
        button_20.setBounds(640, 213, 50, 40);
        button_20.setIcon(icon);
        frame.getContentPane().add(button_20);
        
        JButton button_21 = new JButton((Icon) null);
        button_21.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_21.setIcon(icon2);
        	}
        });
        button_21.setBounds(640, 285, 50, 40);
        button_21.setIcon(icon);
        frame.getContentPane().add(button_21);
        
        JButton button_22 = new JButton((Icon) null);
        button_22.setBounds(640, 350, 50, 40);
        button_22.setIcon(icon3);
        frame.getContentPane().add(button_22);
        
        JButton button_23 = new JButton((Icon) null);
        button_23.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_23.setIcon(icon2);
        	}
        });
        button_23.setBounds(640, 411, 50, 40);
        button_23.setIcon(icon);
        frame.getContentPane().add(button_23);
        
        JButton button_24 = new JButton((Icon) null);
        button_24.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_24.setIcon(icon2);
        	}
        });
        button_24.setBounds(719, 213, 50, 40);
        button_24.setIcon(icon);
        frame.getContentPane().add(button_24);
        
        JButton button_25 = new JButton((Icon) null);
        button_25.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_25.setIcon(icon2);
        	}
        });
        button_25.setBounds(719, 285, 50, 40);
        button_25.setIcon(icon);
        frame.getContentPane().add(button_25);
        
        JButton button_26 = new JButton((Icon) null);
        button_26.setBounds(719, 350, 50, 40);
        button_26.setIcon(icon3);
        frame.getContentPane().add(button_26);
        
        JButton button_27 = new JButton((Icon) null);
        button_27.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_27.setIcon(icon2);
        	}
        });
        button_27.setBounds(719, 411, 50, 40);
        button_27.setIcon(icon);
        frame.getContentPane().add(button_27);
        
        JButton button_28 = new JButton((Icon) null);
        button_28.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_28.setIcon(icon2);
        	}
        });
        button_28.setBounds(800, 213, 50, 40);
        button_28.setIcon(icon);
        frame.getContentPane().add(button_28);
        
        JButton button_29 = new JButton((Icon) null);
        button_29.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_29.setIcon(icon2);
        	}
        });
        button_29.setBounds(800, 285, 50, 40);
        button_29.setIcon(icon);
        frame.getContentPane().add(button_29);
        
        JButton button_30 = new JButton((Icon) null);
        button_30.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_30.setIcon(icon2);
        	}
        });
        button_30.setBounds(800, 350, 50, 40);
        button_30.setIcon(icon);
        frame.getContentPane().add(button_30);
        
        JButton button_31 = new JButton((Icon) null);
        button_31.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		button_31.setIcon(icon2);
        	}
        });
        button_31.setBounds(800, 411, 50, 40);
        button_31.setIcon(icon);
        frame.getContentPane().add(button_31);
        
        JButton button_32 = new JButton((Icon) null);
        button_32.setBounds(884, 213, 50, 40);
        button_32.setIcon(icon3);
        frame.getContentPane().add(button_32);
        
        JButton button_33 = new JButton((Icon) null);
        button_33.setBounds(884, 285, 50, 40);
        button_33.setIcon(icon3);
        frame.getContentPane().add(button_33);
        
        JButton button_34 = new JButton((Icon) null);
        button_34.setBounds(884, 350, 50, 40);
        button_34.setIcon(icon3);
        frame.getContentPane().add(button_34);
        
        JButton button_35 = new JButton((Icon) null);
        button_35.setBounds(884, 411, 50, 40);
        button_35.setIcon(icon3);
        frame.getContentPane().add(button_35);
        
        JButton button_36 = new JButton((Icon) null);
        button_36.setBounds(967, 213, 50, 40);
        button_36.setIcon(icon3);
        frame.getContentPane().add(button_36);
        
        JButton button_37 = new JButton((Icon) null);
        button_37.setBounds(967, 285, 50, 40);
        button_37.setIcon(icon3);
        frame.getContentPane().add(button_37);
        
        JButton button_38 = new JButton((Icon) null);
        button_38.setBounds(967, 350, 50, 40);
        button_38.setIcon(icon3);
        frame.getContentPane().add(button_38);
        
        JButton button_39 = new JButton((Icon) null);
        button_39.setBounds(967, 411, 50, 40);
        button_39.setIcon(icon3);
        frame.getContentPane().add(button_39);
        
        JLabel label_1 = new JLabel("过");
        label_1.setFont(new Font("仿宋", Font.BOLD, 40));
        label_1.setBounds(558, 219, 50, 80);
        frame.getContentPane().add(label_1);
        
        JLabel label_2 = new JLabel("道");
        label_2.setFont(new Font("仿宋", Font.BOLD, 40));
        label_2.setBounds(558, 332, 50, 80);
        frame.getContentPane().add(label_2);
        
        JButton btnNewButton = new JButton("提交订单");
        btnNewButton.setBackground(new Color(255, 255, 255));
        btnNewButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	}
        });
        btnNewButton.setForeground(new Color(255, 0, 0));
        btnNewButton.setFont(new Font("华文楷体", Font.BOLD, 38));
        btnNewButton.setBounds(846, 565, 203, 65);
        
        frame.getContentPane().add(btnNewButton);
        /*
        JFormattedTextField fr = new JFormattedTextField();
        fr.setFont(new Font("宋体", Font.BOLD, 32));
        fr.setForeground(UIManager.getColor("textHighlight"));
        fr.setEditable(false);
        
        fr.setBounds(213, 564, 425, 66);
        frame.getContentPane().add(fr);   */
        
        JLabel lblNewLabel = new JLabel("您的选座：");
        lblNewLabel.setFont(new Font("宋体", Font.BOLD, 30));
        lblNewLabel.setBounds(47, 577, 192, 44);
        frame.getContentPane().add(lblNewLabel);
        
        JButton button_40 = new JButton("重新选择");
        button_40.setFont(new Font("华文楷体", Font.BOLD, 30));
        button_40.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		
        		frame.dispose();
        		
        		frame.setVisible(true);
        		
        	}
        });
        button_40.setBounds(658, 565, 173, 66);
        frame.getContentPane().add(button_40);
        
        Panel panel = new Panel();
        panel.setBackground(new Color(255, 127, 80));
        panel.setBounds(154, 164, 863, 31);
        frame.getContentPane().add(panel);
        
        JButton button_41 = new JButton((Icon) null);
        button_41.setBounds(213, 496, 50, 40);
        button_41.setIcon(icon3);
        frame.getContentPane().add(button_41);
        
        JLabel label_3 = new JLabel("已售座位");
        label_3.setFont(new Font("宋体", Font.BOLD, 25));
        label_3.setBounds(278, 496, 122, 49);
        frame.getContentPane().add(label_3);
        
        JButton button_42 = new JButton((Icon) null);
        button_42.setBounds(503, 496, 50, 40);
        button_42.setIcon(icon);
        frame.getContentPane().add(button_42);
        
        JLabel label_4 = new JLabel("可选座位");
        label_4.setFont(new Font("宋体", Font.BOLD, 25));
        label_4.setBounds(568, 496, 122, 49);
        frame.getContentPane().add(label_4);
        
        JButton button_43 = new JButton((Icon) null);
        button_43.setBounds(794, 496, 50, 40);
        button_43.setIcon(icon2);
        frame.getContentPane().add(button_43);
        
        JLabel label_5 = new JLabel("已选座位");
        label_5.setFont(new Font("宋体", Font.BOLD, 25));
        label_5.setBounds(859, 496, 122, 49);
        frame.getContentPane().add(label_5);
        
        
        t1 = new JLabel();
        t1.setFont(new Font("宋体", Font.BOLD, 25));
		t2 = new JLabel();
		t2.setFont(new Font("宋体", Font.BOLD, 25));
		t3 = new JLabel();
		t3.setFont(new Font("宋体", Font.BOLD, 25));

		
		JPanel jp = new JPanel();
		jp.setSize(622, 44);
		jp.setLocation(234, 26);
		jp.setOpaque(true);
        jp.setBackground(new Color(255, 245, 238));
//		jp.setBackground(255, 245, 238);
		jp.add(t1);
		jp.add(t2);
		jp.add(t3);

		frame.getContentPane().add(jp);

		frame.setVisible(true);
        
    }
    
    /* 倒计时的主要代码块 */
	private void getTime() {
		long time = 1 * 900; // 自定义倒计时时间
		long hour = 0;
		long minute = 0;
		long seconds = 0;

		while (time >= 0) {
			hour = time / 3600;
			minute = (time - hour * 3600) / 60;
			seconds = time - hour * 3600 - minute * 60;
			//t1.setText(hour + ":");
			t2.setText("请在"+minute + ":");
			t3.setText(seconds + "内完成购票，一经选好座位，一律不退票");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time--;
		}

	}
  
    
    public static void main(String[] args){
    	EventDemo iob = new EventDemo();
        iob.getButtonss();
        iob.getTime();
       
        
    }
}