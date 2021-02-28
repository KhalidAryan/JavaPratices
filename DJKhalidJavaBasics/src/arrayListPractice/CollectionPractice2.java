package arrayListPractice;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class CollectionPractice2 {

	public static void main(String[] args) {
		
		Stack<Integer> s1 = new Stack<Integer>();
		
		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		s1.add(10);
		s1.add(5);
		s1.add(1);
		
		
		System.out.println(s1);
		System.out.println(s1.pop());
		System.out.println(s1);
		System.out.println(s1.peek());
		System.out.println(s1);
		
		
		queue.add(12);
		queue.add(14);
		queue.add(156);
		queue.add(1);
		
		
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		
		System.out.println(queue);
		System.out.println(queue.peek());

	}

}
