public class ArrayAvg {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1};
        float sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println("The average is " + sum/arr.length );
    }
}
