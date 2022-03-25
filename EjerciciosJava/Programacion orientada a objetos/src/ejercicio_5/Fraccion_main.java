package ejercicio_5;

public class Fraccion_main {

	public static void main(String[] args) {
		Fraccion fr1= new Fraccion(1,4);
		Fraccion fr2= new Fraccion(1,2);
		Fraccion fr3= new Fraccion();
		Fraccion fr4 = new Fraccion(4,1);
		System.out.println("Fraccion Suma");
		Fraccion suma = fr1.sumar(fr2);
		Fraccion resta = fr1.restar(fr2);
		Fraccion multiplicacion = fr1.multiplicar(fr4);
		Fraccion division = fr1.dividir(fr2);
		
		System.out.println(fr1+ " + " + fr2 + " = "+ suma);
		System.out.println(fr1+ " - " + fr3 + " = "+ resta);
		System.out.println(fr1+ " * " + fr4 + " = "+ multiplicacion);
		System.out.println(fr1+ " / " + fr2 + " = "+ division);
	}

}
