public class QuickSort{
	public static void swap(int[] a, int x, int y){
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}
	public static int partition(int[] a, int left, int right){
		int i = left;
		int j = right - 1;
		int pivot = a[right];
		while(true){
			while(a[i] < pivot){
				i++;
			}
			while((i < j) && (pivot < a[j])){
				j--;
			}
			if(i >= j){
				break;
			}
			swap(a, i, j);
		}
		swap(a, i, right);
		return i;
	}
	public static void quickSort(int[] a, int left, int right){
		if(left >= right){
			return;
		}
		int i = partition(a, left, right);
		//print(a);
		quickSort(a, left, i - 1);
		quickSort(a, i + 1, right);
	}
	public static void sort(int[] a){
		quickSort(a, 0, a.length - 1);
	}
	public static void print(int[] a){
		for(int v : a){
			System.out.print(v + " ");
		}
		System.out.println();
	}
}