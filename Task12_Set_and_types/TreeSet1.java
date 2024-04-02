//TreeSet 

import java.util.*; 
 
class TreeSet1 
{ 

	public static void main(String[] args) 
	{ 
		
		NavigableSet<String> ts = new TreeSet<>(); 

		ts.add("A"); 
		ts.add("B"); 
		ts.add("C"); 
		ts.add("D"); 
		ts.add("E"); 
		ts.add("F"); 

		// Print and display initial elements of TreeSet 
		System.out.println("Initial TreeSet " + ts); 
 
		ts.remove("B");    //Removing element B
		System.out.println("After removing element " + ts); 

		ts.pollFirst();       //using pollFirst() method removing the first element
		System.out.println("After removing first " + ts); 

		ts.pollLast();    //Removing the last element using pollLast() method
		System.out.println("After removing last " + ts); 
	} 
}
