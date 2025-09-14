public class D2_K1{
	public static void main(String[] args){
		SnackList snackList = new SnackList();
		Snack snack0 = new Snack("チョコレート", 200);
		snackList.add(snack0);
		Snack snack1 = new Snack("クッキー", 100);
		snackList.add(snack1);
		Snack snack2 = new Snack("キャンディー", 300);
		snackList.add(snack2);
		print(snackList);
	}
	public static void print(SnackList snackList){
		for(int i = 0; i < snackList.size(); i++){
			Snack snack = snackList.get(i);
			System.out.println(snack.getName() + " " + snack.getPrice());
		}
	}
}