package Minilab;

import javax.swing.*;

public class JFrameDemo extends JFrame {

    JFrameDemo(){
        pack();
        setLocation(1000, 2000);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {

        JFrameDemo j = new JFrameDemo();

    }


}
