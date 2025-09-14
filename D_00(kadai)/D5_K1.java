public class D5_K1{
	public static void main(String[] args){
		String[] snacks = {"チョコレート", "クッキー", "キャンディー",
			"ポテトチップ", "ビスケット"};
		print(snacks);
		System.out.println("sort");
		sort(snacks);
		print(snacks);
	}
	public static void sort(String[] snacks){
		int size = snacks.length;
		for(int i = 0; i < size - 1; i++){
			for(int j = 0; j < size - 1 - i; j++){
				String v1 = snacks[j];
				String v2 = snacks[j + 1];
				if(v1.compareTo(v2) > 0){
					String temp = snacks[j];
					snacks[j] = snacks[j + 1];
					snacks[j + 1] = temp;
				}
			}
			//print(snacks);
		}
	}
	public static void print(String[] snacks){
		for(String v : snacks){
			System.out.print(v + " ");
		}
		System.out.println();
	}
}