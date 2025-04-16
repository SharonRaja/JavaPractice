package oops;

// Encapsulation 
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

class Contact {
    String name, phoneNumer;

    public void setName(String name){
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber){
        if(!phoneNumber.matches("\\d+")){
            System.out.println("Phone number should only contains number");
        }
        else {
            this.phoneNumer= phoneNumber;
        }
    }

    public String getName(){
        return name;
    }

    public String getPhoneNumber(){
        return phoneNumer;
    }

    public void display(){
        System.out.println("Name : " + name);
        System.out.println("Phone number : " + phoneNumer );
    }
}

class ContactsManager{
    List<Contact> contactList= new LinkedList<Contact>();
    Scanner sc = new Scanner(System.in);

    public void addContact(){
        Contact c = new Contact();
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        c.setName(name);
        System.out.print("Enter the phone number : ");
        String phone = sc.nextLine();
        c.setPhoneNumber(phone); 
        contactList.add(c);
    }

    public void serchContact(){
        System.out.print("Enter the contact name : ");
        String name = sc.nextLine();
        for(Contact c : contactList){
            if(c.getName().toLowerCase().equals(name.toLowerCase())){
                c.display();
                break;
            }     
        }
    }

    public void viewAll(){
        for(Contact c : contactList)
            c.display();
    }
}

public class Contacts {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ContactsManager cm = new ContactsManager();
        int op;
        while (true) {
            System.out.print("1. Add Contact\n2. View Contacts\n3. Search Contact\n4. Exit\nEnter the option : ");
            op = scan.nextInt();
            scan.nextLine();
            switch (op) {
                case 1:
                    cm.addContact();
                    break;
                case 2:
                    cm.viewAll();
                    break;
                case 3:
                    cm.serchContact();
                    break;
                case 4:
                    return;
            
                default:
                    break;
            }
        }
    }
    
}
