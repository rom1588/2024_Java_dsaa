public class D1_K1 {
	public static void main(String[] args){
		Snack snack1 = new Snack("チョコレート", 200);
		Snack snack2 = new Snack("クッキー", 100);
		Snack snack3 = new Snack("キャンディー", 300);
		System.out.println(snack1.getName() + " " + snack1.getPrice());
		System.out.println(snack2.getName() + " " + snack2.getPrice());
		System.out.println(snack3.getName() + " " + snack3.getPrice());
	}
}