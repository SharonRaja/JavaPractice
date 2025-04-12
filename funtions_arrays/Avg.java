package funtions_arrays;

public class Avg {
    public static float avg(int[] arr){
        float sum = 0;
        for(int i = 0; i<arr.length; i++ ){
            sum += arr[i];
        }
        return sum/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {5,2,7,2,5};
        System.out.println("Average = " + avg(arr));

    }
    
}
