package oops;

import java.util.Scanner;

public class InventoryManagement {
    static Scanner sc = new Scanner(System.in);
    String name;
    int quantity;
    double price;

    void add(){
        System.out.print("Enter the product name : ");
        name = sc.nextLine();
        System.out.print("Enter the quantity : ");
        quantity = sc.nextInt();
        System.out.print("Enter the price : ");
        price = sc.nextDouble();
    }
    
    void display(){
        System.out.print("Product : " + name);
        System.out.print(", Quantity : " + quantity);
        System.out.print(", Price : $" + price);
    }

    public static void main(String[] args) {
        InventoryManagement p = new InventoryManagement();
        p.add();
        p.display();
    }
}
