package main;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Window window = new Window();
                window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                window.setVisible(true);
                window.toFront();
            }
        });
    }
}
class Window extends JFrame {
    public Window() throws HeadlessException {
        setSize(500,500);
        setLocationByPlatform(true);
        setTitle("Game");
        setResizable(false);
        Image img = new ImageIcon("E:\\University\\Semester 2\\Advance Programming\\Projects\\midProject_JavaSwing\\src\\elements\\assets\\logo.jpg").getImage();
        setIconImage(img);
//        setExtendedState(Frame.MAXIMIZED_BOTH);
        Component cmp = new Component();
        add(cmp);
    }
}

class Component extends JComponent{
    @Override
    protected void paintComponent(Graphics g) {
        g.drawString("welcome to the game",150,10);
    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(300,20);
    }
}
