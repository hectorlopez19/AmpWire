package controller;

import model.Model;
import model.Panelboard;
import model.Project;
import view.NewLoadForm;

public class NewLoadFormController {
    public static NewLoadForm newLoadForm = new NewLoadForm();
    public static Model model;
    public static Project project;
    public static Panelboard panelboard;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start(Project actualproject, Panelboard actualPanelboard) {
        LookAndFeelController.styleToWindow(newLoadForm);
        project = actualproject;
        panelboard = actualPanelboard;
        newLoadForm.setSize(1000, 600);
        newLoadForm.setLocationRelativeTo(null);
        newLoadForm.setVisible(true);
    }

    public static void end() {
        newLoadForm.setVisible(false);
    }

    public static String loadTypeSelected() {
        if(newLoadForm.getReceptacleRadio().isSelected()) {
            return "Receptacle";
        }
        else {
            return "Ilumination";
        }
    }

    public static void createLoad() {
        String name = newLoadForm.getNameTxt().getText();
        String loadType = loadTypeSelected();
        double voltage = Double.parseDouble(newLoadForm.getVoltageTxt().getText());
        double power = Double.parseDouble(newLoadForm.getPowerTxt().getText());
        double demandFactor = Double.parseDouble(newLoadForm.getFdTxt().getText());
        double temperature = Double.parseDouble(newLoadForm.getTempTxt().getText());
        int phaseAmount = Integer.parseInt(newLoadForm.getPhaseTxt().getText());
        int wireAmount = Integer.parseInt(newLoadForm.getWireTxt().getText());
        String material = newLoadForm.getMaterialTxt().getText();
        double operatingHours = Double.parseDouble(newLoadForm.getHrsTxt().getText());
        double length = Double.parseDouble(newLoadForm.getLengthTxt().getText());

        model.calcCircuit(demandFactor, operatingHours, name, loadType, phaseAmount, wireAmount, voltage, power, length, temperature, material);
        end();
        ProjectInfoController.start(project, panelboard.getName());
    }

    public static void saveBtn() {
        createLoad();
        end();
        ProjectInfoController.start(project, panelboard.getName());
    }

    public static void backBtn() {
        end();
        ProjectInfoController.start(project, panelboard.getName());
    }

}
