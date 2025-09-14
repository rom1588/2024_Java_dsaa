import java.util.Arrays;
import java.util.List;

public class D10_K1{
	public static void main(String[] args){
		List<String> formula = Arrays.asList("25", "5", "+", "2", "*", "3", "/", "4", "-");
		
		Calculator calculator = new Calculator();
		System.out.print("Formula:");
		for(String token : formula){
			calculator.addToken(token);
			System.out.print(token + " ");
		}
		System.out.println();
		System.out.println("Answer:" + calculator.answer());
		System.out.println("Stack empty:" + calculator.empty());
	}
}