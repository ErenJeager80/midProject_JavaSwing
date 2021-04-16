package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

import pages.ConfigWindow;
import pages.Board;

public class Main {
    public static void main(String[] args) {

        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Board window = new Board();
//                ConfigWindow cWindow = new ConfigWindow();
                window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                window.setVisible(true);
//                cWindow.setVisible(true);
//                cWindow.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
                window.toFront();
            }
        });
        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
    }
}
