public class D8_K1{
	public static void main(String[] args){
		HashChain hash = new HashChain(100);
		hash.put("�`���R���[�g", new SnackPlus(new Snack("�`���R���[�g", 200)));
		hash.put("�N�b�L�[", new SnackPlus(new Snack("�N�b�L�[", 100)));
		hash.put("�L�����f�B�[", new SnackPlus(new Snack("�L�����f�B�[", 300)));
		hash.put("�i�b�c", new SnackPlus(new Snack("�i�b�c", 120)));
		hash.put("�|�e�g�t���C", new SnackPlus(new Snack("�|�e�g�t���C", 180)));
		
		System.out.println("table");
		hash.printTable();
		
		System.out.println("search");
		String key = "�|�e�g�t���C";
		Object data = hash.get(key);
		System.out.println(key + " " + data.toString());
	}
}