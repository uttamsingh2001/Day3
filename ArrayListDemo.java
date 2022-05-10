package collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Way of Declare ArrayList
        //ArrayList<Integer> al=new ArrayList<Integer>();
        //ArrayList al=new ArrayList();
        //ArrayList<String> al=new ArrayList<String>();
        //List al=new ArrayList();

        ArrayList al = new ArrayList();

        //Add Element to ArrayList

        al.add(100);
        al.add("UTTAM");
        al.add(16.9);
        al.add("Hello");

        //Print the ArrayList
        System.out.println(al);  // [100, UTTAM, 16.9, Hello]

        //Size
        System.out.println("The Size of ArrayList is : " + al.size());    //4

        //remove

        al.remove(1);  //here index number is passed
        System.out.println("After Remove Element from the ArrayList" + al);

        //get
        System.out.println("object that are present in 2nd index is : "+al.get(2));

        //set
        System.out.println("Element of the arraylist "+al);
        al.set(2,"Hi");
        System.out.println("After Replacing Element "+al);

        //contains

        System.out.println(al.contains("Hi"));

        //isEmpty

        System.out.println(al.isEmpty());

        //Way of print Element of ArrayList

        //using for loop

        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

        //2nd Using For each Loop

        for(Object e:al) //store all the al element in e
        {
            System.out.println(e);
        }

        //3rd way Using Iterator

        Iterator it=al.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
