public class Drink{
	private String name;
	private int price;
	public Drink(String name, int price){
		this.name = name;
		this.price = price;
	}
	public String getName(){
		return this.name;
	}
	public void setName(){
		this.name = name;
	}
	public int getPrice(){
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
}