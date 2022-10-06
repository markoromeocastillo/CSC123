/*
	Extra Credit One:
	-Read/Store integer into linked list
	-Check if integer is in the list
	If integer is not in the list:
		- store in order, use addLast()
	If integer is found:
		- display error message
	-Delete
		-if not found, print message, continue.
	-If -9999 is entered
		- Stop and display contents
		
	Sample Output:

Tried to add '10' but it's already in the list...
Tried to add '15' but it's already in the list...
Tried to remove '1' but it's not in the list...

Original List: 
5 10 15 20 

List after '10' is removed: 
5 15 20 

-9999 entered, printing out details
.
.
.
Final List: 
5 15 20 
*/

import java.util.LinkedList;
import java.util.ListIterator;

public class SimpleLinkedList {
	public static void main(String[] args) {
		SimpleLinkedList test = new SimpleLinkedList();
		test.addL(5);
		test.addL(10);
		test.addL(10);
		test.addL(15);
		test.addL(15);
		test.addL(20);
		test.removeL(1);

		System.out.println("\nOriginal List: ");
		System.out.println(test);

		System.out.println("\nList after '10' is removed: ");
		test.removeL(10);

		System.out.println(test);
		test.addL(-9999);
	}

	public SimpleLinkedList() {
		numList = new LinkedList<Integer>();
	}

	public void addL(Integer value) {
		boolean doesExist = numList.contains(value);

		if (value == endNum) {
			System.out.println("\n-9999 entered, printing out details\n.\n.\n." + "\nFinal List: " + "\n" + toString());
		}

		if (doesExist)
			System.out.println("Tried to add " + "'" + value + "'" + " but it's already in the list...");
		else
			numList.addLast(value);
	}

	public void removeL(Integer value) {
		boolean doesExist = numList.contains(value);

		if (!doesExist) {
			numList.removeFirstOccurrence(value);
			System.out.println("Tried to remove " + "'" + value + "'" + " but it's not in the list...");
		}

		else
			numList.removeFirstOccurrence(value);
	}

	public String toString() {
		ListIterator<Integer> iterator = numList.listIterator();
		String values = "";
		while (iterator.hasNext())
			values = values + iterator.next() + " ";
		return values;
	}

	private LinkedList<Integer> numList;
	private final int endNum = -9999;
}