public class D14_1{
	public static void main(String[] args){
		String[] a = {"Himeji", "Okayama", "Fukuyama"};
		sort(a);
		print(a);
	}
	public static void sort(String[] a){
		int size = a.length;
		for(int i = 0; i < size - 1; i++){
			for(int j = 0; j < i + 1; j++){
				String v1 = a[i - j];
				String v2 = a[i - j + 1];
				if((v1.compareTo(v2)) > 0){
					String temp = a[i - j];
					a[i - j] = a[i - j + 1];
					a[i - j + 1] = temp;
				}
			}
		}
	}
	public static void print(String[] a){
		for(String v : a){
			System.out.println(v);
		}
	}
}