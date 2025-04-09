import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n1.ODD or EVEN\n2.Check Prime\n3.Reverse Number\n4.Exit");
            int n = 0,option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter a number : ");
                    n = sc.nextInt();
                    if(n%2==0)
                        System.out.println(n + " is a even number");
                    else
                        System.out.println(n + " is a odd number");
                    break;
                case 2:
                    System.out.print("Enter a number : ");
                    n = sc.nextInt();
                    boolean isPrime = true;
                    if(n==1 || n==0){
                        System.out.println(n + " is neither prime nor composit");
                        break;
                    }
                    for(int j=2; j<n;j++){
                        if(n%j==0){
                            isPrime = false;
                            break;
                        }
                    }
                    if(isPrime)
                        System.out.println(n+" is a prime number");
                    else 
                        System.out.println(n + " is not a prime number");
                    break;
                case 3:
                    System.out.print("Enter a number : ");
                    n = sc.nextInt();
                    int rev_num=0;
                    while ((float)n/10>=0.1) {
                        rev_num = rev_num*10 + n%10;
                        n /=10;
                    }
                    System.out.println("Reversed number is " + rev_num);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Enter a valid option!");
                    break;
            }

        }while(true);
    }
}
