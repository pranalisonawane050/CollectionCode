package collectionDemo;
import java.util.*;
public class ArrayDequeDemo {
	public static void main(String[] args) {
	ArrayDeque<Integer> ad1 = new ArrayDeque<>();
    ad1.add(6);
    ad1.add(56);
    
    ad1.add(5);
    System.out.println(ad1);
    ad1.addFirst(11);
    System.out.println(ad1);
    ad1.addLast(00);
    System.out.println(ad1);
    //System.out.println(ad1.getFirst());//print 1st element
    //System.out.println(ad1.getLast());//print last element
    
}
}
