public class D11_2{
	public static void main(String[] args){
		Node node1 = new Node("*");
		Node node2 = new Node("+");
		Node node3 = new Node("a");
		Node node4 = new Node("b");
		Node node5 = new Node("-");
		Node node6 = new Node("c");
		Node node7 = new Node("d");
		//
		node1.setLeft(node2);
		node1.setRight(node5);
		node2.setLeft(node3);
		node2.setRight(node4);
		node5.setLeft(node6);
		node5.setRight(node7);
		
		TraverserUtils.printAll(node1);
	}
}