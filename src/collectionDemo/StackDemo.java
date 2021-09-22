package collectionDemo;
import  java.util.*;
public class StackDemo {
	/*
		public static void main(String args[])
		{
			Stack<String> st=  new Stack<>();
			st.push("pen");
			st.push("notebook");
			st.push("pencil");
			System.out.println("Stack :" +st);
			System.out.println(st.peek());
			st.pop();
			System.out.println("Stack :" +st);
			System.out.println(st.peek());
		}
		*/
		 static void stack_push(Stack<Integer> stack)
		    {
			  stack.add(5);
			  stack.add(4);
			  stack.add(3);
			  stack.add(2);
			  stack.add(1);
			  System.out.println(stack);
			  /*
		        for(int i = 0; i < 5; i++)
		        {
		            stack.push(i);
		        }*/
		    }
		    //POP
		    static void stack_pop(Stack<Integer> stack)
		    {
		        System.out.println("Pop Operation:");
		 
		        for(int i = 0; i < 5; i++)
		        {
		            Integer y = (Integer) stack.pop();
		            System.out.println(y);
		        }
		    }
		 
		    // Peek
		    static void stack_peek(Stack<Integer> stack)
		    {
		        Integer element = (Integer) stack.peek();
		        System.out.println("Element on stack top: " + element);
		    }
		     
		    // Searching 
		    static void stack_search(Stack<Integer> stack, int element)
		    {
		        Integer pos = (Integer) stack.search(element);
		 
		        if(pos == -1)
		            System.out.println("Element not found");
		        else
		            System.out.println("Element is found at position: " + pos);
		    }
		 
		 
		    public static void main (String[] args)
		    {
		        Stack<Integer> stack = new Stack<Integer>();
		 
 	        stack_push(stack);
		        stack_pop(stack);
		        stack_push(stack);
		        stack_peek(stack);
		        stack_search(stack, 2);
		        stack_search(stack, 4);
		    }
}
