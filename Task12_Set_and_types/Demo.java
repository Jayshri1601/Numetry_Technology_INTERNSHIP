// Java program Illustrating Set Interface 
 
import java.util.*; 

public class Demo { 
	
	// Main driver method 
	public static void main(String[] args) 
	{ 
		
		Set<String> set = new HashSet<String>(); 

		set.add("Grapes"); 
		set.add("Mango"); 
		set.add("Pineapple"); 
		set.add("Apple"); 
		set.add("Strawberry"); 

		System.out.println(set); 
	} 
}
