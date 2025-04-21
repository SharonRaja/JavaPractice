package file_handling_practice;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        
        // Add preferences as key-value pairs
        prop.setProperty("theme", "dark");
        prop.setProperty("fontSize", "16");
        prop.setProperty("language", "English");
        
        FileOutputStream fos = new FileOutputStream("userPreferences.properties");
        prop.store(fos, "User Preferences");
        System.out.println("Preferences saved successfully.");
    }
    
}
