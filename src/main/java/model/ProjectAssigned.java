package model;

import java.util.ArrayList;
import java.util.List;

public class ProjectAssigned {
    private Integer startDay;
    private Project project;
    private List<Contributor> contributors;

    public ProjectAssigned() {
        contributors = new ArrayList<>();
    }

    public Project getProjectName() {
        return project;
    }

    public ProjectAssigned setProjectName(Project project) {
        this.project = project;
        return this;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void addContributors(Contributor contributor) {
        this.contributors.add(contributor);
    }

    public Integer getStartDay() {
        return startDay;
    }

    public void setStartDay(Integer startDay) {
        this.startDay = startDay;
    }

    public void setContributors(List<Contributor> contributors) {
        this.contributors = contributors;
    }
}
