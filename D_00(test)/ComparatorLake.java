import java.util.Comparator;

public class ComparatorLake implements Comparator<Lake>{
	@Override
	public int compare(Lake lake1, Lake lake2){
		return lake1.getArea() - lake2.getArea();
	}
}