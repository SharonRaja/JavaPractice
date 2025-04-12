package funtions_arrays;

public class MatrixAdd {

    private static int[][] add(int[][] m, int[][] n){
        if(m.length != n.length || m[0].length != n[0].length){
            System.out.println("Error matrix shape does not match. it cannot be added");
            return new int[][] {{0}};
        }
        for(int i = 0; i<m.length;i++){
            for(int j = 0; j<m[0].length; j++){
                m[i][j] += n[i][j];
            }
        }
        return m;
        
    }


    public static void main(String[] args) {
        int[][] a = {{1,3},{3,5}}, b = {{8,2},{9, 9}}, c;
        c = add(a, b);
        for(int[] n: c){
            for(int x : n){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        
    }
    
}