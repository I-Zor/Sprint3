package Minilab;

import javax.swing.*;

/**
 * Created by Ivona Zoricic
 * Date: 2020-10-19
 * Time: 08:30
 * Project: Sprint3
 * Copywrite: MIT
 */
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
