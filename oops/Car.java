package oops;

import java.util.Scanner;

public class Car {
    static Scanner sc = new Scanner(System.in);
    String make, model;
    int year;

    void getDetails(){
        System.out.print("Enter the brand name : ");
        make = sc.nextLine();
        System.out.print("Enter the model : ");
        model = sc.nextLine();
        System.out.print("Enter the year of manufacture : ");
        year = sc.nextInt();
    }
    void display(){
        System.out.println("Car : " + make + " " + model + " (" + year + ")");
    }


    public static void main(String[] args) {
        Car c = new Car();
        c.getDetails();
        c.display();
    }
    
}
