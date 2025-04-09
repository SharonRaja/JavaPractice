public class ArrayMin {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6,1};
        int mn = arr[0];
        for(int i=1;i<arr.length;i++){
            if(mn > arr[i])
                mn = arr[i];
        }
        System.out.println("Max number is " +  mn);
    }
}
