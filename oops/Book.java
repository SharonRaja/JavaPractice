package oops;

import java.util.Scanner;

public class Book{
    static Scanner sc = new Scanner(System.in);
    String title, author;
    boolean isAvailable;
    public Book(){

    }

    void getDetails(){
        System.out.print("Enter the title : ");
        title = sc.nextLine();
        System.out.print("Enter the author : ");
        author = sc.nextLine();
        System.out.println("Is this book available true/false");
        isAvailable = sc.nextBoolean();
        sc.nextLine();
    }
    void display(){
        if(isAvailable)
            System.out.println( title + " by " + author + "(Available)");
        else
            System.out.println( title + " by " + author + "(Not vailable)");
    }
    boolean checkAvailable(){
        return isAvailable;
    }
    void toggleAvailable(){
        isAvailable = !isAvailable;
    }
}