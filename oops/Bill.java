package oops;

import java.util.Scanner;

public class Bill {
    static Scanner sc = new Scanner(System.in);
    String item_name;
    long quantity;
    double price;

    void getDetails(){
        System.out.print(" Enter the Item name : ");
        item_name = sc.nextLine();
        System.out.print("Enter the quantity : ");
        quantity = sc.nextLong();
        sc.nextLine();
        System.out.print("Enter the price : ");
        price = sc.nextDouble();
        sc.nextLine();

    }

    void totalBill(){
        System.out.print("Total Bill = $" + (quantity * price));
    }

    public static void main(String[] args){
        Bill b = new Bill();
        b.getDetails();
        b.totalBill();;
    }
}
