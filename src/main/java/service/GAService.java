package service;

import model.Solution;

import java.util.List;

public interface GAService {
    public int fitnessCount(Solution solution);
    public Solution mutation(Solution solution);
    public Solution crossover(Solution solution1, Solution solution2);
    public List<Solution> survivors(List<Solution> solutions);
    public Solution run(List<Solution> initialSolutions);
}
