public class D7_D2{
	public static void main(String[] args){
		DoubleCell dc1 = new DoubleCell("ìå");
		DoubleCell dc2 = new DoubleCell("ìÏ");
		DoubleCell dc3 = new DoubleCell("êº");
		DoubleCell dc4 = new DoubleCell("ñk");
		dc1.setNext(dc2);
		dc2.setNext(dc3);
		dc3.setNext(dc4);
		dc4.setNext(dc1);
		
		dc4.setPrev(dc3);
		dc3.setPrev(dc2);
		dc2.setPrev(dc1);
		dc1.setPrev(dc4);
		
		printNext(dc1, 5);
		System.out.println("----");
		printPrev(dc1, 5);
	}
	public static void printNext(DoubleCell start, int size){
		DoubleCell dc = start;
		for(int i = 0; i < size; i++){
			System.out.println(i + " " + dc.getData());
			dc = dc.getNext();
		}
	}
	public static void printPrev(DoubleCell start, int size){
		DoubleCell dc = start;
		for(int i = 0; i < size; i++){
			System.out.println(i + " " + dc.getData());
			dc = dc.getPrev();
		}
	}
}