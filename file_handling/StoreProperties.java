package file_handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class StoreProperties {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Properties prop = new Properties();
        System.out.println("Enter the property and value eg Theme=black");
        while (sc.hasNextLine()) {
            String line = sc.nextLine().toLowerCase();
            if(line.equals("exit"))
                break;
            String[] data = line.split("=");
            prop.setProperty(data[0], data[1]);
        }

        FileOutputStream fos = new FileOutputStream("config.properties");
        prop.store(fos,"configuration from the user");
        System.out.println("Configuration saved successfully.");
        fos.close();
        
        
    }
}
