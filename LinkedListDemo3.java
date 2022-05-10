package collectiondemos;

import java.util.LinkedList;

public class LinkedListDemo3 {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add("A");
        l.add("B");
        l.add("C");
        l.add("D");
        l.add("E");

        System.out.println("Element Present in LinkedList : "+l); //[A, B, C, D, E]

        //addfirst & addlast
        l.addFirst("UTTAM");
        l.addLast("SINGH");

        System.out.println("After add Element in LinkedList : "+l);

        // removefirst & remove Last
        l.removeFirst();
        l.removeLast();

        System.out.println("after remove Element from LinkedList : "+l);

        //getFirst & getLast

        System.out.println("Element Present at first position of linkedlist :"+l.getFirst());
        System.out.println("Element Present at Last position of linkedlist :"+l.getLast());


    }
}
