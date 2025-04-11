package arrays;
public class CountOddEven {

    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1};
        int odd = 0, even=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                even++;
            else 
                odd++;

        }
        System.out.println("Even = " + even + " Odd = " + odd );
    }
    
}
