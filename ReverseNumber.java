import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int rev_num=0,n = sc.nextInt();
        while ((float)n/10>=0.1) {
            rev_num = rev_num*10 + n%10;
            n /=10;
       }
       System.out.println("Reversed number is " + rev_num);
    }
}
