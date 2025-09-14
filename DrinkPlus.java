public class DrinkPlus{
	private Drink drink;
	public DrinkPlus(Drink drink){
		this.drink = drink;
	}
	@Override
	public String toString(){
		return this.drink.getName() + " " + this.drink.getPrice();
	}
}