public class HashUtils{
	public static int hash(int size, String key){
		int sum = 0;
		for(int i = 0; i < key.length(); i++){
			sum = sum + (int)key.charAt(i);
		}
		int value = sum % size;
		return value;
	}
}