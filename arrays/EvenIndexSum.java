package arrays;
public class EvenIndexSum {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1};
        int sum = 0;
        for(int i=0;i<arr.length;i += 2){
            sum += arr[i];
        }
        System.out.println("The average is " + sum );
    }
}
