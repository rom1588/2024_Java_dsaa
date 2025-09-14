import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D6_2{
	public static void main(String[] args){
		List<Post> list = new ArrayList<Post>();
		list.add(new Post(120, "Tokyo"));
		list.add(new Post(270, "Chiba"));
		list.add(new Post(350, "Saitama"));
		list.add(new Post(400, "Yamanashi"));
		list.add(new Post(600, "Kyoto"));
		list.add(new Post(700, "Okinawa"));
		
		print(list);
		System.out.println("sort");
		Comparator<Post> c = new ComparatorPostAddress();
		Collections.sort(list, c);
		print(list);
		System.out.println("search");
		String address = "Tokyo";
		Post key = new Post(0, address);
		int index = Collections.binarySearch(list, key, c);
		Post post = list.get(index);
		print(post);
	}
	public static void print(Post post){
		System.out.print(post.getCode() + " ");
		System.out.println(post.getAddress());
	}
	public static void print(List<Post> list){
		for(Post post : list){
			print(post);
		}
	}
}