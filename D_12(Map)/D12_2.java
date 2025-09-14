import java.util.HashMap;
import java.util.Map;

public class D12_2{
	public static void main(String[] args){
		Map<String, Post> map = new HashMap<String, Post>();
		map.put("Tokyo", new Post(120, "Tokyo"));
		map.put("Chiba", new Post(270, "Chiba"));
		map.put("Saitama", new Post(350, "Saitama"));
		
		System.out.println("search");
		String key = "Tokyo";
		Post post = map.get(key);
		PostManager pm = new PostManager(post);
		System.out.println(pm.getString());
	}
}