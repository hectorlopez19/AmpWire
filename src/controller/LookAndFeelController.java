package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.util.SystemInfo;
import themes.AmpWireDark;

import javax.swing.*;

public class LookAndFeelController {
    public static void loadLookAndFeel(String theme) {
        if(System.getProperty("os.name").toLowerCase().equals("mac os x")) {
            System.setProperty( "apple.awt.application.name", "AmpWire" );
            System.setProperty( "apple.laf.useScreenMenuBar", "true" );
        }

        if(theme.equals("Dark")) {
            FlatDarkLaf.registerCustomDefaultsSource("themes");
            AmpWireDark.setup();
            try {
                UIManager.setLookAndFeel(new AmpWireDark());
            } catch (UnsupportedLookAndFeelException e) {
                throw new RuntimeException(e);
            }
        }
        if(theme.equals("Light Theme")) {
            try {
                UIManager.setLookAndFeel(new FlatLightLaf());
            } catch (UnsupportedLookAndFeelException e) {
                throw new RuntimeException(e);
            }
        }
        UIManager.put("TextComponent.arc", 10);
    }

    public static void styleToWindow(JFrame frame) {
        if(System.getProperty("os.name").toLowerCase().equals("mac os x")) {
            if(SystemInfo.isMacFullWindowContentSupported) {
                frame.getRootPane().putClientProperty("apple.awt.fullWindowContent", true);
                frame.getRootPane().putClientProperty("apple.awt.transparentTitleBar", true);
            }
        }

    }
}
