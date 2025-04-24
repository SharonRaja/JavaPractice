package colletion_and_map;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSet3 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("mark");
        hs.add("steve");
        hs.add("mark");
        hs.add("Steve");
        hs.add("bob");
        hs.add("alice");
        System.out.println(hs.toString());
        hs.remove("mark");
        System.out.println(hs.toString());
        System.out.println("Checking does mark exist in the hashset");
        if(hs.contains("mark")){
            System.out.println("mark is present");
        }
        else{
            System.out.println("mark is absent");
        }
        System.out.println("Converting hash set to array list");
        ArrayList<String> ar = new ArrayList<String>(hs);
        System.out.println(ar.toString());
        System.out.println("Printing using Iterator");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nPrinting using for-each loop");
        for(String x : hs){
            System.out.print(x + " ");
        }


    }    
}
