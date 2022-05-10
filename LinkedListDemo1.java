package collectiondemos;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo1 {
    public static void main(String[] args) {

        //Declare LinkedList

        // LinkedList<Integer> l1=new LinkedList<Integer>();
        // LinkedList<String> l1=new LinkedList<String>();

        LinkedList l1 = new LinkedList();

        //Add Element in LinkedList.
        l1.add("A");
        l1.add(100);
        l1.add("C");
        l1.add(10.8);
        l1.add(null);

        //Print ALl the Element of LinkedList
        System.out.println(l1);

        //size
        System.out.println(l1.size());

        //remove

        System.out.println("Element of the LinkedList : " + l1);
        l1.remove(2);
        System.out.println("After remove Element from LinkedList : " + l1);

        //get and set
        System.out.println(l1.get(1));
        l1.set(1, "UTTAM");
        System.out.println(l1);

        // contains
        System.out.println(l1.contains("UTTAM"));

        //Way of print Element of linkedList

        //using for loop

        for(int i=0;i<l1.size();i++)
        {
            System.out.println(l1.get(i));
        }

        //2nd Using For each Loop

        for(Object e:l1) //store all the al element in e
        {
            System.out.println(e);
        }

        //3rd way Using Iterator

        Iterator it=l1.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }


    }
}
