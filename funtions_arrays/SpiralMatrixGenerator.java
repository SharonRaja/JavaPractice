package funtions_arrays;
import java.util.Scanner;
public class SpiralMatrixGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter value for n : ");
        int n = sc.nextInt();
        int[][] m = new int[n][n];
        int rows = 0, rowe = n-1, cols = 0, cole = n-1, x = 0;
        while (rows < rowe && cols < cole) {
            for(int i = cols;i<=cole;i++){
                x++;
                // System.out.print(x + " ");
                m[rows][i] = x;
            }
            rows++;
            for(int j = rows; j<=rowe; j++){
                x++;
                // System.out.println(x + " ");
                m[j][rowe] = x;
            }
            cole--;
            
            for(int i = cole; i>=cols; i--){
                x++;
                // System.out.println(x + " ");
                m[rowe][i] = x;
            }
            rowe--;
            for(int j = rowe; j>=rows; j--){
                x++;
                // System.out.println(x + " ");
                m[j][cols] = x;
            }
            cols++;
        }
        for(int i[] : m){
            for(int j: i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
