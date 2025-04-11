package functions;
import java.util.Scanner;

public class DigitSum {
    public static int sumOfDigits(int n){
        int sum = 0;
        while((float)n/10 >= 0.1){
            sum += n%10;
            n /=10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Sum = " + sumOfDigits(n));
    }
}
