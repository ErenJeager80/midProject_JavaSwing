package pages;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() throws HeadlessException {
        setSize(500, 500);
        setLocation(500, 150);
        setTitle("Game");
        setResizable(false);
        Image img = new ImageIcon("E:\\University\\Semester 2\\Advance Programming\\Projects\\midProject_JavaSwing\\src\\elements\\assets\\logo.jpg").getImage();
        setIconImage(img);
    }
}
