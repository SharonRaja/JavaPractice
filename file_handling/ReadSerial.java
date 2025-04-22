package file_handling;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ReadSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("carobj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car newobj = (Car)ois.readObject();
        newobj.display();
        ois.close();
        fis.close();
        

    }
}
