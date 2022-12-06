package model;

public class Model {
    private Project[] projects;
    private int projectsCreated;

    public Model() {
        projectsCreated = 0;
        projects = new Project[3];

    }

    public void calcCircuit(double demandFactor, double operatingHours, String name, String loadType, int phaseAmount, int wireAmount, double voltage, double power, double length, double temperature, String material){
        Info actualInfo = new Info();
        Circuit newCircuit = new Circuit(name, loadType, phaseAmount, wireAmount, voltage, power, length, temperature, demandFactor, operatingHours);

        if(material.equals("Al")){
            for(Conductor newConductor : actualInfo.getAlConductors()){
                if(newConductor.getConduitAmpacity() >= newCircuit.getAmpacityMinimum()){
                    newCircuit.setPhase(newConductor);
                    newCircuit.setGround(newConductor);
                    break;
                }
            }
        }else {
            for (Conductor newConductor : actualInfo.getCuConductors()) {
                if (newConductor.getConduitAmpacity() >= newCircuit.getAmpacityMinimum()) {
                    newCircuit.setPhase(newConductor);
                    newCircuit.setGround(newConductor);
                    break;
                }
            }
        }
        projects[0].getGeneralPanelboard().getBranchCircuits().push(newCircuit);
    }

    public void createProject(String name, String panelboardName) {
        projects[projectsCreated] = new Project(name, panelboardName);
        projectsCreated++;
    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }

    public int getProjectsCreated() {
        return projectsCreated;
    }

    public void setProjectsCreated(int projectsCreated) {
        this.projectsCreated = projectsCreated;
    }
}
