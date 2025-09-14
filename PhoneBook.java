import java.util.ArrayList;
import java.util.List;
public class PhoneBook{
	private List<Phone> list = new ArrayList<Phone>();
	public PhoneBook(){
	}
	public void add(Phone phone){
		this.list.add(phone);
	}
	public Phone get(int index){
		return this.list.get(index);
	}
	public Phone remove(int index){
		return this.list.remove(index);
	}
	public int size(){
		return this.list.size();
	}
}