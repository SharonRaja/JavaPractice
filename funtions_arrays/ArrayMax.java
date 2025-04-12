package funtions_arrays;
public class ArrayMax {

    private static int max(int[] a){
        int mx = a[0];
        for(int i=1;i<a.length;i++){
            if(mx<a[i])
                mx = a[i];
        }
        return mx;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1};
        
        System.out.println("Max number is " +  max(arr));
    }
}
