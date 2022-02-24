package model;

import java.util.ArrayList;
import java.util.List;

public class Contributor {
    private String name;
    private int skillCount;

    private List<Skill> skills;

    public Contributor(){
        skills = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Contributor setName(String name) {
        this.name = name;
        return this;
    }

    public int getSkillCount() {
        return skillCount;
    }

    public Contributor setSkillCount(int skillCount) {
        this.skillCount = skillCount;
        return this;
    }

    public List<Skill> getSkills() {
        return skills;
    }

    public void addSkills(Skill skill){
        skills.add(skill);
    }
}
