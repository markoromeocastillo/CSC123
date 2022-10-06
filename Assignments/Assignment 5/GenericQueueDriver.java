import java.awt.Point;

public class GenericQueueDriver {// add throws exception
	public static void main(String[] args) {
		
		//Integer Part
		System.out.println("INTEGER DEMONSTRATION: ");
		GenericQueue<Integer> que = new GenericQueue<Integer>();
		que.enqueue((5));
		que.enqueue((11));
		
		System.out.println("Integer Queue: " + que);
		System.out.println(que.dequeue());
		System.out.println(que.dequeue());
		System.out.println(que.dequeue());

		
		//String Part
		System.out.println("\nSTRING DEMONSTRATION: ");
		GenericQueue<String> que1 = new GenericQueue<String>();
		que1.enqueue(("First"));
		que1.enqueue(("Second"));
		
		System.out.println("String Queue: " + que1);
		System.out.println(que1.dequeue());
		System.out.println(que1.dequeue());
		System.out.println(que1.dequeue());
		
		
		//Point Part
		System.out.println("\nPOINT DEMONSTRATION: ");
		GenericQueue<Point> que2 = new GenericQueue<Point>();
		Point k = new Point(1,2);
		Point j = new Point(3,4);
		que2.enqueue(k);
		que2.enqueue(j);
		System.out.println("Point Queue: " + que2);
		System.out.println(que2.dequeue());
		System.out.println(que2.dequeue());
		System.out.println(que2.dequeue());
		
		


	}
}