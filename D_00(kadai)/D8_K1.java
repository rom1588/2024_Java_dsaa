public class D8_K1{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("チョコレート", new SnackPlus(new Snack("チョコレート", 200)));
		hash.put("クッキー", new SnackPlus(new Snack("クッキー", 100)));
		hash.put("キャンディー", new SnackPlus(new Snack("キャンディー", 300)));
		hash.put("ナッツ", new SnackPlus(new Snack("ナッツ", 120)));
		hash.put("ポテトフライ", new SnackPlus(new Snack("ポテトフライ", 180)));
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "ポテトフライ";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}