public class D11_1{
	public static void main(String[] args){
		Node node1 = new Node("a");
		Node node2 = new Node("b");
		Node node3 = new Node("c");
		Node node4 = new Node("d");
		//
		node1.setLeft(node2);
		node1.setRight(node4);
		node2.setLeft(node3);
		
		Traverser traverser1 = new Traverser(Order.PREORDER);
		traverser1.print(node1);
		Traverser traverser2 = new Traverser(Order.INORDER);
		traverser2.print(node1);
		Traverser traverser3 = new Traverser(Order.POSTORDER);
		traverser3.print(node1);
	}
}