public class MergeArray {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, 2, 5, 3}, arr2 = {6, 5, 7, 2, 1};
        int[] merged = new int[arr1.length + arr2.length];
        for(int i = 0; i<arr1.length; i++){
            merged[i] = arr1[i];
        }
        for(int i = 0, j=arr1.length; i<arr2.length; i++, j++){
            merged[j] = arr2[i]; 
        }
        System.out.print("Merged array [ ");
        for(int i : merged){
            System.out.print(i+", ");
        }
        System.out.print("]");
    }
}
