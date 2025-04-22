package file_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class PropertyIsExist {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the property key : ");
        String key = sc.nextLine().toLowerCase();
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        fis.close();
        if(prop.containsKey(key)){
            System.out.println(key + " is present");
        }
        else{
            System.out.println(key + " does not exist");
        }
        fis.close();
        
    }
    

}
