package collection_framework;

import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add("apple");
        pq.add("mango");
        pq.add("banana");
        pq.add("pienapple");


        System.out.println(pq);

        //insertion and duplicates are allowed, heterogeneous not allowed, null values are not allowed

        //get head element element() and peek()
        System.out.println(pq.element()); // returns head elements if empty getting no such element exception

        System.out.println(pq.peek());  // if empty getting null value

        //remove() and poll() methods
        System.out.println(pq.remove()); // returns head elements if empty getting no such element exception
        System.out.println(pq.poll());  // if empty getting null value


    }
}
