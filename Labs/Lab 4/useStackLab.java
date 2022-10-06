// write a program that evaluates 3 * 4 + 5
// s.push(3); then s.push 4 etc. etc.
/*
 * Output: 17
 */



import java.util.Scanner;

public class useStackLab
{
	public static void main(String[] args)
	{
		Stack s = new Stack(); // instantiates a new object.
		s.push(3);
		s.push(4); 
		
		int product = s.pop() * s.pop(); // multiplies elemets in stack.
		
		s.push(product);
		s.push(5);
		
		int sum = s.pop() + s.pop();
		s.push(sum); 
		System.out.println(sum); // or SOP (s.pop)
	}
}