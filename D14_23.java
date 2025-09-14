import java.util.*;

public class D14_23{
	public static void main(String[] args){
		List<River> list = new ArrayList<River>();
		list.add(new River("Ishikari", 268));
		list.add(new River("Tone", 322));
		list.add(new River("Kiso", 229));
		
		Comparator<River> c = new ComparatorRiver();
		Collections.sort(list, c);
		for(River v : list){
			System.out.println(v.getName() + " " + v.getLength());
		}
	}
}