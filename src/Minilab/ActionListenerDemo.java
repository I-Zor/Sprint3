package Minilab;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionListenerDemo extends JFrame implements ActionListener {

    JButton button1;
    JButton button2;
    JLabel label1;
    JLabel label2;
    JPanel p;

    ActionListenerDemo() {
        button1 = new JButton("Tryck här");
        button2 = new JButton("Sen tryck här");
        label1 = new JLabel("Wow");
        label2 = new JLabel("Yes!");
        p = new JPanel();
        p.setLayout(new GridLayout(2, 2));
        p.add(label1);
        p.add(label2);
        p.add(button1);
        p.add(button2);
        this.add(p);
        button1.addActionListener(this);
        button2.addActionListener(this);
        this.pack();
        this.setLocation(500, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        ActionListenerDemo x = new ActionListenerDemo();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            label1.setText("OK");
        }
        else if (e.getSource() == button2) {
            label2.setText("Bra");
        }
    }
}
