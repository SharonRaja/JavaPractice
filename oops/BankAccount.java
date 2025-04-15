package oops;

import java.util.Scanner;

public class BankAccount {
    static Scanner sc = new Scanner(System.in);
    String name;
    long accountNumber;
    double balance;

    void deposit(){
        System.out.print("Enter the deposit amount : ");
        long amount = sc.nextLong();
        if(amount > 0)
            balance += amount;
        else
            System.out.println(amount + "can't be deposited");
    }

    void withdraw(){
        System.out.print("Enter the withdraw amount : ");
        long amount = sc.nextLong();
        if(balance - amount >= 0){
            balance -= amount;
            System.out.println("Amount deposited ");
        }
        else{
            System.out.println("Insufficient balance");
        }
    }

    double checkBalance(){
        return balance;
    }

    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        System.out.print("Enter the account holder name : ");
        b.name = b.sc.nextLine();
        System.out.print("Enter the account number : ");
        b.accountNumber = b.sc.nextLong();
        b.deposit();
        b.withdraw();
        System.out.println("Balance " + b.checkBalance());
    }
    
}
