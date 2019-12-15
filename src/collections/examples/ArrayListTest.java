package collections.examples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListTest {

	/**
	 * @Arraylist class accepts/contains duplicate elements
	 * @Arraylist class maintains insertion order
	 * @Arraylist allows random access since array works on index basis
	 * @Arraylist is not synchronized
	 * @In Arraylist manipulation is slow because a lot of shifting needs to occur if any element is removed from the list
	 * @author NareshBabu
	 */
	public void ArrayListExample()
	{
		//Create ArrayList
		ArrayList<String> list = new ArrayList<String>(); 

		// Add objects to the arraylist
		list.add("Shilpa");
		list.add("Pratima");
		list.add("Ajay");
		list.add("Nithya");
		list.add("Bindu");
		list.add("Swapna");
		list.add("Hari");
		list.add("Naresh");
		list.add("Kiran");
		list.add("Pratima");
		System.out.println(list.size()); // return the size of the collection
		System.out.println(list.contains("Swapna"));
		System.out.println(list.get(0));
		System.out.println("Before removing an element - "  + list);
		System.out.println(list.remove(1));
		System.out.println("After removing an element - "  + list);
		
		
		Iterator<String> itr = list.iterator();
		while (itr.hasNext()) {
			String string = (String) itr.next();
			System.out.println("Element value found as : " + string);
		}
		
		System.out.println(list); //print all arraylist objects
		System.out.println(list.indexOf("Kiran")); //returns the index of the element
		System.out.println(list.get(0)); //returns the first object
		System.out.println(list.remove(2)); // Removed the element found at index 2
		System.out.println(list); //print all arraylist objects
		System.out.println(list.contains("Kiran")); // returns boolean value true/false based on availability of object in the arraylist
		System.out.println(list.isEmpty()); // Returns boolean value
		list.clear(); // clearing the list
		list.retainAll(list);
		System.out.println(list.isEmpty()); // Returns boolean value
		System.out.println(list);
		System.out.println(list.get(1)); //returns the object associated with the index

	}

	public static void main(String[] args) {

		ArrayListTest list = new ArrayListTest();
		list.ArrayListExample();
	}

}
