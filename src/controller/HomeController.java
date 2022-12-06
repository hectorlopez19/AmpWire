package controller;

import model.Model;
import model.Project;
import view.Home;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HomeController {
    public static Home home = new Home();
    public static Model model;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start() {
        LookAndFeelController.styleToWindow(home);
        setScrollSettings();
        showProjects();
        home.getAddPanel().setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        home.setSize(1000, 600);
        home.setResizable(false);
        home.setLocationRelativeTo(null);
        home.setVisible(true);
    }

    public static void end() {
        home.setVisible(false);
    }

    // ------------------------------------------------------- Elements --------------------------------------------------------
    public static JPanel newProjectPanel(Project project) {
        JPanel projectPanel = new JPanel();
        projectPanel.setLayout(new GridLayout(2, 1, -1, -1));
        projectPanel.setPreferredSize(new Dimension(510, 80));
        projectPanel.setBackground(new Color(0x1E2A3E));
        projectPanel.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        projectPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        projectPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                projectHover(projectPanel);
            }
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                projectNotHover(projectPanel);
            }
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                openProject(project);
            }
        });

        JLabel nameLabel = new JLabel();
        nameLabel.setText(project.getName());
        nameLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 16));
        nameLabel.setForeground(Styles.textColor);
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        projectPanel.add(nameLabel);

        JLabel loadLabel = new JLabel();
        loadLabel.setText(project.getGeneralPanelboard().getName());
        loadLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        loadLabel.setForeground(Styles.primaryAccentColor);
        loadLabel.setHorizontalAlignment(SwingConstants.LEFT);
        loadLabel.setVerticalAlignment(SwingConstants.TOP);
        projectPanel.add(loadLabel);

        return projectPanel;
    }



    // ------------------------------------------------------- Functions -------------------------------------------------------
    public static void setScrollSettings() {
        home.getScrollP().getVerticalScrollBar().setVisible(false);
        home.getScrollP().setViewportView(home.getProjectsPanel());
        home.getScrollP().setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        home.getScrollP().setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        home.getScrollP().getVerticalScrollBar().setBackground(Styles.primaryBgColor);
    }
    public static void showProjects() {
        Project[] projects = model.getProjects();
        if(projects[0] != null) {
            home.getProjectsPanel().removeAll();
            for(int i = 0; i < model.getProjectsCreated(); i++) {
                Project project = model.getProjects()[i];
                JPanel newProject = newProjectPanel(project);
                home.getProjectsPanel().add(newProject);
                System.out.println("Project: " + project.getName());
            }
            home.getProjectsPanel().add(home.getAddPanel());
            int verticalSize = ((projects.length + 2) * 20) + ((projects.length + 1) * 80);
            home.getProjectsPanel().setPreferredSize(new Dimension(550, verticalSize));
        }

    }

    // -------------------------------------------------------- Buttons --------------------------------------------------------
    public static void openProject(Project project) {
        end();
        ProjectInfoController.start(project, project.getGeneralPanelboard().getName());
    }

    // -------------------- Hover --------------------
    public static void addPanelHover() {
        home.getAddPanel().setBackground(new Color(31,50,71));
    }
    public static void addPanelNotHover() {
        home.getAddPanel().setBackground(new Color(23,33,49));
    }

    public static void projectHover(JPanel actualProject) {
        actualProject.setBackground(new Color(31,50,71));
    }
    public static void projectNotHover(JPanel actualProject) {
        actualProject.setBackground(new Color(30,42,62));
    }

    public static void addProject() {
        String name = JOptionPane.showInputDialog("Nombre:");
        String panelboardName = JOptionPane.showInputDialog("Nombre de tablero: ");
        model.createProject(name, panelboardName);
        ProjectInfoController.start(model.getProjects()[model.getProjectsCreated() - 1], panelboardName);
        end();
    }

}
