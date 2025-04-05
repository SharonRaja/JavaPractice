import java.util.Scanner;
public class Ascii {

    // // Char to int 
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a character : ");
    //     char c = sc.next().charAt(0);
    //     System.out.println("int value of " + c + " is "+ (int)c);
    // }

    // // int to char
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter a character int : ");
    //     int i = sc.nextInt();
    //     if(i>=0 && i<=127){
    //         System.out.println("Character of " + i + " is " +(char)i);
    //     }
    //     else{
    //         System.out.println("Int value must be between 0 and 127");
    //     }
    // }
    
    // Swap int using Arithmatic
    // public static void main(String[] args) {
    //     int a, b;
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter  a number for A :");
    //     a = sc.nextInt();
    //     System.out.print("Enter  a number for B :");
    //     b = sc.nextInt();
    //     b += a;
    //     a = b - a;
    //     b -= a;
    //     System.out.println("a = " +  a +"\nb = " + b);
    // }

    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  a number for A :");
        a = sc.nextInt();
        System.out.print("Enter  a number for B :");
        b = sc.nextInt();
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println(a + " + " + b);
    }
}
