import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class D12_3{
	public static void main(String[] args){
		Map<String, Post> map = new TreeMap<String, Post>();
		map.put("Tokyo", new Post(120, "Tokyo"));
		map.put("Chiba", new Post(270, "Chiba"));
		map.put("Saitama", new Post(350, "Saitama"));
		
		System.out.println("sort address");
		Set<String> keys = map.keySet();
		for(String key : keys){
			Post post = map.get(key);
			PostManager pm = new PostManager(post);
			System.out.println(pm.getString());
		}
	}
}