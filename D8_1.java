public class D8_1{
	public static void main(String[] args){
		String[] keys = {"‚Ô‚Ç‚¤", "‚¢‚¿‚²", "‚è‚ñ‚²", "‚Ý‚©‚ñ"};
		for(String key : keys){
			int value = HashUtils.hash(100, key);
			System.out.println(key + ":" + value);
		}
	}
}