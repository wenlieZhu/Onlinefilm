package cn.tiaoshi;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 倒计时
 *
 */
public class Counter {

	private JFrame frame;
	private JLabel t1;
	private JLabel t2;
	private JLabel t3;

	public static void main(String[] args) {

		new Counter().getTime();

	}

	/* 倒计时的主要代码块 */
	private void getTime() {
		long time = 1 * 1800; // 自定义倒计时时间
		long hour = 0;
		long minute = 0;
		long seconds = 0;

		while (time >= 0) {
			hour = time / 3600;
			minute = (time - hour * 3600) / 60;
			seconds = time - hour * 3600 - minute * 60;
			t1.setText(hour + ":");
			t2.setText(minute + ":");
			t3.setText(seconds + ":");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			time--;
		}

	}

	/* 构造 实现界面的开发 GUI */
	public Counter() {
		frame = new JFrame("倒计时");
		t1 = new JLabel();
		t2 = new JLabel();
		t3 = new JLabel();

		
		JPanel jp = new JPanel();
		jp.add(t1);
		jp.add(t2);
		jp.add(t3);

		frame.add(jp);

		frame.setVisible(true);
		frame.setLocation(300, 400);
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	

}
