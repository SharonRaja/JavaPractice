package oops;

import java.util.Scanner;



public class LibraryManagement {

    public static void borrow(Book[] bks, String title){
        for(Book b : bks){
            if(b.title.equals(title) && b.isAvailable){
                b.display();
                b.toggleAvailable();
                
            }
        }
    }

    public static void returnBook(Book[] bks, String title){
        for(Book b : bks){
            if(b.title.equals(title)){
                b.toggleAvailable();
                System.out.println("Book returned");
                
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        Book[] books = new Book[5];
        System.out.println("Enter book details :");
        for(int i = 0; i <5 ; i++){
            books[i] = new Book();
            books[i].getDetails();
        }
        String title = "";
        while (true) {

            System.out.println("Enter the option \n1.Borrow\n2.Return the book\n3.Exit");
            int x = sc.nextInt();
            sc.nextLine();
            
            switch (x) {
                case 1:
                    System.out.println("Enter the book title");
                    title = sc.nextLine();
                    borrow(books, title);
                    break;

                case 2:
                    System.out.println("Enter the book title");
                    title = sc.nextLine();
                    returnBook(books, title);
                    break;
                    
                case 3:
                    return;
            
                default:
                    break;
            }
   
        }
    }

}
