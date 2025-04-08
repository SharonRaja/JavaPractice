import java.util.Scanner;
public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items you want to add to cart :");
        int qty, item = sc.nextInt();
        double price, total_price=0;
        for(int i = 1; i<=item; i++){
            System.out.print(" Enter the price for Item "+i +" : ");
            price = sc.nextDouble();
            System.out.print(" Enter the quantity for "+i +" : ");
            qty = sc.nextInt();
            total_price += qty * price;
        }
        System.out.println("Total price : " + total_price);

    }
}
