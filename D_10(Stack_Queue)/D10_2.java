public class D10_2{
	public static void main(String[] args){
		ArrayQueue queue = new ArrayQueue(10);
		queue.enqueue("Jan.");
		queue.enqueue("Feb.");
		queue.enqueue("Mar.");
		
		System.out.println("empty" + queue.empty());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println(queue.dequeue());
		System.out.println("empty" + queue.empty());
	}
}