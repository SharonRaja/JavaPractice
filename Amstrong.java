import java.util.Scanner;
import java.math.*;
public class Amstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int c = 1,copy,n = sc.nextInt();
        copy = n;
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
        System.out.println(sum);
        if(sum == copy){
            System.out.println("It is a amstron number");
        }
        else{
            System.out.println("It is not a amstrong number");
        }
    }
}
