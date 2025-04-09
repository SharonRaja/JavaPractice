public class SecondLargest {
    public static void main(String[] args) {
        int[] arr = {3,2,6,6,1};
        int mx = arr[0], mx2 = 0;
        for(int i=1;i<arr.length;i++){
            if(mx<arr[i]){
                mx = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(mx == arr[i]){
                continue;
            }
            if(mx2<arr[i]){
                mx2 = arr[i];

            }
        }
        System.out.println("Second largest number is " +  mx2);
    }
}
