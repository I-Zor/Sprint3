package Ovningsuppgift_1;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Ivona Zoricic
 * Date: 2020-10-19
 * Time: 12:23
 * Project: Sprint3
 * Copywrite: MIT
 */
public class Bildvisare1a extends JFrame {

    JPanel p;
    JButton b;
    JLabel l;
    String getPath = "src/Ovningsuppgift_1/Bilder/flower.jpg";

    Bildvisare1a(){
        p = new JPanel(new GridLayout(2,1));
        b = new JButton("Växla bild");
        l = new JLabel(new ImageIcon(getPath));
        p.add(b);
        p.add(l);
        this.add(p);
        this.pack();
        this.setLocation(500, 500);
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Bildvisare1a b = new Bildvisare1a();
    }
}
