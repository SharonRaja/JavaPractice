package oops;

import java.util.Scanner;
import java.math.*;
// Over Loading 
public class Circle {
    double radius;
    double perimeter(){
        return 2*Math.PI*radius;
    }
    double area(){
        return Math.PI * radius * radius;
    }

    double area(double diameter){
        double radius = diameter/2;
        return Math.PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter the radius :");
        c.radius = sc.nextDouble();
        System.out.println("Area = " + c.area() +  ", Perimeter = " + c.perimeter());
        System.out.print("Enter the Diameter :");
        double dia = sc.nextDouble();
        sc.nextLine();
        System.out.println("Area using overloaded method " + c.area(dia));

    }
}
