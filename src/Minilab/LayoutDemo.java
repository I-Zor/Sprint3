package Minilab;

import javax.swing.*;
import java.awt.*;

public class LayoutDemo extends JFrame {

    JButton button1 = new JButton("Tryck här");
    JButton button2 = new JButton("Sen tryck här");
    JLabel label1 = new JLabel("Wow");
    JLabel label2 = new JLabel("Yes!");

    LayoutDemo(){
        JPanel p = new JPanel();
        this.add(p);
        p.add(button1);
        p.add(button2);
        p.setLayout(new GridLayout(2, 2));
        p.add(label1);
        p.add(label2);
        this.pack();
        this.setLocation(500, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        LayoutDemo x = new LayoutDemo();
    }
}
