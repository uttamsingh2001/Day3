package collectiondemos;

import javax.swing.text.html.HTMLDocument;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
    public static void main(String[] args) {

        //Way of Declare HashSet

        // HashSet hs=new HashSet();    Default Size is 16 and Default Loadfactor is 0.75(75%).
        //  HashSet hs =new HashSet(100);  initial size is 100
        // HashSet hs =new HashSet(100,(Float)0.90)  Initial Size is 100 and load factor is 0.90 means 90%.
        // HashSet<Integer> hs =new HashSet<Integer>();  We can insert only Integer Type Element in Hashset

        HashSet hs=new HashSet();

        // ADD

        hs.add("Uttam");
        hs.add(100);
        hs.add(0.75f);
        hs.add("Singh");

        System.out.println(hs);  //Element are not Insert in the order that we have added

        //remove

        hs.remove(100);  //  100 is value and index concept is not in hashset

        System.out.println("After Remove "+hs);

        //contain

        System.out.println(hs.contains("Singh"));

        //isEmpty

        System.out.println(hs.isEmpty());

        //Reading data of HashSet Using For each loop
        // we can't use For Loop to display the Element of Hashset because there not concept of Index

        for (Object e: hs){
            System.out.println(e);
        }

        //reading data using Iterator

        Iterator it=hs.iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }



    }

}
