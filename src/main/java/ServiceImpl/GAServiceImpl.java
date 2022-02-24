package ServiceImpl;

import model.Project;
import model.ProjectAssigned;
import model.Solution;
import service.GAService;

import java.util.List;

public class GAServiceImpl implements GAService {
    @Override
    public int fitnessCount(Solution solution) {
        int points = 0;
        List<ProjectAssigned> projects = solution.getProjects();
        for(ProjectAssigned projectAssigned : projects){
            Project project = projectAssigned.getProjectName();
            int startDay = projectAssigned.getStartDay();
            int duration = project.getDuration();
            int completedDay = startDay +duration;
            int bestBefore = completedDay - project.getBestBefore();
            int currentPoint = project.getScore() - bestBefore;
            points += currentPoint;
        }
        return points;
    }

    @Override
    public Solution mutation(Solution solution) {
        return null;
    }

    @Override
    public Solution crossover(Solution solution1, Solution solution2) {
        return null;
    }

    @Override
    public List<Solution> survivors(List<Solution> solutions) {
        return null;
    }

    @Override
    public Solution run(List<Solution> initialSolutions) {
        return null;
    }
}
