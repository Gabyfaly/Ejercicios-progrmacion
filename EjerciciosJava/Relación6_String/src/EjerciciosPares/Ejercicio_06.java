package EjerciciosPares;

/*Diseñar una función a la que se le pase una cadena de caracteres
y la devuelva invertida.
Un ejemplo, la cadena “Hola mundo” quedaría “odnum aloH”
 */
import java.util.Scanner;
public class Ejercicio_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner (System.in);

		System.out.println("Escribe una frase");
		String frase = sn.nextLine();

		int longfrase = frase.length();

		for(int i = longfrase-1; i >= 0; i--) {
			System.out.print(frase.charAt(i));
		}






	}

}