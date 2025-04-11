import java.util.Scanner;

public class FactorCount {
       public static int countFactors(int n){
        if(n ==1 )
            return 1;
        if(n==0)
            return 0/0;
        int factors = 2;
        for(int i = 2; i<=n/2; i++ )
            if(n%i==0)
                factors++;
        return factors;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        System.out.println("Number of factors = " + countFactors(n));
    }
}
