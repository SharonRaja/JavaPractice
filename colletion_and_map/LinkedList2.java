package colletion_and_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedList2 {

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(10);
        ll.add(8);
        System.out.println(ll.toString());
        System.out.println("\nAdding at head");
        ll.addFirst(1000);
        System.out.println(ll.toString());
        System.out.println("\nAdding at tail");
        ll.add(-1000);
        System.out.println(ll.toString());
        System.out.println("\nAdding at 2 index");
        ll.add(2, 5000);
        System.out.println(ll.toString());
        System.out.println("\nremoving the first and the last element");
        ll.pollFirst();
        ll.pollLast();
        System.out.println(ll.toString());
        System.out.println("\nprinting all the element using iterator");
        Iterator<Integer> itr = ll.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println("\nLinked List to Array List");
        ArrayList<Integer> al = new ArrayList<Integer>(ll);
        System.out.println(al.toString());
        System.out.println("\nPrint the linked list element in reverse order");
        ListIterator<Integer> litr = ll.listIterator(ll.size());

        while (litr.hasPrevious()) {
            System.out.print(litr.previous() +  " ");
        }

        
    }
}
