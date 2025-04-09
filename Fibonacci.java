import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i = -1, j = 1,c=0, n = sc.nextInt();
        do{
            c = i+j;
            System.out.print(c + " ");
            i = j;
            j = c;
        }while(j+j<=n);
    }
}
