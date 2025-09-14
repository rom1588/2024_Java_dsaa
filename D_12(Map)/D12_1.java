import java.util.ArrayList;
import java.util.List;

public class D12_1{
	public static void main(String[] args){
		List<Post> list = new ArrayList<Post>();
		list.add(new Post(120, "Tokyo"));
		list.add(new Post(270, "Chiba"));
		list.add(new Post(350, "Saitama"));
		for(Post post : list){
			System.out.print(post.toString() + " ");
			PostManager pm = new PostManager(post);
			System.out.println(pm.getString());
		}
	}
}