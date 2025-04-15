package oops;

import java.util.Scanner;

class Student{
    String name;
    char grade;
    int age;
    static Scanner sc = new Scanner(System.in);

    public void getDetails(){
        System.out.println("Enter the student name ");
        name = sc.nextLine();
        System.out.println("Enter the student age ");
        age = sc.nextInt();
        System.out.println("Enter the student grade ");
        sc.nextLine();
        grade = sc.nextLine().charAt(0);

    }

    public void display(){
        System.out.println("Name : " + name  + ", Age : " + age + ", Grade " + grade);
        
    }
}

public class StudentRegister {
    public static void main(String[] args) {
        Student a1 = new Student();
        Student a2 = new Student();
        a1.getDetails();
        a2.getDetails();

        System.out.println(" printing  the student details");

        a1.display();
        a2.display();
    }
    
}
