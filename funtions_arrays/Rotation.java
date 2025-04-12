package funtions_arrays;

public class Rotation {

    public static void main(String[] args) {
        int[][] c = {{1,2},{3,4}};
        // Reverse 
        // for(int i = 1; i>=0; i--){
        //     for(int j=1; j>=0; j--){
        //         System.out.print(c[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // Rotate 90
        //  1 2     3 1
        //  3 4     4 2 

        // for(int i = 0; i<2; i++){
        //     for(int j=1; j>=0; j--){
        //         System.out.print(c[j][i] + " ");
        //     }
        //     System.out.println();
        // }
        

        // Diagonal Sum
        // int sum = 0;
        // for(int i = 0; i<2; i++)
        //     sum += c[i][i];

        // System.out.println("Sum of Diagonal " + sum);

        // int[] n = {1,2,3,4,5,6,7};
        // int odd=0, even=0;
        // for(int i : n){
        //     if(i%2 ==0)
        //         even++;
        //     else
        //         odd++;
        // }
        // System.out.println(" Even = " + even + ", Odd = " + odd);


        // sum all the elements in the row
        int[] row_sum = new int[c.length];
        for(int i = 0; i<c.length; i++){
            for(int j=0; j<c[0].length; j++){
                row_sum[i] += c[i][j];
            }
        }

        System.out.print("Row sum [");
        for(int i : row_sum){
            System.out.print(i + ", ");
        }
        System.out.print("]");

    }    
}
