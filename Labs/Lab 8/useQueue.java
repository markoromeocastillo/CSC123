public class useQueue {
	public static void main(String[] args) {
		Queue que = new Queue();

		que.enqueue(new Float(5));
		que.enqueue(new Float(11));
		System.out.println(que); // for DEBUG ONLY
		System.out.println(que.dequeue());
		System.out.println(que.dequeue());
	}
}