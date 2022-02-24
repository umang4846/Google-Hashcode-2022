package ServiceImpl;

import model.Solution;
import service.GAService;

import java.util.List;

public class GAServiceImpl implements GAService {
    @Override
    public int fitnessCount(Solution solution) {
        return 0;
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
