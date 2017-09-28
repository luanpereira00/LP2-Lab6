
public class MainQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora  calc = new Calculadora();
		
		calc.somar(1, 2);
		calc.somar(1, 5);
		calc.somar(1, 7);
		calc.somar(1, 0);
		
		System.out.println("Imprimindo log de operações");
		calc.imprimir();
	}

	
}
