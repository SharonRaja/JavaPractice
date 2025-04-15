package oops;

import java.util.Scanner;
class  Employee {
    static Scanner sc = new Scanner(System.in);
    String name, position;
    double salary;
    void add(){
        System.out.print("Enter the the Employee Name : ");
        name = sc.nextLine();
        System.out.print("Enter the Position : ");
        position = sc.nextLine();
        System.out.print("Enter the Salary : ");
        salary = sc.nextDouble();

    }
    public void display() {
        System.out.print("Name : " + name);
        System.out.print(", Position : " + position);
        System.out.print(", Salary : " + salary);
     }
    
}

public class EmployeeManagement {

    public static void main(String[] args) {
        Employee e = new Employee();
        e.add();
        e.display();
    }
    
}
