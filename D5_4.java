public class D5_4{
	public static void main(String[] args){
		String[] a = {"Tokyo", "Chiba", "Saitama", "Yamanashi", "Kyoto", "Okinawa"};
		print(a);
		System.out.println("sort");
		sort(a);
		print(a);
	}
	public static void sort(String[] a){
		int size = a.length;
		for(int i = 0; i < size - 1; i++){
			for(int j = 0; j < size - 1 - i; j++){
				String v1 = a[j];
				String v2 = a[j + 1];
				if(v1.compareTo(v2) > 0){
					String temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
			//print(a);
		}
	}
	public static void print(String[] a){
		for(String v : a){
			System.out.print(v + " ");
		}
		System.out.println();
	}
}