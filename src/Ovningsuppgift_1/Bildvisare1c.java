package Ovningsuppgift_1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Bildvisare1c extends JFrame implements ActionListener {

    JPanel p;
    JButton b;
    JLabel l;
    String folderOfImages = "src/Bilder";
    Path imagePath = Paths.get(folderOfImages);
    int imageIndex = 0;
    int imageCount= 0;
    List<String> imageFileNames = new ArrayList<>(); //Varför säger IntelIJ att initialiseraren är redundant när det blir
                                                    //fel om jag tar bort det??
    protected List <String> loadImageNames(Path imageDir){
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(imageDir)) {
            for (Path file: stream) {
                imageFileNames.add(file.toString());
                System.out.println(file.getFileName().toString());
            }
        } catch (IOException | DirectoryIteratorException x) {
            x.printStackTrace();
        }
        return imageFileNames;
    }

    Bildvisare1c(){
        imageFileNames = loadImageNames(imagePath);
        imageCount = imageFileNames.size();
        p = new JPanel(new FlowLayout());
        b = new JButton("Växla bild");
        l = new JLabel(new ImageIcon(imageFileNames.get(imageIndex)));
        p.add(l);
        p.add(b);
        this.add(p);
        b.addActionListener(this);
        this.pack();
        this.setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Bildvisare1c b = new Bildvisare1c();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        imageIndex = (imageIndex + 1) % imageCount;
        l.setIcon(new ImageIcon( imageFileNames.get(imageIndex)));

    }
}
