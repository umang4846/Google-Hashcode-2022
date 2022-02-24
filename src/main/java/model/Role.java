package model;

public class Role {
    private String name;
    private int minRequiredSkill;

    public String getName() {
        return name;
    }

    public Role setName(String name) {
        this.name = name;
        return this;
    }

    public int getMinRequiredSkill() {
        return minRequiredSkill;
    }

    public Role setMinRequiredSkill(int minRequiredSkill) {
        this.minRequiredSkill = minRequiredSkill;
        return this;
    }
}
