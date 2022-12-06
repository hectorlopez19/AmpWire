package view;

import controller.NewLoadFormController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewLoadForm extends JFrame{
    private JPanel bgPanel;
    private JPanel loadPanel;
    private JPanel inputsPanel;
    private JPanel headerPanel;
    private JRadioButton receptacleRadio;
    private JRadioButton iluminationRadio;
    private JTextField tempTxt;
    private JTextField nameTxt;
    private JTextField voltageTxt;
    private JTextField powerTxt;
    private JTextField fdTxt;
    private JTextField phaseTxt;
    private JTextField wireTxt;
    private JTextField materialTxt;
    private JTextField hrsTxt;
    private JButton saveButton;
    private JButton backButton;
    private JTextField lengthTxt;
    private ButtonGroup loadTypeRadios;

    public NewLoadForm() {
        setContentPane(bgPanel);

        loadTypeRadios = new ButtonGroup();

        loadTypeRadios.add(receptacleRadio);
        loadTypeRadios.add(iluminationRadio);
        backButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewLoadFormController.backBtn();

            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                NewLoadFormController.saveBtn();
            }
        });
    }

    public JPanel getBgPanel() {
        return bgPanel;
    }

    public void setBgPanel(JPanel bgPanel) {
        this.bgPanel = bgPanel;
    }

    public JPanel getLoadPanel() {
        return loadPanel;
    }

    public void setLoadPanel(JPanel loadPanel) {
        this.loadPanel = loadPanel;
    }

    public JPanel getInputsPanel() {
        return inputsPanel;
    }

    public void setInputsPanel(JPanel inputsPanel) {
        this.inputsPanel = inputsPanel;
    }

    public JPanel getHeaderPanel() {
        return headerPanel;
    }

    public void setHeaderPanel(JPanel headerPanel) {
        this.headerPanel = headerPanel;
    }

    public JRadioButton getReceptacleRadio() {
        return receptacleRadio;
    }

    public void setReceptacleRadio(JRadioButton receptacleRadio) {
        this.receptacleRadio = receptacleRadio;
    }

    public JRadioButton getIluminationRadio() {
        return iluminationRadio;
    }

    public void setIluminationRadio(JRadioButton iluminationRadio) {
        this.iluminationRadio = iluminationRadio;
    }

    public JTextField getTempTxt() {
        return tempTxt;
    }

    public void setTempTxt(JTextField tempTxt) {
        this.tempTxt = tempTxt;
    }

    public JTextField getNameTxt() {
        return nameTxt;
    }

    public void setNameTxt(JTextField nameTxt) {
        this.nameTxt = nameTxt;
    }

    public JTextField getVoltageTxt() {
        return voltageTxt;
    }

    public void setVoltageTxt(JTextField voltageTxt) {
        this.voltageTxt = voltageTxt;
    }

    public JTextField getPowerTxt() {
        return powerTxt;
    }

    public void setPowerTxt(JTextField powerTxt) {
        this.powerTxt = powerTxt;
    }

    public JTextField getFdTxt() {
        return fdTxt;
    }

    public void setFdTxt(JTextField fdTxt) {
        this.fdTxt = fdTxt;
    }

    public JTextField getPhaseTxt() {
        return phaseTxt;
    }

    public void setPhaseTxt(JTextField phaseTxt) {
        this.phaseTxt = phaseTxt;
    }

    public JTextField getWireTxt() {
        return wireTxt;
    }

    public void setWireTxt(JTextField wireTxt) {
        this.wireTxt = wireTxt;
    }

    public JTextField getMaterialTxt() {
        return materialTxt;
    }

    public void setMaterialTxt(JTextField materialTxt) {
        this.materialTxt = materialTxt;
    }

    public JTextField getHrsTxt() {
        return hrsTxt;
    }

    public void setHrsTxt(JTextField hrsTxt) {
        this.hrsTxt = hrsTxt;
    }

    public JButton getSaveButton() {
        return saveButton;
    }

    public void setSaveButton(JButton saveButton) {
        this.saveButton = saveButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }

    public ButtonGroup getLoadTypeRadios() {
        return loadTypeRadios;
    }

    public void setLoadTypeRadios(ButtonGroup loadTypeRadios) {
        this.loadTypeRadios = loadTypeRadios;
    }

    public JTextField getLengthTxt() {
        return lengthTxt;
    }

    public void setLengthTxt(JTextField lengthTxt) {
        this.lengthTxt = lengthTxt;
    }
}
