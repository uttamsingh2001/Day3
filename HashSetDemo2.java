package collectiondemos;

import java.util.HashSet;

public class HashSetDemo2 {
    public static void main(String[] args) {
        HashSet<Integer> hs =new HashSet<Integer>();
        hs.add(100);
        hs.add(12);
        hs.add(20);

        System.out.println(hs);

        HashSet<Integer> hs1 =new HashSet<Integer>();
        hs1.add(1001);
        hs1.addAll(hs);
        System.out.println("After Adding the Collection hs ");
        System.out.println(hs1);

        hs1.removeAll(hs);

        System.out.println("After Remove HS Colletion from HS1");
        System.out.println(hs1);



    }
}
