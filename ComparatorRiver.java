import java.util.Comparator;

public class ComparatorRiver implements Comparator<River>{
	@Override
	public int compare(River r1, River r2){
		return r1.getLength() - r2.getLength();
	}
}