import java.util.Scanner;
class ForLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    /*
        1) Square hollow pattern
            *  *  *  *  *
            *           *
            *           *
            *           *
            *  *  *  *  *
     */
        // System.out.print("Enter the square side length : ");
        // int a = sc.nextInt();
        // for(int i = 1; i<=a; i++){
        //     for(int j=1; j<=a; j++){
        //         if(i==1 ||  i == a || j == 1 || j == a){
        //             System.out.print("* ");
        //         }
        //         else {
        //             System.out.print("  ");
        //         }

        //     }
        //     System.out.println();
        // }


    /*
    2) Number Triangle
        1
       2 2
      3 3 3
     4 4 4 4
     */

    //     System.out.print("Enter the number of row :");
    //     int n = sc.nextInt();
    //     for(int i = 1; i<=n; i++){
    //         for(int j = 1; j<=n; j++){
    //             if(j <= n-i){
    //                 System.out.print(" ");
    //             }
    //             else{
    //                 System.out.print(" "+i);
    //             }
    //         }
    //         System.out.println();
    //     }


    /*
     3) number increasing pyramid
        1
        1 2
        1 2 3
        1 2 3 4
     */
    // System.out.print("Enter the number of rows : ");
    // int n = sc.nextInt();
    // for(int i=1; i<=n ; i++){
    //     for(int j=1; j<=i; j++){
    //         System.out.print(i+ " ");
    //     }
    //     System.out.println();
    // }

    /*
     4) number increasing pyramid reversed
        1 2 3 4
        1 2 3
        1 2
        1
    */
        // System.out.print("Enter the number of rows : ");
        // int n = sc.nextInt();
        // for(int i = n; i>0; i--){
        //     for(int j = 1; j<=i; j++  ){
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

    /*
     5) number changing pyramid
        1
        2 3
        4 5 6
        7 8 9 10
    */

        // System.out.print("Enter the number of rows : ");
        // int n = sc.nextInt();
        // for(int i = 1, v=1; i<=n; i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print(v++ + " ");
        //     }
        //     System.out.println();
        // }

    /*
     6) Zero-one triangle
        1
        0 1
        1 0 1
        0 1 0 1
    */

        // System.out.print("Enter the number of rows : ");
        // int n = sc.nextInt();
        
        // for(int i = 1; i<=n; i++){
        //     boolean x = (i%2==0)? true: false;
        //     for(int j = 1; j<=i; j++){
        //         if(x=!x)
        //             System.out.print( "1 ");
        //         else
        //             System.out.print("0 "); 
        //     }
        //     System.out.println();
        // }
    
    /*
     7) plindrome triangle
              1
            2 1 2
          3 2 1 2 3
        4 3 2 1 2 3 4
    */

        // System.out.print("Enter the number of rows : ");
        // int n = sc.nextInt();
        
        // for(int i = 1; i<=n; i++){
        //     boolean flag = true;
        //     for(int j = 1, x = i; j<=n*2; j++){
        //         if(j <= (n-i)*2+1){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print(" "+ x);
        //             if(flag){
        //                 x--;
        //                 if(x <= 1)
        //                     flag = false;
        //             }
        //             else 
        //                 x++;
        //         }
        //     }
        //     System.out.println();
        // }
    /*
     8) Rhombus pattern
        * * * *
         * * * *
          * * * *
           * * * * 
    */

        // System.out.print("Enter the number of rows : ");
        // int n = sc.nextInt();

        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=n+i;j++ ){
        //         if(j<i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }
        
    /*
     9) Diamond Pattern
        *
       * *
      * * *
     * * * *
      * * *
       * *
        * 
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     for(int j = 1; j<=n; j++){
        //         if(j <= n-i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print(" *");
        //         }
        //     }
        //     System.out.println();
        // }
        // for(int i = 1; i<n; i++){
        //     for(int j = n-1; j>=0; j--){
        //         if(j >= n-i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print(" *");
        //         }
        //     }
        //     System.out.println();
        // }

    /* 10) butterfly Pattern
    
       *           *
         *       *
       *   *   *   *
         *   *   *
       *   *   *   *
         *       *
       *           *
     
    */

    
    System.out.print("Enter an odd number (for number of rows): ");
    int N = sc.nextInt();
    
    // (Optional) Validate that N is odd; otherwise ask for an odd number.
    if (N % 2 == 0) {
        System.out.println("Please run the program again and enter an odd number.");
        sc.close();
        return;
    }
    
    // The grid width is defined such that the pattern is centered.
    int width = 2 * N - 1;
    
    
    for (int i = 0; i < N; i++) {          // iterate through each row
        for (int j = 0; j < width; j++) {    // iterate through each column in that row
            
            if (i % 2 == 0) { // even-numbered row
                if (i == 0 || i == N - 1) {
                    // For the very first and very last row,
                    // print star only at the extreme columns.
                    if (j == 0 || j == width - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    // For inner even rows, print stars at:
                    // left border, right border, at 2*i and at (width-1 - 2*i)
                    if (j == 0 || j == width - 1 || j == 2 * i || j == (width - 1 - 2 * i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            } else { // odd-numbered row
                // Check if this is the middle row; for some odd N, the middle row index = N/2.
                if (i == N / 2) { 
                    // For our given pattern (for example, N=7 -> row 3),
                    // print stars at columns: 2, center, and (width-1-2)
                    if (j == 2 || j == (width - 1) / 2 || j == (width - 1 - 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    // For all other odd rows, print stars at col 2 and (width-1-2)
                    if (j == 2 || j == (width - 1 - 2)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
        System.out.println();
    }
    



    /* 11) fill square Pattern
        * * * * *
        * * * * *
        * * * * *
        * * * * *
        * * * * *
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i =1; i<=n;i++){
        //     for(int j = 1; j<=n;j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

    /* 12) Right half pyramid
        *
        * *
        * * *
        * * * *
        * * * * *
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i =1; i<=n;i++){
        //     for(int j = 1; j<=i;j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }


    /* 13) Right half pyramid
        * * * * *
        * * * *
        * * *
        * *
        *
    */

    // System.out.print("Enter the number of row :");
    // int n = sc.nextInt();
    // for(int i =n; i>0;i--){
    //     for(int j = i; j>0;j--){
    //         System.out.print(" *");
    //     }
    //     System.out.println();
    // }

    /* 14) left half pyramid
              *
            * *
          * * *
        * * * *
      * * * * *
    */

    // System.out.print("Enter the number of row :");
    // int n = sc.nextInt();
    // for(int i =1; i<=n;i++){
    //     for(int j = n; j>0;j--){
    //         if(j-i>0){
    //             System.out.print("  ");
    //         }
    //         else{
    //             System.out.print(" *");
    //         }
    //     }
    //     System.out.println();
    // }


    /* 15) reverse left half pyramid
        * * * * *
          * * * *
            * * *
              * *
                *
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i =n; i>0;i--){
        //     for(int j = n; j>0; j--){
        //         if(j-i>=1){
        //             System.out.print("  ");
        //         }
        //         else{
        //             System.out.print(" *");
        //         }
        //     }
        //     System.out.println();
        // }


    /* 16) K pattern
        * * * *
        * * *
        * *
        *
        * *
        * * *
        * * * *

    */
        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i =n; i>0;i--){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("* ");
               
        //     }
        //     System.out.println();
        // }
        // for(int i =2; i<=n;i++){
        //     for(int j = 1; j<=i; j++){
        //         System.out.print("* ");
               
        //     }
        //     System.out.println();
        // }

    /* 17) Triangle star pattern
            *
           * *
          * * *
         * * * *
        * * * * *
    */
        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n; i++){
        //     for(int j=1; j<=n;j++){
        //         if(j<=n-i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("* ");
        //         }
        //     }
        //     System.out.println();
        // }

    /* 18) Reverse number triange pattern
        1 2 3 4
         2 3 4
          3 4
           4
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n;i++){
        //     for(int j = 1, x=i;j<=n;j++){
        //         if(j<i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print(x++ + " ");
        //         }
        //     }
        //     System.out.println();
        // }

    /* 19) Mirror Image Triangle pattern
        1 2 3 4
         2 3 4
          3 4
           4
          3 4
         2 3 4
        1 2 3 4
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for(int i = 1; i<=n;i++){
        //     for(int j = 1, x=i;j<=n;j++){
        //          if(j<i){
        //             System.out.print(" ");
        //          }
        //          else{
        //             System.out.print(x++ + " ");
        //          }
        //     }
        //     System.out.println();
        // }
        // for(int i = n-1; i>0;i--){
        //     for(int j = 0, x=i;j<n;j++){
        //         if(i>j+1){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print(x++ + " ");
        //         }
        //     }
        //     System.out.println();
        // }


    /* 20) Hollow Triangle pattern
            *
           * *
          *   *
         *     *
        * * * * *
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <i + 1; j++) {
        //         if (j == 0 || j == i || i == n - 1) {
        //             System.out.print("* "); 
        //         } else {
        //             System.out.print("  "); 
        //         }
        //     }
        //     System.out.println();
        // }

    /* 21) Hollow Triangle pattern
        * * * * *
         *     *
          *   *
           * *
            * 
    */
        // System.out.print("Enter the number of row : ");
        // int n = sc.nextInt();
        // for (int i = n; i > 0; i--) {
        //     for (int j = 0; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i - 1; j++) {

        //         if (j == 0 || j == i - 1 || i == n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

    /* 22) Hollow Triangle pattern
            *
           * *
          *   *
         *     *
        *       *
         *     *
          *   *
           * *
            * 
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i - 1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <i + 1; j++) {
        //         if (j == 0 || j == i ) {
        //             System.out.print("* "); 
        //         } else {
        //             System.out.print("  "); 
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = n-1; i > 0; i--) {
        //     for (int j = 0; j <= n - i-1; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i - 1; j++) {

        //         if (j == 0 || j == i - 1  ) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }

    /* 23) Hollow Triangle pattern
         * * * *
          *   *
           * *
            *
           * *
          *   *
         * * * * 
    */
        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for (int i = n; i > 0; i--) {
        //     for (int j = 0; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <= i - 1; j++) {

        //         if (j == 0 || j == i - 1 || i == n) {
        //             System.out.print("* ");
        //         } else {
        //             System.out.print("  ");
        //         }
        //     }
        //     System.out.println();
        // }
        // for (int i = 1; i < n; i++) {
        //     for (int j = 0; j < n - i ; j++) {
        //         System.out.print(" ");
        //     }
        //     for (int j = 0; j <i + 1; j++) {
        //         if (j == 0 || j == i || i == n - 1) {
        //             System.out.print("* "); 
        //         } else {
        //             System.out.print("  "); 
        //         }
        //     }
        //     System.out.println();
        // }



    /* 23) Pascal Triangle pattern
            1
           1 1
          1 2 1
         1 3 3 1
        1 4 6 4 1 
    */
        
        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for (int row = 1; row <= n; row++) {
        //     for (int j = 0; j <= n - row; j++) {
        //         System.out.print(" ");
        //     }

        //     int C = 1; 
        //     for (int i = 1; i <= row; i++) {
        //         System.out.print(" " +C); 
        //         C = C * (row - i) / i; 
        //     }
        //     System.out.println();
        // }


    /* 23) Hollow Triangle pattern
         *
           *
         *   *
           *   *
         *   *
           *
         *  
    */

        // System.out.print("Enter the number of row :");
        // int n = sc.nextInt();
        // for (int i = 1; i <= n; i++) {

        //     for (int j = 1; j <= (i+1)/2; j++) {
        //         if(i%2==0 ){
        //             System.out.print(" *"); 
        //         }
        //         else if(i%2!=0){
        //             System.out.print("* ");
        //         }
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }


        // for (int i = n-1; i >=0; i--) {

        //     for (int j = 1; j <= (i+1)/2; j++) {
        //         if(i%2==0 ){
        //             System.out.print(" *"); 
        //         }
        //         else if(i%2!=0){
        //             System.out.print("* ");
        //         }
        //         else
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

    }
}