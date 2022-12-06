package model;

public class Project {
    private String name;
    private String loadInstalled;
    private Panelboard generalPanelboard;

    public Project(String name, String panelboardName) {
        this.name = name;
        this.loadInstalled = loadInstalled;
        this.generalPanelboard = new Panelboard(panelboardName);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoadInstalled() {
        return loadInstalled;
    }

    public void setLoadInstalled(String loadInstalled) {
        this.loadInstalled = loadInstalled;
    }

    public Panelboard getGeneralPanelboard() {
        return generalPanelboard;
    }

    public void setGeneralPanelboard(Panelboard generalPanelboard) {
        this.generalPanelboard = generalPanelboard;
    }
}
