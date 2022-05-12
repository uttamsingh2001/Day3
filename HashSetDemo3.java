package collectiondemos;

import java.util.HashSet;

public class HashSetDemo3 {
    public static void main(String[] args) {

        HashSet<Integer> hs =new HashSet<Integer>();
        hs.add(1);
        hs.add(2);
        hs.add(3);

        System.out.println("Set one :"+hs);

        HashSet<Integer> hs1 =new HashSet<Integer>();
        hs1.add(1);
        hs1.add(2);
        hs1.add(3);
        hs1.add(4);
        hs1.add(5);

        System.out.println("Set Two :"+hs1);



        //Union  : It add both the set and return result

        hs.addAll(hs1);
        System.out.println("Union : " +hs);

        //Intersection
        hs.retainAll(hs1);
        System.out.println("Intersection : " +hs);

        //Defference

        hs.removeAll(hs1);
        System.out.println("Diffence "+hs);


    }
}
