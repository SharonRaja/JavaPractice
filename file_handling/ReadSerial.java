package file_handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;

public class ReadSerial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("carobj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car newobj = (Car)ois.readObject();
        newobj.display();
        ois.close();
        fis.close();
        PrintWriter pw = new PrintWriter(new File("Content.txt"));
        pw.println("Car number : " + newobj.carNumber);
        pw.println("Owner : " + newobj.ownerName);
        pw.println("Brand : " + newobj.brand);
        pw.println("Model : " + newobj.model);
        pw.println("Year : " + newobj.year);
        pw.println("Price : " + newobj.price);
        pw.close();
        System.out.println("Text file is created!!!");
        

    }
}
