package model;

public class Project {
    private String name;
    private String loadInstalled;

    public Project(String name, String loadInstalled) {
        this.name = name;
        this.loadInstalled = loadInstalled;
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
}
