//Operations on the Set 
 
import java.util.*; 

class SetOperation 
{ 
	
	public static void main(String args[]) 
	{ 
	
		Set<Integer> a = new HashSet<Integer>(); 
		 
		a.addAll(Arrays.asList(new Integer[] { 34,24,87,12,44,68})); 
		
		Set<Integer> b = new HashSet<Integer>(); 
		
	    b.addAll(Arrays.asList(new Integer[] { 23,76,24,12 })); 

		
		Set<Integer> union = new HashSet<Integer>(a); 
		union.addAll(b); 
		System.out.print("Union of the two Set"); 
		System.out.println(union); 

		Set<Integer> intersection = new HashSet<Integer>(a); 
		intersection.retainAll(b);
		
		System.out.print("Intersection of the two Set"); 
		System.out.println(intersection); 

		Set<Integer> difference = new HashSet<Integer>(a); 
		difference.removeAll(b); 
		System.out.print("Difference of the two Set"); 
		System.out.println(difference); 
	} 
}
