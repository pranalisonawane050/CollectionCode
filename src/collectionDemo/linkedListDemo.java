package collectionDemo;
import java.util.*;
public class linkedListDemo {
	public static void main(String args[]) {
		/*
		 LinkedList<Integer> l1 = new LinkedList<>();
		 LinkedList<Integer> l2 = new LinkedList<>();//another linkedlist
	      //  l1.add(1);  add() method is used to insert an element in the LinkedList.
	        l1.add(2);
	        l1.add(3);       
	        l1.add(0,8);  // Inserts an element at the given index.
	        	//System.out.println(l1);
	        l2.add(16);
	        l2.add(2);
	       // l1.addAll(l2); // add at end(merge)
	        	System.out.println(l1);
	       // l1.addAll(0,l2);//add at start
	        	System.out.println(l1);
	        //l1.addAll(1,12); add at index given
	        l1.set(1, 66);//set the element at index
	        
	       // System.out.println(l1.contains(8)); //check element is there or not
	       
	       // System.out.println(l1.indexOf(2)); //first index of 12
	      //  System.out.println(l1.lastIndexOf(2));//last index of 12
	       
	        l1.remove(1);
	        //	System.out.println(l1);//print Linkedlist
	        
	        
	        l1.addLast(0);
	        l1.addFirst(0);
	       /* for (int i=0;i<l1.size();i++)
	        {
	        	System.out.println(l1.get(i));
	        }
	        */
		LinkedList<String> l3 = new LinkedList<>();
		l3.add("Sona");
		l3.add("mona");
		l3.add("tina");
		l3.add("rema");

		for (int i=0;i<l3.size();i++)
        {
        	System.out.println("the element is "+l3.get(i));
        }
		
	}
}
