package oops;

import java.util.Scanner;
// Consturcor over loading
class Books{
    String title, author;
    float price;

    public Books(){

    }

    public Books(String title, String author, float price){
        this.title = title;
        this.author = author;
        this.price = price;
    }
    void display(){
        System.out.print("Title : " + title + ", Author : " + author + ", Price : " + price );
    }

    
}

public class Library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Book title : ");
        String title = sc.nextLine();
        System.out.print("Enter the Author name : ");
        String author = sc.nextLine();
        System.out.print("Enter the price ");
        float price = sc.nextFloat();
        Books b = new Books(title, author, price);
        b.display();
        System.out.println("Default consturctor book");
        Books b2 = new Books();
        b2.display();
        
    }
}
