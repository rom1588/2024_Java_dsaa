public class D8_2{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("‚Ô‚Ç‚¤","400");
		hash.put("‚¢‚¿‚²","500");
		hash.put("‚è‚ñ‚²","300");
		hash.put("‚Ý‚©‚ñ","200");
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		//String key = "‚¢‚¿‚²";
		String key = "‚Ý‚©‚ñ";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}