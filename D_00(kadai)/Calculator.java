import java.util.Stack;

public class Calculator{
	private Stack<Integer> stack = new Stack<Integer>();
	public Calculator(){
	}
	public void addToken(String token){
		if(token.equals("+")){
			int b = this.stack.pop();
			int a = this.stack.pop();
			this.stack.push(a + b);
		}else if(token.equals("-")){
			int b = this.stack.pop();
			int a = this.stack.pop();
			this.stack.push(a - b);
		}else if(token.equals("*")){
			int b = this.stack.pop();
			int a = this.stack.pop();
			this.stack.push(a * b);
		}else if(token.equals("/")){
			int b = this.stack.pop();
			int a = this.stack.pop();
			this.stack.push(a / b);
		}else{
			int value = Integer.parseInt(token);
			this.stack.push(value);
		}
	}
	public int answer(){
		return this.stack.pop();
	}
	public boolean empty(){
		return this.stack.empty();
	}
}