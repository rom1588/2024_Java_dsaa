public class D4_K1{
	public static void main(String[] args){
		SnackList snackList = new SnackList();
		
		snackList.add(new Snack("キャンディー", 300));//0
		snackList.add(new Snack("クッキー", 100));//1
		snackList.add(new Snack("チョコレート", 200));//2
		snackList.add(new Snack("ビスケット", 150));//3
		snackList.add(new Snack("ポテトチップ", 250));//4
		
		
		String key = "ポテトチップ";
		Snack snack = search(snackList, key);
		print(snack);
	}
	public static Snack search(SnackList snackList, String key){
		int low = 0;
		int high = snackList.size() -1;
		while (low <= high){
			int middle = (low + high) / 2;
			Snack snack = snackList.get(middle);
			String name= snack.getName();
			if(key.compareTo(name) == 0){
				return snack;
			}else if(key.compareTo(name) < 0){
				high = middle - 1;
			}else{ 
				low = middle + 1;
			}
		}
		return null;
	}
	public static void print(Snack snack){
		System.out.print(snack.getName() + " " + snack.getPrice());
	}
}