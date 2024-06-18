package com.example.uniSoftFirstTask;

import javax.swing.*;

public class SimpleSwingTest {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Simple Swing Test");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(300, 200);
            frame.add(new JLabel("Hello, Swing!", SwingConstants.CENTER));
            frame.setVisible(true);
        });
    }
}

