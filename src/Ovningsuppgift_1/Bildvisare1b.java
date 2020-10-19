package Ovningsuppgift_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bildvisare1b extends JFrame implements ActionListener {

    JPanel p;
    JButton b;
    JLabel l;
    String getBild1 = "src/Bilder/flower.jpg";
    String getBild2 = "src/Bilder/butterfly.jpg";
    int change = 0;

    Bildvisare1b(){
        p = new JPanel(new FlowLayout());
        b = new JButton("Växla bild");
        l = new JLabel(new ImageIcon(getBild1));
        p.add(l);
        p.add(b);
        this.add(p);
        b.addActionListener(this);
        this.pack();
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {  //varför måste jag klicka två gånger för att få bilden växla??
        Bildvisare1b b = new Bildvisare1b();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (change == 0){
            l.setIcon(new ImageIcon(getBild1));
            change = 1;
        }
        else if (change == 1){
            l.setIcon(new ImageIcon(getBild2));
            change = 0;
        }
    }
}
