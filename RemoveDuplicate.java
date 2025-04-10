public class RemoveDuplicate {
    public static void main(String[] args) {
        int[] arr = {3,2,5,6, 8, 8,1, 0 , 0, 0};
        int c = 0;
        int[] copy = new int[arr.length];
        for(int n : arr){
            for(int i =0; i<arr.length ;i++){
                if(n == copy[i]){
                    break;
                }
                else if(i == arr.length-1){
                    copy[c]=n;
                    c++;
                }
            }
        }
        System.out.print(" [ ");
        for(int  x: copy){
            System.out.print(x+", ");
        }
        System.out.println("]");
 
    }
    
}
