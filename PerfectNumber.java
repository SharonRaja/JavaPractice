import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int sum = 1,n = sc.nextInt();
        for(int i=2; i<=(n/2);  i++)
            if(n%i == 0){
                sum += i;
            }
        if(sum == n){
            System.out.println("It is a perfect number");
        } 
        else{
            System.out.println("It is not a perfect number");

        } 
    }
}
