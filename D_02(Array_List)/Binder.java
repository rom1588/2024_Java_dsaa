import java.util.ArrayList;
import java.util.List;

public class Binder{
	private List<Paper> list = new ArrayList<Paper>();
	public Binder(){
	
	}
	public void add(Paper paper){
		this.list.add(paper);
	}
	public Paper get(int index){
		return this.list.get(index);
	}
	public Paper remove(int index){
		return this.list.remove(index);
	}
	public int size(){
		return this.list.size();
	}
}