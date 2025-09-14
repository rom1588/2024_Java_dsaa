public class D9_K1{
	public static void main(String[] args){
		HashOpenAddress hash = new HashOpenAddress(100);
		hash.put("Orange", new DrinkPlus(new Drink("Orange", 320)));
		hash.put("Apple", new DrinkPlus(new Drink("Apple", 330)));
		hash.put("Peach", new DrinkPlus(new Drink("Peach", 340)));
		hash.put("Grape", new DrinkPlus(new Drink("Grape", 350)));
		hash.put("Kiwi", new DrinkPlus(new Drink("Kiwi", 360)));
		
		
		System.out.println("table");
		hash.printTable();
		
		
		System.out.println("search");
		String key = "Kiwi";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}