package cn.tiaoshi;

import java.awt.*;
import javax.swing.*;

public class L5_10 extends JFrame
{
    JSplitPane cf;
    JList lb;
    JLabel bq;
    
    private JLabel t1;
	private JLabel t2;
	private JLabel t3;
//	 private JFrame frame = null;
    
    /* 倒计时的主要代码块 */
   	public void getTime() {
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
   			t3.setText(seconds + "内完成购票");
   			try {
   				Thread.sleep(1000);
   			} catch (InterruptedException e) {
   				e.printStackTrace();
   			}
   			time--;
   		}

   	}
	public static void main(String[] args) 
    {
		L5_10 lx=new L5_10();
	}
	
	L5_10()
	{
		String[] jsj={"软件开发","游戏开发","平面设计","动画制作","室内设计"};
		lb=new JList(jsj);
		
		bq=new JLabel(new ImageIcon("image/xuan1.jpg"));
		
		cf=new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lb,bq);
		
		cf.setOneTouchExpandable(true);
		
		getContentPane().add(cf);
		
		this.setTitle("计算机学科分类");
		 this.setSize(640,480);
		 this.setLocation(300,280);
		 this.setResizable(false);
		 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 this.setVisible(true);	
		
		 
		 t1 = new JLabel();
		  t1.setFont(new Font("宋体", Font.BOLD, 25));
		  t2 = new JLabel();
		  t2.setFont(new Font("宋体", Font.BOLD, 25));
		  t3 = new JLabel();
		  t3.setFont(new Font("宋体", Font.BOLD, 25));
		  
		  		
		  		JPanel jp = new JPanel();
		  		jp.setBorder(UIManager.getBorder("ScrollPane.border"));
		  		jp.setSize(622, 44);
		  		jp.setLocation(234, 26);
		  		jp.setBackground(new Color(255, 245, 238));
		  		//		jp.setBackground(255, 245, 238);
		  				jp.add(t1);
		  				jp.add(t2);
		  				jp.add(t3);
		  				
		  						this.getContentPane().add(jp);

		this.setVisible(true);
		 
	}
}
