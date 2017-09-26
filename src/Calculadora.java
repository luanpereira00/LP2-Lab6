import java.util.Stack;

public class Calculadora implements Calculavel {
	private Stack<Integer> stack;
	
	Calculadora(){
		stack = new Stack<Integer>();
	}
	
	public int somar(int a, int b) {
		stack.add(a+b);
		return a + b;
	}
	public int subtrair(int a, int b) {
		stack.add(a-b);
		return a - b;
	}
	public int multiplicar(int a, int b) {
		stack.add(a*b);
		return a * b;
	}
	public int dividir(int a, int b) {
		if(b==0) return 0;
		else {
			stack.add(a/b);
			return a / b;
		}
	}
	
	public void imprimir() {
		while(!stack.isEmpty()) {
			System.out.println(stack.peek());
			stack.pop();
		}
	}
}
