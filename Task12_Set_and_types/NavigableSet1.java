// Java program to demonstrate 
// the working of NavigableSet 
import java.util.NavigableSet; 
import java.util.TreeSet; 

public class NavigableSet1 
{ 
	public static void main(String[] args) 
	{ 
		NavigableSet<Integer> ns = new TreeSet<>(); 
		ns.add(0); 
		ns.add(1); 
		ns.add(2); 
		ns.add(3); 
		ns.add(4); 
		ns.add(5); 
		ns.add(6); 

	
		NavigableSet<Integer> reverseNs = ns.descendingSet();  //Reverse set
 
		System.out.println("Normal order: " + ns); 
		System.out.println("Reverse order: " + reverseNs); 

		NavigableSet<Integer> threeOrMore = ns.tailSet(4, true); 
		System.out.println("3 or more: " + threeOrMore); 
		System.out.println("lower(3): " + ns.lower(4)); 
		System.out.println("floor(3): " + ns.floor(4)); 
		System.out.println("higher(3): " + ns.higher(4));  

		System.out.println("pollFirst(): " + ns.pollFirst()); 
		System.out.println("Navigable Set: " + ns); 

		System.out.println("pollLast(): " + ns.pollLast()); 
		System.out.println("Navigable Set: " + ns); 

		System.out.println("pollFirst(): " + ns.pollFirst()); 
		System.out.println("Navigable Set: " + ns); 

		System.out.println("pollFirst(): " + ns.pollFirst()); 
		System.out.println("Navigable Set: " + ns); 

		System.out.println("pollFirst(): " + ns.pollFirst()); 
		System.out.println("Navigable Set: " + ns); 

		System.out.println("pollFirst(): " + ns.pollFirst()); 
		System.out.println("pollLast(): " + ns.pollLast()); 
	} 
}
