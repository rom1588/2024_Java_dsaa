import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class D14_2{
	public static void main(String[] args){
		Map<String, Lake> map = new TreeMap<String, Lake>();
		map.put("Inawashiro", new Lake("Inawashiro", 103));
		map.put("Biwa", new Lake("Biwa", 669));
		map.put("Kasumigaura", new Lake("Kasumigaura", 168));
		
		Set<String> keys = map.keySet();
		for(String key : keys){
			Lake v = map.get(key);
			System.out.println(v.getName() + " " + v.getArea());
		}
	}
}