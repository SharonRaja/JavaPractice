package file_handling_practice;
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWrite {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name : ");
        String fname = sc.next();
        File file = new File(fname + ".txt");
        if(file.exists()){
            System.out.println("File already existing.");
        }
        else{
            try{
                file.createNewFile();
                System.out.println("File Created");
            }
            catch(Exception e){
                System.out.println("File creation failed !!! ");
                e.printStackTrace();

            }
        }
        FileWriter fw = new FileWriter(fname+".txt");
        
        fw.write("Text by java");

        fw.close();

        if(file.exists()){
            System.out.println("Now Reading >>>");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String fileData = fileScanner.nextLine();
                System.out.println(fileData);
                
            }
            fileScanner.close();
        }

        System.out.println("File writing success");
    }
}
