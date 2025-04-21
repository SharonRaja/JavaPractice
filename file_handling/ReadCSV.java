package file_handling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class ReadCSV {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner fsc = new Scanner(new File("data.csv"));
        fsc.nextLine();
        while (fsc.hasNextLine()) {
            String[] line = fsc.nextLine().split(",");
            System.out.println("Id : " + line[0] + ", Name : " + line[1] + ", Age : " + line[2]); 
        }
        fsc.close();
    }
    
}
