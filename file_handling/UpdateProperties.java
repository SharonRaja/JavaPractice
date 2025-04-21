package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class UpdateProperties {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        System.out.print("Enter the property name : ");
        String key = sc.nextLine().toLowerCase();
        System.out.print("Enter the new Value : ");
        String value = sc.nextLine().toLowerCase();
        prop.setProperty(key, value);
        fis.close();
        FileOutputStream fos = new FileOutputStream("config.properties");
        prop.store(fos, value);
        System.out.println("Updated succesfully");
        fos.close();

    }
}
