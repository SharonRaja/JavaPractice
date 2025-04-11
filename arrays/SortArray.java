package arrays;
public class SortArray {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        int tmp;
        for(int i =0; i<=arr.length;i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        System.out.print(" [ ");
        for(int  x: arr){
            System.out.print(x+", ");
        }
        System.out.println("]");              
    }
}
