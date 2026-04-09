package org.example;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class App 
{
    public static void main( String[] args )
    {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                try {
                    UIManager.setLookAndFeel(new FlatLightLaf());
                } catch ( Exception e ) {
                    System.err.println("Error: Laf init");
                }

                JFrame frame = new JFrame();
                frame.setSize(1280, 720);
                frame.setVisible(true);
            }
        };

        EventQueue.invokeLater(runnable);
    }
}
