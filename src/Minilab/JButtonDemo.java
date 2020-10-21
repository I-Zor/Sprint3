package Minilab;

import javax.swing.*;

public class JButtonDemo extends JFrame {

    JButton button = new JButton("Tryck");
    JLabel label = new JLabel(new ImageIcon("src/Bilder/butterfly.jpg"));
    JPanel panel = new JPanel();

    JButtonDemo(){
        add(panel);
        panel.add(button);
        panel.add(label);
        this.add(panel);
        this.pack();
        this.setLocation(500, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        JButtonDemo x = new JButtonDemo();
    }
}
