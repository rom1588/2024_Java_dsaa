public class D7_D1{
	public static void main(String[] args){
		DoubleCell dc1 = new DoubleCell("アメリカンウォーターフロント");
		DoubleCell dc2 = new DoubleCell("ポートディスカバリー");
		dc1.setNext(dc2);
		dc2.setNext(dc1);
		
		printNext(dc1);
		System.out.println("----");
		printPrev(dc2);
	}
	public static void printNext(DoubleCell start){
		DoubleCell dc = start;
		while(dc != null){
			System.out.println(dc.getData());
			dc = dc.getNext();
		}
	}
	public static void printPrev(DoubleCell start){
		DoubleCell dc = start;
		while(dc != null){
			System.out.println(dc.getData());
			dc = dc.getPrev();
		}
	}
}