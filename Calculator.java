import java.util.Scanner;
import java.math.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the input \n 1. Addd\n 2.Sub\n 3.Mult\n 4.Div\n 5.Pow\n 6.Sqrt\n enter you option : ");
        int o = sc.nextInt();
        double a,b;
        switch (o) {
            case 1:
                System.out.print("Enter a value for a: ");
                a = sc.nextDouble();
                System.out.print("Enter a value for b: ");
                b = sc.nextDouble();
                System.out.println(a+b);

                break;
            case 2:
                System.out.print("Enter a value for a: ");
                a = sc.nextDouble();
                System.out.print("Enter a value for b: ");
                b = sc.nextDouble();
                System.out.println(a-b);
                break;

            case 3:
                System.out.print("Enter a value for a: ");
                a = sc.nextDouble();
                System.out.print("Enter a value for b: ");
                b = sc.nextDouble();
                System.out.println(a*b);
                break;

            case 4:
                System.out.print("Enter a value for a: ");
                a = sc.nextDouble();
                System.out.print("Enter a value for b: ");
                b = sc.nextDouble();
                System.out.println(a/b);
                break;
            
            case 5:
                System.out.print("Enter a value for a: ");
                a = sc.nextDouble();
                System.out.print("Enter a value for b: ");
                b = sc.nextDouble();
                System.out.println(Math.pow(a, b));
                break;

            case 6:
                System.out.print("Enter a value : ");
                a = sc.nextDouble();
                System.out.println(Math.sqrt(a));
                break;

            
            default:
                System.out.println("Enter a valid option");
                main(args);
                break;
        }
    }
    
}
