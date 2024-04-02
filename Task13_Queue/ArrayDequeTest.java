// Java program to Implement ArrayDeque in Java

import java.util.*;


public class ArrayDequeTest {
	public static void main(String[] args)
	{
		
		Deque<Integer> dq = new ArrayDeque<Integer>(10);

		dq.add(10);
		dq.add(20);        //using add() method to insert the elements
		dq.add(30);
		dq.add(40);
		dq.add(50);

		// Iterating using for each loop
		for (Integer element : dq)
		{
			System.out.println("Element : " + element);
		}

		
		// clear() method
		System.out.println("Using clear() ");
		dq.clear();

		// addFirst() method
		// Inserting at the start
		dq.addFirst(2);
		dq.addFirst(5);

		// addLast() method
		// Inserting at end
		dq.addLast(30);
		dq.addLast(50);

		// Display message
		System.out.println("Above elements are removed now");

		System.out.println("Elements of deque using Iterator :");

		for (Iterator itr = dq.iterator();itr.hasNext();)	
		{
			System.out.println(itr.next());
		}

		// descendingIterator()
		// To reverse the deque order
		System.out.println("Elements of deque in reverse order :");

		for (Iterator dItr = dq.descendingIterator();dItr.hasNext();)
		{
			System.out.println(dItr.next());
		}

		System.out.println("\nHead Element using element(): "+ dq.element()); //get the first element
		
		// getFirst() method : to get Head element
		System.out.println("Head Element using getFirst(): "+ dq.getFirst());

		// getLast() method : to get last element
		System.out.println("Last Element using getLast(): "+ dq.getLast());

		// toArray() method :
		Object[] arr = dq.toArray();
		System.out.println("\nArray Size : " + arr.length);

		System.out.print("Array elements : ");

		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(" " + arr[i]);
		}
		
		// peek() method : to get head
		System.out.println("\nHead element : "+ dq.peek());

	
		// poll() method : to get head
		System.out.println("Head element poll : "+ dq.poll());

		
		// push() method
		dq.push(67);
		dq.push(78);
		dq.push(100);

		// remove() method : to get head
		System.out.println("Head element remove : "+ dq.remove());

		System.out.println("The final array is: " + dq);
	}
}
