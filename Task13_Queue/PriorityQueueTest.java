// Java program to demonstrate the Priority Queue

import java.util.*;

class PriorityQueueTest{

	public static void main(String args[])
	{
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();   //creating empty priority queue

		// Adding items to the pQueue using add()
		pq.add(10);
		pq.add(20);
		pq.add(30);

		// Printing the top element of PriorityQueue
		System.out.println("Top element is:"+pq.peek());

		// Printing the top element and removing it
		System.out.println("After removing the top element is:"+pq.poll());

		// Printing the top element again
		System.out.println("Again print the top element is:"+pq.peek());
	}
}
