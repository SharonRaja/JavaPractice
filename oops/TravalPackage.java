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
        sc.nextLine();
        System.out.print("Enter the price ");
        price = sc.nextDouble();
        sc.nextLine();
    }
    void display(){
        System.out.println(destination + ", " + numberOfDays + " Days, $" + price);
    }
    void updateDestination(){
        System.out.print("Enter the new Destination : ");
        destination = sc.nextLine();
    }
    void updateNumberOfDays(){
        System.out.println("Enter the new number of days : ");
        numberOfDays = sc.nextInt();
        sc.nextLine();
    }
    void updatePrice(){
        System.out.println("Enter the new price : ");
        price = sc.nextDouble();
        sc.nextLine();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TravalPackage tp = new TravalPackage();
        tp.getTravelDetails();
        while (true) {
            System.out.println("Enter the option : \n 1.Display details\n 2.Update Destination\n 3.update No of days\n 4.update price \n 5.exit");
            int i = scan.nextInt();
            scan.nextLine();
            switch (i) {
                case 1:
                    tp.display();
                    break;

                case 2:
                    tp.updateDestination();
                    break;

                case 3 :
                    tp.updateNumberOfDays();
                    break;

                case 4:
                    tp.updatePrice();
                    break;
                case 5:
                    return;
            
                default:
                    break;
            }
            
        }

    }
}
