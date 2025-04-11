import java.util.Scanner;
public class FunAmstrong {

    public static boolean isAmstrong(int n){
        int digitCount= 0,copy = n;

        while ((float)n/10>=0.1) {
            digitCount++;
            n /=  10;
        }
        n = copy;
        int amstrongNum = 0;
        for(int i = digitCount; i>0; i--) {
            amstrongNum += Math.pow(n%10, digitCount);
            n /=  10;
        }
        if(copy == amstrongNum)
            return true;
        else 
            return false;
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        if(isAmstrong(n))
            System.out.println(n + " is Amstrong number");
        else
            System.out.println(n + " is not a Amstrong number");
    }
}
