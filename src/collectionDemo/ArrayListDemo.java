package collectionDemo;
import java.util.*;
public class ArrayListDemo {
	public static void main(String args[]) {
		 
			List<Integer> l1 = new ArrayList<>();
		//  l1.add(1);  add() method is used to insert an element in the ArrayList.
	        l1.add(2);
	        l1.add(3);
	        l1.add(0,8);  // Inserts an element at the given index.
	       // System.out.println("Arraylist l1 is: "+l1);
	       List<Integer> l2 = new ArrayList<>();//another arraylist
	        l2.add(12);
	        l2.add(16);
	        //System.out.println("Arraylist l2 is: "+l2);
	        l1.addAll(l2); // add at end
	        l1.addAll(0,l2);//add at start
	        l1.set(1, 66);//set the element at index
	       // System.out.println(l1.contains(8)); //check element is therer or not
	       
	        //System.out.println(l1.indexOf(12)); //first index of 12
	        //System.out.println(l1.lastIndexOf(12));//last index of 12
	       
	       
	        //l1.remove(1);
	        //System.out.println("Updated Array list l11 iss  :"+l1);//print arraylist
	       /* for (int i=0;i<l1.size();i++)
	        {
	        	System.out.println(l1.get(i));
	        }
	        */
	
	      List<String>str1=new ArrayList<>();
	        str1.add("Pravin");
	        str1.add("Pramila");
	        str1.add("Pranali");
	        str1.add("Pranav");
	        //System.out.println("list is:"+str1);
	        str1.remove(String.valueOf("Pramila"));
	        str1.remove("Pranav");
	        System.out.println("updated list is:"+str1);
	        System.out.println(str1.size());
	        for (int i=0;i<str1.size();i++)
	        {
	        	System.out.println("the element is "+str1.get(i));
	        }
	        
	        for(String element :str1) {
	        	System.out.println("the element is "+element);
	        }
	        /*
	        Iterator<String> it= str1.iterator();
	        		while (it.hasNext()) {
	        			System.out.print("Iterator is "+ it.next());
	        		}*/
	}
}
