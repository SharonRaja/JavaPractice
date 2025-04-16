package oops;
// Inheritace, Overriding.
import java.util.Scanner;

class  Vehicle {
    static Scanner sc = new Scanner(System.in);
    String make;
    int year;
    void getDetails(){
        System.out.print("Enter the brand name : ");
        make = sc.nextLine();
        System.out.print("Enter the year of manufacture : ");
        year = sc.nextInt();
        sc.nextLine();
    }

    void display(){
        System.out.println("Vehicle : " + make + " (" + year + ")");
    }
        
}

public class Car extends Vehicle{
    
    String make, model;
    int year;

    void getDetails(){
        System.out.print("Enter the brand name : ");
        make = sc.nextLine();
        System.out.print("Enter the model : ");
        model = sc.nextLine();
        System.out.print("Enter the year of manufacture : ");
        year = sc.nextInt();
        sc.nextLine();
    }
    void display(){
        System.out.println("Car : " + make + " " + model + " (" + year + ")");
    }


    public static void main(String[] args) {
        Car c = new Car();
        c.getDetails();
        c.display();
        Vehicle v = new Vehicle();
        v.getDetails();
        v.display();
    }
    
}
