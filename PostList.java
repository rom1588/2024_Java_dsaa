import java.util.List;
import java.util.ArrayList;

public class PostList{
	private List<Post> list = new ArrayList<Post>();
	public PostList(){
	}
	public void add(Post post){
		this.list.add(post);
	}
	public Post get(int index){
		return this.list.get(index);
	}
	public Post remove(int index){
		return this.list.remove(index);
	}
	public int size(){
		return this.list.size();
	}
}