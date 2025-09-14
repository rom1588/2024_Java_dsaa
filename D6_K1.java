import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class D6_K1{
	public static void main(String[] args){
		List<Snack> list = new ArrayList<Snack>();
		list.add(new Snack("キャンディー", 300));
		list.add(new Snack("クッキー", 100));
		list.add(new Snack("チョコレート", 200));
		list.add(new Snack("ビスケット", 150));
		list.add(new Snack("ポテトチップ", 250));
		list.add(new Snack("せんべい", 80));
		list.add(new Snack("バームクーヘン", 160));
		
		
		print(list);
		System.out.println("sort");
		Comparator<Snack> c = new ComparatorSnackName();
		Collections.sort(list, c);
		print(list);
		System.out.println("search");
		String name = "バームクーヘン";
		Snack key = new Snack(name, 0);
		int index = Collections.binarySearch(list, key, c);
		Snack snack = list.get(index);
		print(snack);
	}
	public static void print(Snack snack){
		System.out.print(snack.getName() + " ");
		System.out.println(snack.getPrice());
	}
	public static void print(List<Snack> list){
		for(Snack snack : list){
			print(snack);
		}
	}
}