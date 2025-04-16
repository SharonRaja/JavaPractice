package oops;

import java.util.Scanner;

//Constructor over loading 

public class Rectangle {
    double length, width;

    public Rectangle(){

    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    double perimeter(){
        return 2*(length+width);
    }
    double area(){
        return length*width;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter the Length :");
        r.length = sc.nextDouble();
        System.out.print("Enter the Width :");
        r.width = sc.nextDouble();
        System.out.println("Area = " + r.area() +  ", Perimeter = " + r.perimeter());
        Rectangle r2 = new Rectangle(5, 2);
        System.out.println("Area = " + r2.area() +  ", Perimeter = " + r2.perimeter());

    }
}
