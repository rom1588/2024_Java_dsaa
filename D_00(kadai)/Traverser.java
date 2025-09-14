import java.util.ArrayList;
import java.util.List;

public class Traverser{
	private Order order;
	public Traverser(Order order){
		this.order = order;
	}
	public List<Object> getList(Node node){
		List<Object> list = new ArrayList<Object>();
		if(node == null){
			return list;
		}
		if(this.order == Order.PREORDER){
			list.add(node.getData());
		}
		
		Node left = node.getLeft();
		list.addAll(this.getList(left));
		
		if(this.order == Order.INORDER){
			list.add(node.getData());
		}
		
		Node right = node.getRight();
		list.addAll(this.getList(right));
		
		if(this.order == Order.POSTORDER){
			list.add(node.getData());
		}
		
		return list;
	}
	public void print(Node node){
		List<Object> list = this.getList(node);
		for(Object object : list){
			System.out.print(object.toString() + " " );
		}
		System.out.println();
	}
}