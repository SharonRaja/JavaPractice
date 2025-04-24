package colletion_and_map;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("Alice");
        arr.add("bob");
        arr.add("mark");
        arr.add("jack");
        arr.add("musk");
        arr.add("antony");
        System.out.println(arr.toString());
        System.out.println("\n Removing element using index");
        arr.remove(2);
        System.out.println(arr.toString());
        System.out.println("\n Removing element using value");
        arr.remove("musk");
        System.out.println(arr.toString());
        System.out.println("Searching the array list for jack");
        if(arr.contains("jack")){
            System.out.println("jack is present");
        }
        else{
            System.out.println("jack is absent");
        }
        System.out.println("Sorting the array");
        arr.sort(null);
        System.out.println(arr.toString());
        System.out.println("Converting array list to Array _______");
        String[] str = arr.toArray(new String[0]);
        for(int i =0; i<str.length; i++){
            System.out.println(str[i]);
        }
    }
}
