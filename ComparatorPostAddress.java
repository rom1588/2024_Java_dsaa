import java.util.Comparator;

public class ComparatorPostAddress implements Comparator<Post>{
	@Override
	public int compare(Post post1, Post post2){
		return post1.getAddress().compareTo(post2.getAddress());
	}
}