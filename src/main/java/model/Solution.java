package model;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    List<ProjectAssigned> projectsAssigned;

    public Solution(List<ProjectAssigned> projects) {
        projectsAssigned = new ArrayList<>();
    }

    public List<ProjectAssigned> getProjects() {
        return projectsAssigned;
    }

    public void addProjects(ProjectAssigned projectCompleted) {
        this.projectsAssigned.add(projectCompleted);
    }
}
