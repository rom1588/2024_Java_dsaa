public class DoubleCell{
	private String data;
	private DoubleCell next = null;
	private DoubleCell prev = null;
	public DoubleCell(String data){
		this.data = data;
	}
	public String getData(){
		return this.data;
	}
	public void setNext(DoubleCell next){
		this.next = next;
	}
	public DoubleCell getNext(){
		return this.next;
	}
	public void setPrev(DoubleCell prev){
		this.prev = prev;
	}
	public DoubleCell getPrev(){
		return this.prev;
	}
}