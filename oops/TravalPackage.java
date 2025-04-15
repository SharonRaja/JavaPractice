package oops;

import java.util.Scanner;

public class TravalPackage {
    Scanner sc = new Scanner(System.in);
    String destination;
    double price;
    int numberOfDays;
    void getTravelDetails(){
        System.out.print("Enter the destination : ");
        destination = sc.nextLine();
        System.out.print("Enter the number of days ");
        numberOfDays = sc.nextInt();
        System.out.println("Enter the price ");
        price = sc.nextDouble();
    }
    void display(){
        System.out.println(destination + ", " + numberOfDays + " Days, $" + price);
    }
    void updateDestination(){
        System.out.print("Enter the new Destination : ")
        destination = sc.nextLine();
    }
    void updateNumberOfDays(){
        System.out.println("Enter the new number of days : ");
        numberOfDays = sc.nextInt();
    }
    void updatePrice(){
        System.out.println("Enter the new price : ");
        price = sc.nextDouble();
    }

    public static void main(String[] args) {
        TravalPackage tp = new TravalPackage();
        tp.getTravelDetails();
        while (true) {
            System.out.println("Enter the option : 1.Display details\n2.Update Destination\n 3. update No of days\n 4. update price \n 5.exit");
            int i = sc.nextInt();
            switch (i) {
                case 1:
                    tp.display();
                    break;

                case 
            
                default:
                    break;
            }
            
        }

    }
}
