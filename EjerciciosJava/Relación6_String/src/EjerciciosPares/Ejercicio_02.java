package EjerciciosPares;

/*Dise�ar el juego acierta la contrase�a. La mec�nica del juego es la siguiente: el
primer jugador introduce la contrase�a; a continuaci�n, el segundo jugador debe
teclear palabras hasta que la acierte. Realizar dos versiones; en la primera las
�nicas pistas que se proporcionan son el n�mero de caracteres y cu�les son el primer y
el �ltimo car�cter de la contrase�a. En la segunda versi�n se facilita el juego indicando
si la palabra introducida es mayor o menor, alfab�ticamente, que la contrase�a.
*/
import java.util.Scanner;
public class Ejercicio_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sn = new Scanner(System.in);
		
		String adivina;
		boolean contraAdivina = false;
		
		System.out.println("Introduce una contrase�a");
		String contrasena = sn.next();
		
		//VERSI�N 1
		do {
			System.out.println("Adivina la contrase�a");
			adivina = sn.next();
			contraAdivina = contrasena.equals(adivina);
			if(contraAdivina == false) {
				System.out.println("�Has fallado!");
				System.out.println("La contrase�a tiene " + contrasena.length() + " caracteres");
				System.out.println("El primer caracter de la contrase�a es " + contrasena.charAt(0));
				System.out.println("El primer caracter de la contrase�a es " + contrasena.charAt(contrasena.length()-1));
			}
			
		}while (contraAdivina == false);
		
		System.out.println("�Has adivinado la contrase�a!");
		
		
		sn.close();
		
		
		
		
		
	}

}
