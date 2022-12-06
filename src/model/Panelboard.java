package model;

public class Panelboard {
    private String name;

    private List<Circuit> branchCircuits;

    public Panelboard(String name) {
        this.name = name;
        this.branchCircuits = new List<Circuit>();

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public List<Circuit> getBranchCircuits() {
        return branchCircuits;
    }

    public void setBranchCircuits(List<Circuit> branchCircuits) {
        this.branchCircuits = branchCircuits;
    }

}
