import java.util.*;

public class GenericQueue<T>  {

	public GenericQueue() {
		theQueue = new LinkedList<T>();
	}

	public void enqueue(T value) {
		theQueue.addFirst(value);
	}

	public T dequeue() {
		try {
			return theQueue.removeLast();
		}
		catch (Exception e)
		{
			System.out.println("Tried to take out from Queue but it's empty!");		
		return null;
		}
	}

	public String toString() {
		ListIterator<T> iterator = theQueue.listIterator();
		String values = "";
		while (iterator.hasNext())
			values = values + iterator.next() + " ";
		return values;
	}

	private LinkedList<T> theQueue;

}
