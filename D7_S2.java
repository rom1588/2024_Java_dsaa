public class D7_S2{
	public static void main(String[] args){
		SingleCell sc1 = new SingleCell("リゾートゲートウェイ");
		SingleCell sc2 = new SingleCell("東京ディズニーランド");
		SingleCell sc3 = new SingleCell("ベイサイド");
		SingleCell sc4 = new SingleCell("東京ディズニーシー");
		sc1.setNext(sc2);
		sc2.setNext(sc3);
		sc3.setNext(sc4);
		sc4.setNext(sc1);
		
		print(sc1, 10);
	}
	public static void print(SingleCell start, int size){
		SingleCell sc = start;
		for(int i = 0; i < size; i++){
			System.out.println(i + " " + sc.getData());
			sc = sc.getNext();
		}
	}
}