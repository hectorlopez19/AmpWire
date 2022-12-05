package controller;



import model.Model;
import view.Home;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        LookAndFeelController.loadLookAndFeel("Dark");
        Model model = new Model();
        HomeController.model = model;
        HomeController.start();


    }
}