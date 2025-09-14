public class D5_2{
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
			int index = 0;
			int value = a[0];
			for(int j = 0; j < size - 1 - i; j++){
				int v1 = a[j + 1];
				if((v1 - value) > 0){
					index = j + 1;
					value = a[j + 1];
				}
			}
			int temp = a[size - 1 - i];
			a[size - 1 - i] = a[index];
			a[index] = temp;
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