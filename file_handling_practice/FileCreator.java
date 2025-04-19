package file_handling_practice;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class FileCreator {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the file name to create file : ");
        String fname = sc.next();
        File file = new File(fname+".txt");
        if(file.exists()){
            System.out.println("File already exist!!! try new file name");
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNext()) {
                String fileData = fileScanner.nextLine();
                System.out.println(fileData);
                
            }
            fileScanner.close();
        }
        else{
            try{
                file.createNewFile();
                System.out.print("File Created");
            }
            catch(Exception e){
                System.out.println("File creation failed !!! ");
                e.printStackTrace();

            }
        }

    }
}
