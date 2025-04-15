package oops;

import java.util.Scanner;

public class StudentMarks {
    Scanner sc = new Scanner(System.in);
    float m, s, e;
    void getmarks(){
        System.out.print("Maths : ");
        m = sc.nextFloat();
        System.out.print("Science ");
        s = sc.nextFloat();
        System.out.print("English ");
        e = sc.nextFloat();
    }
    float calulateAverage(){
        return (m+s+e)/3;
    }

    public static void main(String[] args) {
        StudentMarks sm = new StudentMarks();
        sm.getmarks();
        System.out.println("Average Marks = " + sm.calulateAverage());
    }
    
}
