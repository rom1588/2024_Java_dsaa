public class D11_3{
	public static void main(String[] args){
		Node node1 = new Node("*");
		Node node2 = new Node("+");
		Node node3 = new Node("2");
		Node node4 = new Node("3");
		Node node5 = new Node("-");
		Node node6 = new Node("4");
		Node node7 = new Node("5");
		//
		node1.set(node2, node5);
		node2.set(node3, node4);
		node5.set(node6, node7);
		
		FormulaUtils.print(node1);
	}
}