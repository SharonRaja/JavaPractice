import java.util.Scanner;
public class FunFactorial {
    public static int factorial(int n){
        int product = 1;
        for(int i = 2; i<=n; i++ )
            product *= i;
        return product;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Factorial = " + factorial(n));
    }
}
