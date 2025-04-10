import java.util.Scanner;
public class LCM {
    public static int lcm(int m, int n){
        int lcm = 1;
        if(m == 0 && n ==0)
            return 0/0;
        else if(m==0 || n ==0)
            return 0;
        else if(m>n){
            m = m ^ n;
            n = m ^ n;
            m = m ^ n;
        }

        for(int i =2 ;i<=n;){
            if(m % i ==0 && n%i ==0){
                lcm *= i;
                m /=i;
                n /=i;
            }
            else if (m % i ==0){
                lcm *= i;
                m /=i;
            }
            else if (n%i ==0){
                lcm *= i;
                n /=i;
            }
            else
                i++;
        }
        return lcm;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number for a :");
        int m = sc.nextInt();
        System.out.print("Enter a number for b :");
        int n = sc.nextInt();
        System.out.println("LCM = " + lcm(m,n));  
    }
}
