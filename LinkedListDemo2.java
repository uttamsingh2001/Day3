package collectiondemos;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo2 {

    public static void main(String[] args) {


        LinkedList l = new LinkedList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");

        LinkedList l_dup = new LinkedList();
        l_dup.addAll(l);
        System.out.println(l);

        l_dup.removeAll(l);

        System.out.println("After Removing :" + l_dup);


        //sort Element Using Collections.sort Method From collection class

        System.out.println("Before Sorting : " + l);
        Collections.sort(l);
        System.out.println("After Sorting Element in assending order : " + l);
        Collections.sort(l, Collections.reverseOrder());
        System.out.println("After Sorting Element in Desendingorder : " + l);
        Collections.shuffle(l);
        System.out.println("After Shuffle Eement of ArrayList  : " + l);
    }
}
