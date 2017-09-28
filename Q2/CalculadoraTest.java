import static org.junit.Assert.*;


import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora(); 
		int result = calc.somar(1, 2);
		Assert.assertEquals(3, result);
	}
	
	@Test
	public void testSubtrair() {
		Calculadora calc = new Calculadora(); 
		int result = calc.subtrair(1, 2);
		Assert.assertEquals(-1, result);
	}
	
	@Test
	public void testMultiplicar() {
		Calculadora calc = new Calculadora(); 
		int result = calc.multiplicar(1, 2);
		Assert.assertEquals(2, result);
	}
	
	@Test
	public void testDividir() {
		Calculadora calc = new Calculadora(); 
		int result = calc.dividir(1, 2);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testDividirPorZero() {
		Calculadora calc = new Calculadora(); 
		int result = calc.dividir(1, 0);
		Assert.assertEquals(0, result);
	}
	
	@Test
	public void testImprimir() {
		Calculadora calc = new Calculadora(); 
		calc.imprimir();
	}
}
