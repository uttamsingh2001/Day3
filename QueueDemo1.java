package collectiondemos;

import java.util.PriorityQueue;

public class QueueDemo1 {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();

        //Add Element Using Add() and Offer() Method

        pq.add(100);
        pq.add(21);
        pq.add(56);
        pq.offer(56);


        System.out.println(pq);

        // Use Element () And Peek() Method
        System.out.println(pq.element());  //return the head of Element if head Empty return Exception
        System.out.println(pq.peek());    //return the head of Element if head Empty return Null


        //Use poll() & Remove()

        System.out.println(pq.poll()); //return the head of Element and remove head from queue , if head Empty return null
        System.out.println(pq.remove()); //return the head of Element and head from queue if head Empty return Exception
    }
}
