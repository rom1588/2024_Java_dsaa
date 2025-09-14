public class D9_3{
	public static void main(String[] args){
		HashOpenAddress hash = new HashOpenAddress(100);
		hash.put("Tokyo", new PostPlus(new Post(120, "Tokyo")));
		hash.put("Chiba", new PostPlus(new Post(270, "Chiba")));
		hash.put("Kyoto", new PostPlus(new Post(600, "Kyoto")));
		
		
		System.out.println("table");
		hash.printTable();
		
		
		System.out.println("search");
		String key = "Kyoto";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}