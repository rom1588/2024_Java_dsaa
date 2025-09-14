public class D9_2{
	public static void main(String[] args){
		HashOpenAddress hash = new HashOpenAddress(100);
		hash.put("‚Ô‚Ç‚¤", "400");
		hash.put("‚¢‚¿‚²", "500");
		hash.put("‚è‚ñ‚²", "300");
		hash.put("‚Ý‚©‚ñ", "200");
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key1 = "‚¢‚¿‚²";
		Object data1 = hash.get(key1);
		System.out.println(key1 + " " + data1.toString());
		
		System.out.println("search");
		String key2 = "‚¢‚¿‚²";
		Object data2 = hash.get(key2);
		System.out.println(key2 + " " + data2.toString());
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key3 = "‚Ý‚©‚ñ";
		Object data3 = hash.get(key3);
		System.out.println(key3 + " " + data3.toString());
	}
}