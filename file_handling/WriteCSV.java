package file_handling;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class WriteCSV {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(new File("students.csv"));
        pw.println("Id,Name,Age");
        System.out.println("Enter the input Id,Name,Age");
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            if(line.toLowerCase().equals("exit"))
                break;
            pw.println(line);
        }
        pw.close();

        System.out.println("CSV file \"students.csv\" is created.");

    }
}
