//Functional Programming 

import java.util.Arrays;
import java.util.List;
public class Functional {
	public static void main(String[] args)
	{
		List<Integer> numbers
			= Arrays.asList(3,6,8,1,2,9,87,35,21,34,67);

		// External iterator, for Each loop
		for (Integer n : numbers) {
			System.out.print(n + " ");
		}
	}
}
