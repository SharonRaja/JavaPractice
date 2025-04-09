import java.util.Scanner;
public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float sum = 0;
        for(int i=1; i<=5; i++){
            System.out.print("Enter the mark for subject " + i + " : ");
            sum += sc.nextFloat();
        }
        float avg = sum/5;
        if(avg >= 90){
            System.out.println("Grade A");
        }
        else if(avg >= 80){
            System.out.println("Grade B");
        }
        else if(avg >= 70){
            System.out.println("Grade C");
        }
        else if(avg >= 60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");   
        }
    }
}
