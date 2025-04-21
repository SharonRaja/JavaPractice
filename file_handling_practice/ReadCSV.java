package file_handling_practice;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ReadCSV {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner fsc = new Scanner(new File("data.csv"));
        while(fsc.hasNextLine()){
            String line = fsc.nextLine();
            String[] data  = line.split(",");
            for(String i:  data)
                System.out.print(i + " ");
            System.out.println();
        }
        fsc.close();
        
        
    }
}
