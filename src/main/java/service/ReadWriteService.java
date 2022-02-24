package service;

import model.Problem;
import model.Solution;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public interface ReadWriteService {
    Problem read(File file) throws FileNotFoundException;
    void write(Solution solution, File fileOutputPath) throws IOException;
}
