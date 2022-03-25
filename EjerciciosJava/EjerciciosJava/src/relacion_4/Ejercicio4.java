package relacion_4;

import java.util.Random;

public class Ejercicio4 {

	public static void main(String[] args) {
		Random aleatorio= new Random();
		
		int[] numero= new int[200];

		
		for(int x=0; x<100;x++) {
		numero[x]= aleatorio.nextInt(9);

		
		
		
		System.out.println("El numero es:"+ numero[x]);
//		System.out.println(numero[x]^2);
//		System.out.println(numero[x]^3);
		}
		
		

	}

}
