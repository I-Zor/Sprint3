package Ovningsuppgift_1;

import javax.swing.*;
import java.awt.*;

public class Bildvisare1a extends JFrame {

    JPanel p;
    JButton b;
    JLabel l;
    String getPath = "src/Bilder/flower.jpg";

    Bildvisare1a(){
        p = new JPanel(new FlowLayout());
        b = new JButton("Växla bild");
        l = new JLabel(new ImageIcon(getPath));
        p.add(l);
        p.add(b);
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
