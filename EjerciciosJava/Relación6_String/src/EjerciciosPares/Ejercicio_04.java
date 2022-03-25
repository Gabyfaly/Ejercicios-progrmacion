package EjerciciosPares;

/*Diseñar una aplicación que pida al usuario que introduzca una frase por teclado e
indique cuántos espacios en blanco tiene.
*/
import java.util.Scanner;
public class Ejercicio_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		System.out.println("Escribe una frase");
		String frase = sn.next();
		
		int caracteres = frase.length();
		int espacios = 0;
		
		for(int i = 0; i<caracteres; i++) {
			String frase1 = frase.charAt(i);
			if (i == ' ') {
				espacios++;
			}
			
		}
		
		System.out.println("Hay " + espacios + " espacios en blanco");
	}

}
