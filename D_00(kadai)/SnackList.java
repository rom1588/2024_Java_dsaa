import java.util.ArrayList;
import java.util.List;

public class SnackList{
	private List<Snack> list = new ArrayList<Snack>();
	public SnackList(){
	}
	public void add(Snack snack){
		this.list.add(snack);
	}
	public Snack get(int index){
		return this.list.get(index);
	}
	public Snack remove(int index){
		return this.list.remove(index);
	}
	public int size(){
		return this.list.size();
	}
}