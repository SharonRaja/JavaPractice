public class FrequencyFinder {
    // public static void main(String[] args) {
        
    //     int[] arr = {3,2,5,6,1, 0 , 0, 0};
    //     int c=0;
    //     for(int i=0;i<arr.length;i++){
    //         if(0 == arr[i]){
    //             c++;
    //             arr[i] = 0;
    //         }
    //     }
    //     if(c>0)
    //         System.out.print( "0 -> " + c);

    //     for(int n : arr){
    //         c = 0;
    //         for(int i=0;i<arr.length;i++){
    //             if(n == arr[i] && 0 != arr[i]){
    //                 c++;
    //                 arr[i] = 0;
    //             }
    //         }
    //         if (c>0)
    //             System.out.print(", " + n + " -> " + c);
    //         c = 0;
            
    //     }  
    // }

    public static void main(String[] args) {
        int[] arr = {33,2,5,6, 8, 8,1, 33, 0, 0};
        int c;
        boolean[] isVisted = new boolean[arr.length];
        for(int i = 0; i<arr.length; i++){
            c = 1;
            for(int j = i+1; j<arr.length; j++){
                if (arr[i] == arr[j] && !isVisted[j] ){
                    c++;
                    isVisted[j] = true;
                }
            }
            if(!isVisted[i])
               System.out.print(arr[i] + " -> " + c + ", ");
        }
    }
    
}
