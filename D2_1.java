public class D2_1{
	public static void main(String[] args){
		Paper paper = new Paper();
		paper.setText("データ構造とアルゴリズム");
		print(paper);
	}
	public static void print(Paper paper){
		System.out.println("text:" + paper.getText());
	}
}