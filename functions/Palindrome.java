package functions;
import java.util.Scanner;
public class Palindrome {
    public static boolean isPalindrome(String s){
        s = s.toLowerCase();
        for(int i = 0, j=s.length()-1; i<s.length();i++, j--){
            if(s.charAt(i) != s.charAt(j))
                return false;
        }
        return true;
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String s = sc.next();
        if(isPalindrome(s))
            System.out.println("\"" + s + "\" is palindrome" );
        else
            System.out.println("\"" + s + "\" is not palindrome" );
    }
}
