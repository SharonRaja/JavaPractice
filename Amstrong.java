import java.util.Scanner;
import java.math.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter a number : ");
        // int c = 1,copy,n = sc.nextInt();
        int c = 1,copy, n;
        for(int i =1, count =0 ; count<=100 && i<=100000;i++){
            c=1;
            copy = n = i;

            while (n/10 >=1 ) {
                c++;
                n /= 10;
            }
            int sum = 0;
            n = copy;
            while(n/10 >=1){
                sum += Math.pow(n%10,c);
                n =n/10;
            }
            sum += Math.pow(n%10,c);
            // System.out.println(sum);
            // System.out.println(i);
            if(sum == copy){
                System.out.println( i + " is a amstron number");
                count++;
            }
            // else{
            //     System.out.println(i + " is not a amstrong number");
            // }
        }
    }
}
