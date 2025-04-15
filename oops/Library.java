package oops;

import java.util.Scanner;

class Book{
    String title, author;
    float price;

    public Book(String title, String author, float price){
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
        Book b = new Book(title, author, price);
        b.display();
        
    }
}
