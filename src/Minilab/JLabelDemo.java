package Minilab;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ivona Zoricic
 * Date: 2020-10-19
 * Time: 08:52
 * Project: Sprint3
 * Copywrite: MIT
 */
public class JLabelDemo extends JFrame {

    JPanel panel = new JPanel();
    JLabel label = new JLabel("Hej!");

    JLabelDemo(){
        setLayout(new FlowLayout());
        add(panel);
        panel.add(label);
        pack();
    //    setLocation(1000,1000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JLabelDemo x = new JLabelDemo();
    }

}
