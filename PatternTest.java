import java.util.Scanner;
public class PatternTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("\n1.Square Pattern\n2.Triange Pattern\n3.X Pattern\n4.Exit");
            int n = 0,option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter a number : ");
                    n = sc.nextInt();
                    for(int i = 1;i<=n;i++){
                        for(int j = 1;j<=n;j++)
                            System.out.print("*  ");
                        System.out.println();
                    }

                    
                case 2:
                    System.out.print("Enter a number : ");
                    n = sc.nextInt();
                    for(int i = n*2-1; i>0; i--){
                        for(int j = 1; j<n*2;j++){
                            if(i-j>=1){
                                System.out.print(" ");
                            }
                            else{
                                System.out.print("* ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.print("Enter a number : ");
                    n = sc.nextInt();
                    int size = n*2-1;
                    for(int i = 1; i<=size;i++){
                        for(int j = 1; j<= size ; j++){
                            if(i==j || j==size-i+1){
                                System.out.print("* ");
                            }
                            else{
                                System.out.print("  ");
                            }
                        }
                        System.out.println();
                    }
                    
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
