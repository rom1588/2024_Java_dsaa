public class D10_1{
	public static void main(String[] args){
		ArrayStack stack = new ArrayStack(10);
		stack.push("Jan.");
		stack.push("Feb.");
		stack.push("Mar.");
		
		System.out.println("empty" + stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println("empty" + stack.empty());
	}
}