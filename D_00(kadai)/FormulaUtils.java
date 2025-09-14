import java.util.ArrayList;
import java.util.List;

public class FormulaUtils{
	public static void print(List<String> formula){
		Calculator calculator = new Calculator();
		System.out.print("Formula");
		for(String token : formula){
			calculator.addToken(token);
			System.out.print(token + " ");
		}
		System.out.println();
		System.out.println("Answer:" + calculator.answer());
		System.out.println("Stack empty:" + calculator.empty());
	}
	public static void print(Node node){
		Traverser traverser = new Traverser(Order.POSTORDER);
		List<Object> list = traverser.getList(node);
		
		List<String> formula = new ArrayList<String>();
		for(Object object : list){
			formula.add(object.toString());
		}
		print(formula);
	}
}