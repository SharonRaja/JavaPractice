package file_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class ReadProperties {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("config.properties");
        Properties prop = new Properties();
        prop.load(fis);
        Set<Object> keys = prop.keySet();


        for (Object key : keys) {
            System.out.print( key + " : " + prop.getProperty((String) key) + ", ");
        }
    }

    
}
