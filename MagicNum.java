import java.util.Scanner;
public class MagicNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int i = sc.nextInt();
        int sum = 0;
        do{
            sum = 0;
            while(i/10 >=1){
                sum += i%10;
                i =i/10;
            }
            sum += i%10;
            i =i/10;
            i = sum;
        }while(sum/10 >= 1);
        if(sum!=1){
            System.out.println("It is not a magic number");
        }
        else{
            System.out.println("It is a magic number");
        }

    }
}
