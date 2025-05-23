package functions;
import java.util.Scanner;

public class FunPrimeNum {
    public static boolean isPrimeNumber(int n){
        if(n==1 || n == 0)
            return false;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(isPrimeNumber(n))
            System.out.println(n + " is a prime number" );
        else 
            System.out.println(n + " is not a prime number");
    }
    
}
