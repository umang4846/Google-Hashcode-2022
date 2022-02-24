package model;

public class Skill {
    private String name;
    private int level;

    public String getName() {
        return name;
    }

    public Skill setName(String name) {
        this.name = name;
        return this;
    }

    public int getLevel() {
        return level;
    }

    public Skill setLevel(int level) {
        this.level = level;
        return this;
    }
}
