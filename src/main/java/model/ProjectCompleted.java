package model;

import java.util.List;

public class ProjectCompleted {
    private String projectName;
    private List<String> contributors;

    public ProjectCompleted(String name, List<String> contributors) {
        this.projectName = name;
        this.contributors = contributors;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public List<String> getContributors() {
        return contributors;
    }

    public void setContributors(List<String> contributors) {
        this.contributors = contributors;
    }
}
