public class SnackPlus{
	private Snack snack;
	public SnackPlus(Snack snack){
		this.snack = snack;
	}
	@Override
	public String toString(){
		return this.snack.getName() + " " + this.snack.getPrice();
	}
}