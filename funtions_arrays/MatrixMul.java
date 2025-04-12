package funtions_arrays;

public class MatrixMul {
    private static int[][] mul(int[][] m, int[][] n){
        if(m[0].length != n.length){
            System.out.println("given shape is not suitalbe to multiply");
            return  new int[][] {{0}};
        }
        int[][] x = new int[m.length][n[0].length];
        for(int i =0; i< m.length; i++){
            for(int j = 0; j<n[0].length; j++){
                for(int k =0 ; k<m[0].length; k++){
                    x[i][j] += m[i][k] * n[k][j];
                }
            }
        } 
        return x;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2},{3,2}}, b = {{5,3},{2, 3}}, c;
        c = mul(a, b);
        for(int[] n: c){
            for(int x : n){
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
