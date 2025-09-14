public class D1_1 {
	public static void main(String[] args){
		int[] snacks = {200, 100, 300};
		int hand = snacks[0];
		int size = snacks.length;
		for(int i = 0; i < size - 1; i++) {
			int price = snacks[i + 1];
			if(hand < price) {
				hand = price;
			}
		}
		System.out.println(hand);
	}
}