package file_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class CountRowCol {
    public static void main(String[] args) throws IOException, FileNotFoundException{
        int row=0,col=0;
        Scanner fsc = new Scanner(new File("data.csv"));
        col = fsc.nextLine().split(",").length;
        while (fsc.hasNextLine()) {
            fsc.nextLine();
            row++;
        }
        fsc.close();
        System.out.println("Row : " + row + ", Column : " + col);
    }
}
