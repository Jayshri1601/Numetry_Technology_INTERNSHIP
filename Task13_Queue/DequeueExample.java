import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueExample
 {
	public static void main(String[] args)
	{
		Deque<Integer> deque = new ArrayDeque<>();
		deque.addFirst(10);
		deque.addLast(20);
		int first = deque.removeFirst();
		int last = deque.removeLast();
		System.out.println("First: " + first + ", Last: " + last);
	}
}
