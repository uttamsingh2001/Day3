package collectiondemos;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo1 {
    public static void main(String[] args) {

        LinkedHashSet lh=new LinkedHashSet();
        lh.add("Uttam");
        lh.add(100);
        lh.add(100.5f);

        System.out.println(lh);
    }
}
