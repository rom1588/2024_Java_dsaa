public class D11_K1{
	public static void main(String[] args){
		Node node1 = new Node("-");
		Node node2 = new Node("/");
		Node node3 = new Node("*");
		Node node4 = new Node("+");
		Node node5 = new Node("25");
		Node node6 = new Node("5");
		Node node7 = new Node("2");
		Node node8 = new Node("3");
		Node node9 = new Node("4");
		//
		node1.set(node2, node9);
		node2.set(node3, node8);
		node3.set(node4, node7);
		node4.set(node5, node6);
		
		FormulaUtils.print(node1);
	}
}