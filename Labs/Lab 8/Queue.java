import java.util.LinkedList;
import java.util.ListIterator;

public class Queue {
	public Queue() {
		theQueue = new LinkedList<Float>();
	}

	public void enqueue(Float value) {
		theQueue.addFirst(value);
	}

	public Float dequeue() {
		return theQueue.removeLast();
	}

	public String toString() {
		ListIterator<Float> iterator = theQueue.listIterator();
		String values = "";
		while (iterator.hasNext())
			values = values + iterator.next() + " ";
		return values;
	}

	private LinkedList<Float> theQueue;
}