package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class UpdateCSV {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("person name : ");
        String name = sc.nextLine();
        System.out.print("age : ");
        int age = sc.nextInt();

        File origialFile = new File("data.csv");
        Scanner fsc = new Scanner(origialFile);
        File tempFile = new File("temp.csv");
        PrintWriter pw = new PrintWriter(tempFile);

        String heading = fsc.nextLine();
        pw.println(heading); 
        while (fsc.hasNextLine()) {
            String line = fsc.nextLine();
            if(line.split(",")[1].toLowerCase().equals(name.toLowerCase())) {
                System.out.println("Record found updating...");
                String[] data = line.split(",");
                data[2] = Integer.toString(age); 
                line = data[0] + "," + data[1] + "," + data[2];
                
            }
            pw.println(line);
        }
        fsc.close();
        pw.close();

        origialFile.delete();
        tempFile.renameTo(origialFile);

        
    }
}
