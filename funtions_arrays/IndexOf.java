package funtions_arrays;
public class IndexOf {

    private static int indexOf(int[] a,int x){
        int position = 99999;
        for(int i=0;i<a.length;i++){
            if(x == a[i])
                position = i;
        }
        return position;
    }

    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1};
        System.out.println("Position = " +  indexOf(arr, 5));
    }
}
