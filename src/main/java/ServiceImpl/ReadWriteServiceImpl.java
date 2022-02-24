package ServiceImpl;

import model.*;
import service.ReadWriteService;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class ReadWriteServiceImpl implements ReadWriteService {
    public Problem read(File file) throws FileNotFoundException {
        Problem problem = new Problem();

        BufferedReader br = new BufferedReader(new FileReader(file));

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            problem.setNoOfContributors(scanner.nextInt());
            problem.setNoOfProjects(scanner.nextInt());

            for(int c=0;c<problem.getNoOfContributors();c++){
                Contributor contributor = new Contributor();

                contributor.setName(scanner.next());
                contributor.setSkillCount(scanner.nextInt());

                for(int sc=0;sc<contributor.getSkillCount();sc++){
                    Skill skill = new Skill();

                    skill.setName(scanner.next());
                    skill.setLevel(scanner.nextInt());

                    contributor.addSkills(skill);
                }
                problem.addContributors(contributor);
            }

            for(int p=0;p<problem.getNoOfContributors();p++){
                Project project = new Project();

                project.setName(scanner.next());
                project.setDuration(scanner.nextInt());
                project.setScore(scanner.nextInt());
                project.setBestBefore(scanner.nextInt());
                project.setNumberOfRoles(scanner.nextInt());

                for(int r=0;r<project.getNumberOfRoles();r++){
                    Role role = new Role();

                    role.setName(scanner.next());
                    role.setMinRequiredSkill(scanner.nextInt());

                    project.addRoles(role);
                }

                problem.addProject(project);
            }
        }

        return problem;
    }

    @Override
    public void write(Solution solution, File outputFile) throws FileNotFoundException {

    }
}
