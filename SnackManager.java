public class SnackManager{
	private Snack snack;
	public SnackManager(Snack snack){
		this.snack = snack;
	}
	public String getString(){
		return this.snack.getName() + " " + this.snack.getPrice();
	}
}