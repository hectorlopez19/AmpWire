package controller;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import themes.AmpWireDark;

import javax.swing.*;

public class LookAndFeelController {
    public static void loadLookAndFeel(String theme) {
        System.setProperty( "apple.awt.application.name", "AmpWire" );
        System.setProperty( "apple.awt.application.appearance", "system" );

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
}
