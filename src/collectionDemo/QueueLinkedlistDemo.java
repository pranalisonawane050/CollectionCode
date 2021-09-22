package collectionDemo;

import java.util.*;
public class QueueLinkedlistDemo {
	public static void main(String args[]) {
		  Queue<String> que = new LinkedList<>();
		  que.add("Pranali");
		  que.add("Pravin");
		  que.add("Sonawane");
	  
	        System.out.println("Queue"+que);
	        System.out.println("Poll "+que.poll());
	        System.out.println("Updated Queue"+que);
	        System.out.println("peek :"+que.peek());
	        System.out.println(que.offer("ppp"));
	        System.out.println(que);
	}
      
}
