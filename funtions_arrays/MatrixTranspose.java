package funtions_arrays;

public class MatrixTranspose {

    private static int[][] transpose(int[][] m){
        int[][] t = new int[m[0].length][m.length];
        for(int i = 0; i<m.length; i++ ){
            for(int j = 0; j<m[0].length; j++){
                t[j][i] = m[i][j];
            }
        }
        return t;
    }

    public static void main(String[] args) {
        int[][] m = {{1,3,4},{5,6,7}}, c;
        c = transpose(m);
        for(int[] n: c){
            for(int x : n){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
    
}
