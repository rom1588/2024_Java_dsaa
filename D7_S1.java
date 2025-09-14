public class D7_S1{
	public static void main(String[] args){
		SingleCell sc1 = new SingleCell("Jan.");
		SingleCell sc2 = new SingleCell("Feb.");
		SingleCell sc3 = new SingleCell("Mar.");
		sc1.setNext(sc2);
		sc2.setNext(sc3);
		
		print(sc1);
	}
	public static void print(SingleCell start){
		SingleCell sc = start;
		while(sc != null){
			System.out.println(sc.getData());
			sc = sc.getNext();
		}
	}
}