package arrays;
import java.util.Arrays;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6, 8, 8,1};
        int count = 0;
        boolean isDuplicate;
        int[] copy = new int[arr.length];
        for(int n : arr){
            // System.out.println(n);
            isDuplicate = false;
            for(int i =0; i<count ;i++){
                if(n == copy[i]){
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                // System.out.println(n);
                copy[count++]=n;
            }
        }
        System.out.print("[ ");
        for(int i = 0;i<count;i++){
            System.out.print(copy[i]+", ");
        }
        System.out.println("]");
 
    }
    
}
