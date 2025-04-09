public class ArrayMax {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1};
        int mx = arr[0];
        for(int i=1;i<arr.length;i++){
            if(mx<arr[i])
                mx = arr[i];
        }
        System.out.println("Max number is " +  mx);
    }
}
