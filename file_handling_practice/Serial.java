package file_handling_practice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Bus implements Serializable{
    public String busNo, brand;
    public int capacity;
    public Bus(String busNo, String brand, int capacity){
        this.busNo = busNo;
        this.brand = brand;
        this.capacity = capacity;
    }
    public void printBus(){
        System.out.println("Bus number : " + busNo);
        System.out.println("Brand : " + brand);
        System.out.println("Capacity : " + capacity);
    }
}

public class Serial {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Bus bs = new Bus("tn1", "al", 45);
        FileOutputStream fos = new FileOutputStream("obj.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(bs);
        oos.close();
        System.exit(0);
        FileInputStream fis = new FileInputStream("obj.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Bus bus = (Bus)ois.readObject();

        bus.printBus();

        
   }
}
