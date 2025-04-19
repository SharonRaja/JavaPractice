package file_handling_practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FilterWriter;
import java.io.IOException;
import java.util.Scanner;

public class BufferReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name : ");
        String fname = sc.next();
        sc.nextLine();
        File file = new File(fname+".txt");
        FileReader freader = new FileReader(file);
        BufferedReader br = new BufferedReader(freader );
        String line;
        int i = 0;
        System.out.println("Reading file >>>>");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            i++;
        }
        System.out.println(i + " read from the file");

        br.close();
        freader.close();

        FileWriter writer = new FileWriter(file); 
        BufferedWriter bw = new BufferedWriter(writer);
        System.out.println("Enter the text : ");
        while (sc.hasNextLine()) {
            line = sc.nextLine();
            bw.write(line + "\n");
        }
        bw.close();
        writer.close();
        
        System.out.println("Writting the success......");
    }

}
