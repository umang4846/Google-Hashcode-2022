package model;

import java.util.ArrayList;
import java.util.List;

public class ProjectAssigned {
    private String projectName;
    private List<Contributor> contributors;

    public ProjectAssigned() {
        contributors = new ArrayList<>();
    }

    public String getProjectName() {
        return projectName;
    }

    public ProjectAssigned setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void addContributors(Contributor contributor) {
        this.contributors.add(contributor);
    }
}
