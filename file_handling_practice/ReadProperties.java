package file_handling_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        
        FileInputStream fis = new FileInputStream("userPreferences.properties");
        prop.load(fis);
        System.out.println("Preferences loaded successfully.");
            
            // Retrieve preferences
        System.out.println("Theme: " + prop.getProperty("theme"));
        System.out.println("Font Size: " + prop.getProperty("fontSize"));
        System.out.println("Language: " + prop.getProperty("language"));
        
    }
}
