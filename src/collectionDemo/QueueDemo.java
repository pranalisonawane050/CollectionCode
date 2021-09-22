package collectionDemo;
import  java.util.*;
public class QueueDemo {
	public static void main(String args[])
    {
        Queue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
		  pq.offer(11);
		  pq.offer(10);
		  pq.offer(9);
		  
		  System.out.println("Queue"+pq);
	        System.out.println("Poll "+pq.poll());
	        System.out.println("Updated Queue"+pq);
	        System.out.println("peek :"+pq.peek());
	        System.out.println(pq.offer(45));
	        System.out.println(pq);
        
        /*
        Iterator iterator = pq.iterator();
       
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }*/
    }
}