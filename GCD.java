import java.util.Scanner;

public class GCD {
    public static int gcd(int m, int n){
        int gcd = 1;
        if(m == 0 && n ==0)
            return 0/0;
        else if(m==0)
            return n;
        else if(n ==0)
            return m;
        else if(m>n){
            m = m ^ n;
            n = m ^ n;
            m = m ^ n;
        }

        for(int i =2 ;i<=m;){
            if(m % i ==0 && n%i ==0){
                gcd *= i;
                m /=i;
                n /=i;
            }
            else
                i++;
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for a :");
        int m = sc.nextInt();
        System.out.print("Enter a number for b :");
        int n = sc.nextInt();
        System.out.println("GCD = " + gcd(m,n));
    }
}
