package cn.tiaoshi;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.Font;
 
/**
 * 倒计时
 */
public class Timedao {
    private JFrame frame;
    private JLabel jl0;
    /* String -> Date */
    private Date String2Date(String dateStr) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            Date date = simpleDateFormat.parse(dateStr);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
 
    /* 倒计时的主要代码块 */
    private void getTime(String dateStr) {
        Date end = String2Date(dateStr);
        long time = (end.getTime() - 1 - new Date().getTime()) / 1000; // 自定义倒计时时间
        long hour = 0;
        long minute = 0;
        long seconds = 0;
        while (time >= 0) {
            hour = time / 3600;
            minute = (time - hour * 3600) / 60;
            seconds = time - hour * 3600 - minute * 60;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("请在").append(minute).append("分").append(seconds).append("秒内完成购票");
            jl0.setText(stringBuilder.toString());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time--;
        }
    }
 
    /* 构造 实现界面的开发 GUI */
    public Timedao() {
        frame = new JFrame("倒计时");
        frame.getContentPane().setFont(new Font("宋体", Font.BOLD, 30));
        jl0 = new JLabel();
        jl0.setFont(new Font("宋体", Font.BOLD, 29));
        jl0.setBounds(29, 115, 620, 217);
        init();
 
    }
 
    /* 组件的装配 */
    private void init() {
        JPanel jp = new JPanel();
        jp.setLayout(null);
        jp.add(jl0);
        frame.getContentPane().add(jp);
        frame.setVisible(true);
        frame.setLocation(300, 400);
        frame.setSize(765, 447);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) throws ParseException {
        new Timedao().getTime("2018-09-20 19:06:00");
    }
 

}
