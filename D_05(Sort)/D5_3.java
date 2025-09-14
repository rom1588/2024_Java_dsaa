public class D5_3{
	public static void main(String[] args){
		int[] a = {270, 600, 700, 350, 120, 400};
		print(a);
		System.out.println("sort");
		sort(a);
		print(a);
	}
	public static void sort(int[] a){
		int size = a.length;
		for(int i = 0; i < size - 1; i++){
			for(int j = 0; j < i + 1; j++){
				int v1 = a[i - j];
				int v2 = a[i - j + 1];
				if((v1 - v2) > 0){
					int temp = a[i - j];
					a[i - j] = a[i - j + 1];
					a[i - j + 1] = temp;
				}
			}
			//print(a);
		}
	}
	public static void print(int[] a){
		for(int v : a){
			System.out.print(v + " ");
		}
		System.out.println();
	}
}