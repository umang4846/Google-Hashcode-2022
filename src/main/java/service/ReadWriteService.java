package service;

import model.Problem;

import java.io.File;
import java.io.FileNotFoundException;

public interface ReadWriteService {
    Problem read(File file) throws FileNotFoundException;
}
