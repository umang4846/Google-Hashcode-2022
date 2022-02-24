package model;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private String name;
    private int duration;
    private int score;
    private int bestBefore;
    private int numberOfRoles;

    List<Role> roles;

    public Project(){
        roles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Project setName(String name) {
        this.name = name;
        return this;
    }

    public int getDuration() {
        return duration;
    }

    public Project setDuration(int duration) {
        this.duration = duration;
        return this;
    }

    public int getScore() {
        return score;
    }

    public Project setScore(int score) {
        this.score = score;
        return this;
    }

    public int getBestBefore() {
        return bestBefore;
    }

    public Project setBestBefore(int bestBefore) {
        this.bestBefore = bestBefore;
        return this;
    }

    public int getNumberOfRoles() {
        return numberOfRoles;
    }

    public Project setNumberOfRoles(int numberOfRoles) {
        this.numberOfRoles = numberOfRoles;
        return this;
    }

    public List<Role> getRoles() {
        return roles;
    }

    public void addRoles(Role role){
        roles.add(role);
    }
}
