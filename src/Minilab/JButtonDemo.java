package Minilab;

import javax.swing.*;

/**
 * Created by Ivona Zoricic
 * Date: 2020-10-19
 * Time: 09:05
 * Project: Sprint3
 * Copywrite: MIT
 */
public class JButtonDemo extends JFrame {

    ImageIcon bild = new ImageIcon("butterfly");

    JButton button = new JButton("Tryck");
    JLabel label = new JLabel("Butterfly");

    JButtonDemo(){
        JPanel panel = new JPanel();
        this.add(panel);
        panel.add(button);
        panel.add(label);
        this.pack();
        this.setLocation(500, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JButtonDemo x = new JButtonDemo();
    }
}
