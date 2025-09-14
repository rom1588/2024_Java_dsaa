public class D8_3{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("Tokyo", new Post(120, "Tokyo"));
		hash.put("Chiba", new Post(270, "Chiba"));
		hash.put("Kyoto", new Post(600 ,"Kyoto"));
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "Kyoto";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}