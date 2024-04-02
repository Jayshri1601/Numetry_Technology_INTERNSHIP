// Sorted Set
 
import java.util.*; 

class SortedSet1{ 

	public static void main(String[] args) 
	{ 
		SortedSet<String> ts = new TreeSet<String>(); 

		ts.add("Cat"); 
		ts.add("Dog"); 
		ts.add("Lion"); 


		ts.add("Cat");  //Duplicate Element

		System.out.println(ts); 

		ts.remove("Lion"); 
		System.out.println("Set after removing "+ "Lion:" + ts); 

		// Iterating over Tree set items 
		System.out.println("Iterating over set:"); 
		Iterator<String> i = ts.iterator(); 
		while (i.hasNext()) 
		{
			System.out.println(i.next()); 
		}
	} 
} 
