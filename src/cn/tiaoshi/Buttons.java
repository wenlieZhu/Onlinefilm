package cn.tiaoshi;

import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
public class Buttons extends JFrame {
    public Buttons() {
        setLayout(new GridLayout(3, 3));
        for (int i = 0; i < 9; i++) {
            JButton btn = new JButton((i + 1) + "");
            add(btn);
            if (i == 0) {
                btn.setBackground(Color.RED);
            }
            if (i == 4) {
                btn.setBackground(Color.BLUE);
            }
            if (i == 8) {
                btn.setBackground(Color.BLACK);
            }
        }
        setSize(400, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Buttons();
    }
}
