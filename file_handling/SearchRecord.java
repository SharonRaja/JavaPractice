package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class SearchRecord {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        Scanner fsc = new Scanner(new File(args[0]));
        fsc.nextLine();
        while (fsc.hasNextLine()) {
            String[] line = fsc.nextLine().split(",");
            if(line[1].toLowerCase().equals(args[1].toLowerCase())) {
                System.out.println("Record found: " + line[1] + ", Age " + line[2]); 
                fsc.close();
                System.exit(0);
            }
        }
        System.out.println("Record not found");
        fsc.close();
    }
}
