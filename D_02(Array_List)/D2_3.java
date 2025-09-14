public class D2_3{
	public static void main(String[] args){
		Binder binder = new Binder();
		Paper paper0 = new Paper();
		paper0.setText("データ構造");
		binder.add(paper0);
		Paper paper1 = new Paper();
		paper1.setText("アルゴリズム");
		binder.add(paper1);
		print(binder);
	}
	public static void print(Binder binder){
		for(int i = 0; i < binder.size(); i++){
			Paper paper = binder.get(i);
			System.out.print("page:" + i + " ");
			System.out.println("text:" + paper.getText());
		}
	}
}