public class SingleCell{
	private String data;
	private SingleCell next = null;
	public SingleCell(String data){
		this.data = data;
	}
	public String getData(){
		return this.data;
	}
	public void setNext(SingleCell next){
		this.next = next;
	}
	public SingleCell getNext(){
		return this.next;
	}
}