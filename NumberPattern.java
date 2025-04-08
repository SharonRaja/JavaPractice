import java.util.Scanner;

public class NumberPattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        /*
         * 1
         * 2 6
         * 3 7 10
         * 4 8 11 13
         * 5 9 12 14 15
         * Implemnnt using both for-loop and while-loop
         */

        // FOR-LOOP
        // for(int i = 1; i<=n; i++){
        //     for(int j = 0, x=i; j<i; j++,x += n - j){  
        //         System.out.print(x+" ");
        //     }
        //     System.out.println();
        // }

        // WHILE LOOP
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


        /*
         * 
         * 1 2 3 4 5
         * 2 3 4 5 1
         * 3 4 5 1 2
         * 4 5 1 2 3
         * 5 1 2 3 4
         */
        for(int i=1; i<=n; i++){
            for(int j=1,c = i; j<=n; j++){
                System.out.print(c++ + " ");
                if(c>n)
                    c=1;
            }
            System.out.println();
        }

    }
}