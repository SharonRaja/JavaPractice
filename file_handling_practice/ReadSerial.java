package file_handling_practice;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("obj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Bus bus = (Bus)ois.readObject();

        bus.printBus();
    }
    
}
