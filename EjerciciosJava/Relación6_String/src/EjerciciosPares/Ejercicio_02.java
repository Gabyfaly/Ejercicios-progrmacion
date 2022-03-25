package EjerciciosPares;

/*Diseñar el juego acierta la contraseña. La mecánica del juego es la siguiente: el
primer jugador introduce la contraseña; a continuación, el segundo jugador debe
teclear palabras hasta que la acierte. Realizar dos versiones; en la primera las
únicas pistas que se proporcionan son el número de caracteres y cuáles son el primer y
el último carácter de la contraseña. En la segunda versión se facilita el juego indicando
si la palabra introducida es mayor o menor, alfabéticamente, que la contraseña.
*/
import java.util.Scanner;
public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		String adivina;
		boolean contraAdivina = false;
		
		System.out.println("Introduce una contraseña");
		String contrasena = sn.next();
		
		//VERSIÓN 1
		do {
			System.out.println("Adivina la contraseña");
			adivina = sn.next();
			contraAdivina = contrasena.equals(adivina);
			if(contraAdivina == false) {
				System.out.println("¡Has fallado!");
				System.out.println("La contraseña tiene " + contrasena.length() + " caracteres");
				System.out.println("El primer caracter de la contraseña es " + contrasena.charAt(0));
				System.out.println("El primer caracter de la contraseña es " + contrasena.charAt(contrasena.length()-1));
			}
			
		}while (contraAdivina == false);
		
		System.out.println("¡Has adivinado la contraseña!");
		
		
		sn.close();
		
		
		
		
		
	}

}
