import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        for(int i = 1; i<=n; i++){
            for(int j = 0, x=i; j<i; j++,x += n - j){  
                System.out.print(x+" ");
            }
            System.out.println();
        }

        // int i = 1;
        // while (i<=n) {
        //     int j = 1, x = i;
        //     while (j<=i) {
        //         System.out.print(x+ " ");
        //         x += n-j;
        //         j++;
        //     }
        //     i++;
        //     System.out.println();
        // }
    }
}
