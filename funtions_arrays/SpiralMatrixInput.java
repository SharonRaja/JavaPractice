package funtions_arrays;
import java.util.Scanner;
public class SpiralMatrixInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= 4;
        int[][] m = new int[n][n];
        int rows = 0, rowe = n-1, cols = 0, cole = n-1;
        System.out.println("Enter the matrix ");
        for(int i = 0; i<n; i++){
            for(int j =0; j<n; j++){
                m[i][j] = sc.nextInt();    
            }
            sc.nextLine();
        }

        System.out.println("The sequence");
        while (rows<rowe && cols < cole) {
            for(int i = cols; i<=cole; i++){
                System.out.print(m[rows][i] + " ");
            }
            rows++;
            for(int j = rows; j<= rowe; j++ ){
                System.out.print(m[j][cole] + " ");
            }
            cole--;
            for(int i = cole; i>=cols; i--){
                System.out.print(m[rowe][i] + " ");
            }
            rowe--;
            for(int j = rowe; j>=rows; j--){
                System.out.print(m[j][cols] + " ");
            }
            cols++;
        }
    }
    
}
