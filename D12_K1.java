import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class D12_K1{
	public static void main(String[] args){
		Map<String, Snack> map = new TreeMap<String, Snack>();
		map.put("チョコレート", new Snack("チョコレート", 200));
		map.put("クッキー", new Snack("クッキー", 100));
		map.put("キャンディー", new Snack("キャンディー", 300));
		map.put("ナッツ", new Snack("ナッツ", 120));
		map.put("ポテトフライ", new Snack("ポテトフライ", 180));	
		
		System.out.println("sort address");
		Set<String> keys = map.keySet();
		for(String key : keys){
			Snack snack = map.get(key);
			SnackManager sm = new SnackManager(snack);
			System.out.println(sm.getString());
		}
	}
}