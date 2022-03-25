package ejercicio_3;

public class Contador_main {

	public static void main(String[] args) {
		
		Contador c= new Contador();
		c.setCont(100);
		c.incrementa();
		System.out.println("El valor actual del contador es de :"+c.toString());
		c.incrementa();
		c.incrementa();
		System.out.println("El valor actual del contador es de :"+c.toString());
		Contador c2= new Contador(10);
		System.out.println("El contador nº2 tiene un valor de :" + c2.toString());
		Contador c3= new Contador(c2);
		System.out.println("El valor del tercer contador que es una copia del segundo es :" + c3.toString());
	}

}
