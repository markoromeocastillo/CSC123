/*
 * Output
C:\Users\Marko\Documents\notepadpp>java lList
Amanda 30
Carl 20
Debbie 42

Carl 20
Amanda 30
Debbie 42
 */

import java.util.LinkedList;
import java.util.ListIterator;

public class lList {
	private static class Node {
		public Node(String theName, int theAge) {
			name = new String(theName);
			age = theAge;
		}

		public String toString() {
			return name + " " + age;
		}

		public boolean equals(Object obj) {
			if (!getClass().equals(obj.getClass()))
				return false;

			Node b = (Node) obj;

			if (name.equals(b.name) && age == b.age)
				return true;
			else
				return false;

		}

		String name;
		int age;
	}

	public static void main(String[] args) {
		LinkedList<Node> people = new LinkedList<Node>();

		people.addLast(new Node("Amanda", 30));
		people.addLast(new Node("Carl", 20));
		people.addLast(new Node("Debbie", 42));

		ListIterator<Node> iterator = people.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		people.removeFirstOccurrence(new Node("Carl", 20));
		people.addFirst(new Node("Carl", 20));

		System.out.println();

		iterator = people.listIterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}
}