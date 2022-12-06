package view;

import controller.HomeController;
import controller.Styles;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Home extends JFrame{
    private JPanel bgPanel;
    private JPanel logoPanel;
    private JPanel projectsPanel;
    private JPanel addPanel;


    private JLabel logoLabel;
    private JScrollPane scrollP;


    public Home() {
        setContentPane(bgPanel);
        this.setTitle(null);


        addPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                HomeController.addPanelHover();
            }
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                HomeController.addPanelNotHover();
            }
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                HomeController.addProject();

            }
        });




    }


    public JPanel getBgPanel() {
        return bgPanel;
    }

    public void setBgPanel(JPanel bgPanel) {
        this.bgPanel = bgPanel;
    }

    public JPanel getLogoPanel() {
        return logoPanel;
    }

    public void setLogoPanel(JPanel logoPanel) {
        this.logoPanel = logoPanel;
    }

    public JPanel getProjectsPanel() {
        return projectsPanel;
    }

    public void setProjectsPanel(JPanel projectsPanel) {
        this.projectsPanel = projectsPanel;
    }

    public JPanel getAddPanel() {
        return addPanel;
    }

    public void setAddPanel(JPanel addPanel) {
        this.addPanel = addPanel;
    }

    public JLabel getLogoLabel() {
        return logoLabel;
    }

    public void setLogoLabel(JLabel logoLabel) {
        this.logoLabel = logoLabel;
    }

    public JScrollPane getScrollP() {
        return scrollP;
    }

    public void setScrollP(JScrollPane scrollP) {
        this.scrollP = scrollP;
    }
}
