package model;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    private int noOfContributors;
    private int noOfProjects;

    List<Contributor> contributors;
    List<Project> projects;

    public Problem(){
        contributors = new ArrayList<>();
        projects = new ArrayList<>();
    }

    public int getNoOfContributors() {
        return noOfContributors;
    }

    public Problem setNoOfContributors(int noOfContributors) {
        this.noOfContributors = noOfContributors;
        return this;
    }

    public int getNoOfProjects() {
        return noOfProjects;
    }

    public Problem setNoOfProjects(int noOfProjects) {
        this.noOfProjects = noOfProjects;
        return this;
    }

    public List<Contributor> getContributors() {
        return contributors;
    }

    public void addContributors(Contributor contributor){
        contributors.add(contributor);
    }

    public List<Project> getProjects() {
        return projects;
    }

    public void addProject(Project project){
        projects.add(project);
    }
}
