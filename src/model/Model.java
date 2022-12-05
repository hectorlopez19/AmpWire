package model;

public class Model {
    private Project[] projects;

    public Model() {
        projects = new Project[2];
        projects[0] = new Project("Cinepolis", "139 MVA");
        projects[1] = new Project("Plaza Patria", "1546 MVA");

    }

    public Project[] getProjects() {
        return projects;
    }

    public void setProjects(Project[] projects) {
        this.projects = projects;
    }
}
