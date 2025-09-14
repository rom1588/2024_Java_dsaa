import java.util.*;

public class D14_3{
	public static void main(String[] args){
		List<Lake> list = new ArrayList<Lake>();
		list.add(new Lake("Saroma", 152));
		list.add(new Lake("Tazawa", 25));
		list.add(new Lake("Hamana", 65));
		
		Comparator<Lake> c = new ComparatorLake();
		Collections.sort(list, c);
		for(Lake v : list){
			System.out.println(v.getName() + " " + v.getArea());
		}
	}
}