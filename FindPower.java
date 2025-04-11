import java.util.Scanner;

public class FindPower {
    public static double exponential(double b, double e){
        double expo=1;
        for(int i =0 ;i < e;i++)
            expo *= b;
        return expo;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Base number :");
        double m = sc.nextDouble();
        System.out.print("Enter a Exponent number :");
        double n = sc.nextDouble();

        System.out.println("Result = " + exponential(m, n));
    }
    
}
