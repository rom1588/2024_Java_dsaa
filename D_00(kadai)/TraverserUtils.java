public class TraverserUtils{
	public static void print(Order order, Node node){
		Traverser traverser = new Traverser(order);
		traverser.print(node);
	}
	public static void printAll(Node node){
		print(Order.PREORDER, node);
		print(Order.INORDER, node);
		print(Order.POSTORDER, node);
	}
}