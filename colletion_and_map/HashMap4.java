package colletion_and_map;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMap4 {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(2, "mark");
        hm.put(3, "tony");
        hm.put(4, "job");
        hm.put(5, "musk");
        hm.put(6, "elon");
        System.out.println(hm.toString());
        System.out.println("The value for the key : 3 is " + hm.get(3));
        hm.remove(3);
        System.out.println("element after removeing key = 3 : " + hm.toString());
        for(int key: hm.keySet()){
            System.out.print(hm.get(key) + " ");
        }
        ArrayList<Integer> keys = new ArrayList<Integer>(hm.keySet());
        ArrayList<String> values = new ArrayList<String>(hm.values());
        System.out.println("keys : " + keys.toString());
        System.out.println("Values : " + values.toString());
    }
}
