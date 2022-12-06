package controller;

import model.Circuit;
import model.Model;
import model.Panelboard;
import model.Project;
import view.ProjectInfo;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.net.URL;

public class ProjectInfoController {
    public static ProjectInfo projectInfo = new ProjectInfo();
    public static Model model = HomeController.model;
    public static Project project;

    // -------------------------------------------------- Start / End / Reset --------------------------------------------------
    public static void start(Project actualproject, String generalPanelboardName) {
        LookAndFeelController.styleToWindow(projectInfo);
        project = actualproject;
        System.out.println("Prasd: " + project.getName());
        menu();
        showTree(generalPanelboardName);
        showInfo();
        projectInfo.setSize(1000, 600);
        projectInfo.setLocationRelativeTo(null);
        projectInfo.setVisible(true);
        projectInfo.getProjectLabel().setText(project.getName());
    }

    public static void end() {
        projectInfo.setVisible(false);
    }


    // ------------------------------------------------------- Elements --------------------------------------------------------
    public static JPanel createPanelboardPanel(Panelboard panelboard) {
        JPanel loadPanel = new JPanel();
        loadPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        loadPanel.setPreferredSize(new Dimension(180, 30));
        loadPanel.setBackground(Styles.secondaryBgColor);
        loadPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        JLabel minimizeLabel = new JLabel();
        minimizeLabel.setText("-");
        minimizeLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        minimizeLabel.setBackground(Styles.secondaryAccentColor);
        minimizeLabel.setForeground(new Color(255, 255, 255));
        minimizeLabel.setHorizontalAlignment(SwingConstants.LEFT);
        minimizeLabel.setPreferredSize(new Dimension(10, 30));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        loadPanel.add(minimizeLabel, gbc);

        JLabel nameLabel = new JLabel();
        nameLabel.setText(panelboard.getName());
        nameLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        nameLabel.setBackground(Styles.secondaryAccentColor);
        nameLabel.setForeground(new Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        nameLabel.setIcon(new ImageIcon("src/view/img/Panelboard-icon.png"));
        nameLabel.setPreferredSize(new Dimension(130, 30));

        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        loadPanel.add(nameLabel, gbc);

        JLabel addLabel = new JLabel();
        addLabel.setText("+");
        addLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        addLabel.setBackground(Styles.primaryAccentColor);
        addLabel.setForeground(Styles.textColor);
        addLabel.setHorizontalAlignment(SwingConstants.RIGHT);
        addLabel.setPreferredSize(new Dimension(10, 20));
        addLabel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                loadHover(addLabel);
            }

            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                loadNotHover(addLabel);
            }
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                createLoad(panelboard);
            }

        });
        gbc.gridx = 7;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.gridheight = 1;
        loadPanel.add(addLabel);

        return loadPanel;
    }

    public static JPanel createloadPanel(Circuit load) {
        JPanel loadPanel = new JPanel();
        loadPanel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        loadPanel.setPreferredSize(new Dimension(180, 30));
        loadPanel.setBackground(Styles.secondaryBgColor);
        loadPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 10));

        JLabel minimizeLabel = new JLabel();
        minimizeLabel.setText("-");
        minimizeLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 15));
        minimizeLabel.setBackground(Styles.secondaryAccentColor);
        minimizeLabel.setForeground(new Color(255, 255, 255));
        minimizeLabel.setHorizontalAlignment(SwingConstants.LEFT);
        minimizeLabel.setPreferredSize(new Dimension(10, 30));

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        loadPanel.add(minimizeLabel, gbc);

        JLabel nameLabel = new JLabel();
        nameLabel.setText(load.getName());
        nameLabel.setFont(new Font("Helvetica Neue", Font.PLAIN, 13));
        nameLabel.setBackground(Styles.secondaryAccentColor);
        nameLabel.setForeground(new Color(255, 255, 255));
        nameLabel.setHorizontalAlignment(SwingConstants.LEFT);
        if(load.getLoadType().equals("receptacles")) {
            nameLabel.setIcon(new ImageIcon("src/view/img/Receptacle-icon.png"));
        }
        else if(load.getLoadType().equals("ilumination")) {
            nameLabel.setIcon(new ImageIcon("src/view/img/Luminary-icon.png"));
        }
        else if(load.getLoadType().equals(""))

        nameLabel.setPreferredSize(new Dimension(130, 30));

        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.gridheight = 1;
        loadPanel.add(nameLabel, gbc);

        return loadPanel;
    }






    // ------------------------------------------------------- Functions -------------------------------------------------------
    public static void showTree(String generalPanelboardName) {
        projectInfo.getTreePanel().removeAll();
        Panelboard generalPanelboard = new Panelboard(generalPanelboardName);
        JPanel generalPanelboardPanel = createPanelboardPanel(generalPanelboard);
        projectInfo.getTreePanel().add(generalPanelboardPanel);
        int circuitsAmount = generalPanelboard.getBranchCircuits().length();

        JPanel childPanel = new JPanel();
        childPanel.setLayout(new GridLayout(circuitsAmount ,1,0,0));
        childPanel.setPreferredSize(new Dimension(180, (circuitsAmount) * 30));
        childPanel.setBackground(Styles.secondaryBgColor);
        childPanel.setBorder(BorderFactory.createEmptyBorder(0, 10, 0, 0));

        for(int i = 0; i < generalPanelboard.getBranchCircuits().length(); i++) {
            Circuit actualCircuit = generalPanelboard.getBranchCircuits().valueOf(i);
            JPanel newPanel = createloadPanel(actualCircuit);
            newPanel.setPreferredSize(new Dimension(170, 30));
            childPanel.add(newPanel);
        }
    }

    public static void showInfo() {
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.setRowCount(0);
        if(project.getGeneralPanelboard().getBranchCircuits().length() != 0) {


            tableModel.addColumn("Name");
            tableModel.addColumn("Voltage");
            tableModel.addColumn("Power");
            tableModel.addColumn("Current");
            tableModel.addColumn("Material");
            tableModel.addColumn("Gauge");
            tableModel.addColumn("Ampacity");
            tableModel.addColumn("Itm");
            tableModel.addRow(new Object[]{"Nombre","Voltaje (V)", "Potencia (VA)", "Corriente (A)", "Material", "Calibre", "Ampacidad", "ITM"});

            for(int i = 0; i < project.getGeneralPanelboard().getBranchCircuits().length(); i++) {
                Circuit actualCircuit = project.getGeneralPanelboard().getBranchCircuits().valueOf(i);
                String name = actualCircuit.getName();
                String voltage = String.valueOf(actualCircuit.getVoltage());
                String power = String.valueOf(actualCircuit.getAdjustments().getAdjustedPower());
                String current = String.valueOf(actualCircuit.getAdjustments().getAdjustedCurrent());
                String material = actualCircuit.getPhase().getMaterial();
                String gauge = actualCircuit.getPhase().getGauge();
                String ampacity = String.valueOf(actualCircuit.getPhase().getConduitAmpacity());
                String itm = String.valueOf(actualCircuit.getItm());

                tableModel.addRow(new Object[]{name, voltage, power, current, material, gauge, ampacity, itm});
            }


        }
        projectInfo.getBranchesTable().setModel(tableModel);

    }

    public static void menu() {
        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu();
        JMenuItem close = new JMenuItem();

        file.setText("Archivo");
        close.setText("Cerrar");
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                end();
                HomeController.start();

            }
        });
        file.add(close);
        menubar.add(file);

        projectInfo.setJMenuBar(menubar);


    }




    // -------------------------------------------------------- Buttons --------------------------------------------------------
    // -------------------- Hover --------------------
    public static void loadHover(JLabel loadLabel) {
        loadLabel.setForeground(Styles.primaryAccentColor);
    }
    public static void loadNotHover(JLabel loadLabel) {
        if(loadLabel.getForeground() != Styles.secondaryAccentColor) {
            loadLabel.setForeground(Styles.textColor);
        }
    }


    public static void createLoad(Panelboard panelboard) {
        NewLoadFormController.start(project, panelboard);
        end();
    }

    public static void backBtnClicked() {
        end();
        HomeController.start();
    }

}
