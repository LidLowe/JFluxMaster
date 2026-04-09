package kz.fluxmaster.j;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;
import java.awt.*;

public class App 
{
    public static void main( String[] args )
    {
        Runnable runnable = new Runnable() {
            public void run()
            {
                try {
                    UIManager.setLookAndFeel("FlatLightLaf");
                } catch (Exception e)
                {
                    System.err.println("Error while setting Laf");
                }
            }


        };

        EventQueue.invokeLater(runnable);
    }
}
