package service;

import model.Problem;
import model.Solution;

import java.io.File;
import java.io.FileNotFoundException;

public interface ReadWriteService {
    Problem read(File file) throws FileNotFoundException;
    void write(Solution solution, File outputFile) throws FileNotFoundException;
}
