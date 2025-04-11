package functions;
import java.util.Scanner;
public class FunFib {

    public static void printFib(int n){
        int a = -1, b = 1, tmp;
        for(int i = 0; i<n; i++){
            tmp = a+b;
            a = b;
            b = tmp;
            System.out.print(tmp + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        printFib(n);
    }
}
