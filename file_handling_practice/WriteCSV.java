package file_handling_practice;

import java.io.PrintWriter;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WriteCSV {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("data.csv"));
        String[] data = {"Alice,25,Female", "Bob,30,Male", "Eve,22,Female"};
        for(String d : data){
            pw.println(d);
        }
        pw.close();

    }
}
