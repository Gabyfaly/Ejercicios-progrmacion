package cal;

import static org.junit.Assert.*;

import org.junit.Test;

public class calculadoraTest2 {

	@Test
	public void testSuma() {
		calculadora calc = new calculadora(20,10);
		int resul = calc.suma();
		assertEquals(resul,30);
	}

	@Test
	public void testResta() {
		calculadora calc = new calculadora(20,10);
		int resul = calc.resta();
		assertEquals(resul,10);
	}
	

	@Test
	public void testMultiplicacion() {
		calculadora calc = new calculadora(20,10);
		int resul = calc.multiplicacion();
		assertEquals(resul,200);
	}

	@Test
	public void testDivision() {
		calculadora calc = new calculadora(20,10);
		int resul = calc.division();
		assertEquals(resul,2);
	}


	@Test
	public void testResta2() {
		calculadora calc = new calculadora(20,10);
		boolean resul = calc.resta2();
		assertTrue(resul);
	}

	@Test
	public void testDivide2() {
		fail("Not yet implemented");
	}

}
