package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add("A");
        al.add("B");
        al.add("C");
        al.add("D");
        al.add("E");

        ArrayList al_dup=new ArrayList();
        al_dup.addAll(al);
        System.out.println(al);

        al_dup.removeAll(al);

        System.out.println("After Removing :" +al_dup);


        //sort Element Using Collections.sort Method From collection class

        System.out.println("Before Sorting : "+ al);
        Collections.sort(al);
        System.out.println("After Sorting Element in assending order : "+al);
        Collections.sort(al,Collections.reverseOrder());
        System.out.println("After Sorting Element in Desendingorder : "+al);
        Collections.shuffle(al);
        System.out.println("After Shuffle Eement of ArrayList  : "+al);
    }
}
