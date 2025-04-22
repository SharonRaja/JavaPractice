package file_handling;

import java.io.Serializable;

public class Car implements Serializable {
    private static final long serialVersionUID = 129348938L;
    String carNumber, brand, model, ownerName;
    int year;
    float price;
    

    public Car(String carNumber, String brand, String model, String ownerName, int year, float price) {
        this.carNumber = carNumber;
        this.brand = brand;
        this.model = model;
        this.ownerName = ownerName;
        this.year = year;
        this.price = price;
    }
    public void display(){
        System.out.println("Car number : " + carNumber);
        System.out.println("Owner : " + ownerName);
        System.out.println("Brand : " + brand);
        System.out.println("Model : " + model);
        System.out.println("Year : " + year);
        System.out.println("Price : " + price);
    }
    
    
}
