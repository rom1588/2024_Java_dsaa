public class Node{
	private Object data;
	private Node left = null;
	private Node right = null;
	public Node(Object data){
		this.data = data;
	}
	public void setData(Object data){
		this.data = data;
	}
	public Object getData(){
		return this.data;
	}
	public void setLeft(Node left){
		this.left = left;
	}
	public Node getLeft(){
		return this.left;
	}
	public void setRight(Node right){
		this.right = right;
	}
	public Node getRight(){
		return this.right;
	}
	public void set(Node left, Node right){
		this.left = left;
		this.right = right;
	}
}