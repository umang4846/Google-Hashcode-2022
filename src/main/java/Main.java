import ServiceImpl.ReadWriteServiceImpl;

import java.io.File;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Hey Pratik :) ");
        ReadWriteServiceImpl readWriteService = new ReadWriteServiceImpl();
        readWriteService.read(new File("C://Users/prati/Downloads/a_an_example.in.txt"));
    }
}
