import java.util.Scanner;
public class LoginLimit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int acc_no, pin, c=3;
        while(c>0){
            c--;
            System.out.print("Enter the account number : ");
            acc_no = sc.nextInt();
            System.out.print("Enter the pin number : ");

            pin = sc.nextInt();

            if(acc_no == 2344 && pin == 3872){
                System.out.println("Login Success" );
                return;
            }else {
                System.out.println("Account number or password does not match");
                if(c>=1){
                    System.out.println("You have " + c + " attempts left");
                }else{
                    System.out.println("Account Locked");
                }
            }
        }
    }
}
