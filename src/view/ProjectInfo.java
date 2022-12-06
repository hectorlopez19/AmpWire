package view;

import controller.ProjectInfoController;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProjectInfo extends JFrame{
    private JPanel bgPanel;
    private JPanel sidebarPanel;
    private JLabel nameLabel;
    private JPanel coca;
    private JPanel namePanel;
    private JPanel treePanel;
    private JPanel contentPanel;
    private JTable branchesTable;
    private JLabel branchesLabel;
    private JPanel branchesPanel;
    private JLabel panelboardIconLabel;


    public ProjectInfo() {
        setContentPane(bgPanel);

    }

    public JPanel getBgPanel() {
        return bgPanel;
    }

    public void setBgPanel(JPanel bgPanel) {
        this.bgPanel = bgPanel;
    }

    public JPanel getProjectTreePanel() {
        return sidebarPanel;
    }

    public void setProjectTreePanel(JPanel projectTreePanel) {
        this.sidebarPanel = projectTreePanel;
    }


    public JLabel getProjectLabel() {
        return nameLabel;
    }

    public void setProjectLabel(JLabel projectLabel) {
        this.nameLabel = projectLabel;
    }

    public JPanel getSidebarPanel() {
        return sidebarPanel;
    }

    public void setSidebarPanel(JPanel sidebarPanel) {
        this.sidebarPanel = sidebarPanel;
    }

    public JLabel getNameLabel() {
        return nameLabel;
    }

    public void setNameLabel(JLabel nameLabel) {
        this.nameLabel = nameLabel;
    }



    public JPanel getNamePanel() {
        return namePanel;
    }

    public void setNamePanel(JPanel namePanel) {
        this.namePanel = namePanel;
    }

    public JPanel getTreePanel() {
        return treePanel;
    }

    public void setTreePanel(JPanel treePanel) {
        this.treePanel = treePanel;
    }

    public JLabel getPanelboardIconLabel() {
        return panelboardIconLabel;
    }

    public void setPanelboardIconLabel(JLabel panelboardIconLabel) {
        this.panelboardIconLabel = panelboardIconLabel;
    }

    public JPanel getContentPanel() {
        return contentPanel;
    }

    public void setContentPanel(JPanel contentPanel) {
        this.contentPanel = contentPanel;
    }

    public JTable getBranchesTable() {
        return branchesTable;
    }

    public void setBranchesTable(JTable branchesTable) {
        this.branchesTable = branchesTable;
    }

    public JLabel getBranchesLabel() {
        return branchesLabel;
    }

    public void setBranchesLabel(JLabel branchesLabel) {
        this.branchesLabel = branchesLabel;
    }

    public JPanel getBranchesPanel() {
        return branchesPanel;
    }

    public void setBranchesPanel(JPanel branchesPanel) {
        this.branchesPanel = branchesPanel;
    }
}
