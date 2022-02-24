package model;

import java.util.List;

public class Solution {
    List<ProjectCompleted> projects;

    public Solution(List<ProjectCompleted> projects) {
        this.projects = projects;
    }

    public List<ProjectCompleted> getProjects() {
        return projects;
    }

    public void setProjects(List<ProjectCompleted> projects) {
        this.projects = projects;
    }
}
