package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class DeleteProperty {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the property key  to delete : ");
        String key = sc.nextLine().toLowerCase();
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        fis.close();
        if(prop.containsKey(key)){
            prop.remove(key);
            FileOutputStream fos = new FileOutputStream("config.properties");
            prop.store(fos," Updated");
            fos.close();
            System.out.println( key + "succesfully deleted");
        }
        else{
            System.out.println(key + " does not exist");
        }
        
    }
    
}
