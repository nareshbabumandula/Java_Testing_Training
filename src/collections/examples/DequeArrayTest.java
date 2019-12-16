package collections.examples;
import java.util.*;  

public class DequeArrayTest 
{  
	public static void main(String[] args)
	{  
		//Creating Deque and adding elements  
		Deque<String> deque = new ArrayDeque<String>();  
		deque.add("Ravi");    
		deque.add("Vijay");     
		deque.add("Ajay");
		deque.add("Kiran");
		deque.add("Teja");
		
		
		System.out.println(deque.element());
		//deque.remove();
		deque.poll();
		System.out.println("Deque list after removing an element " + deque);
		
		System.out.println(deque);
		deque.clear();
		System.out.println(deque);
		//Traversing elements  
		for (String str : deque) {  
			System.out.println(str);  
		}  
	}  
}  