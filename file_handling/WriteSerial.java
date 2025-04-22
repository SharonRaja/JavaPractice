package file_handling;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import file_handling.Car;

public class WriteSerial {
    public static void main(String[] args) throws IOException {
        Car car = new Car("TN73-000", "Toyota", "Innova", "Politician", 2025, 45000);
        FileOutputStream fos = new FileOutputStream("carobj.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        car.display();
        oos.writeObject(car);
        oos.close();
        fos.close();
        System.out.println("Car object is serialized");
        
    }
}
