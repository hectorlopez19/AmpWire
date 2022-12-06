package controller;



import model.Model;
import view.Home;
import view.ProjectInfo;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        LookAndFeelController.loadLookAndFeel("Dark");
        Model model = new Model();
        HomeController.model = model;
        NewLoadFormController.model = model;
        ProjectInfoController.model = model;
        HomeController.start();


    }
}