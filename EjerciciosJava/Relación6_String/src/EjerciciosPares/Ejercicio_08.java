package EjerciciosPares;

/*Realizar un programa que lea una frase del teclado y nos indique si es palíndroma, es
decir, que la frase sea igual leyendo de izquierda a derecha, que de derecha a
izquierda, sin tener en cuenta los espacios. Un ejemplo de frase palíndroma es: Dábale
arroz a la zorra el abad.
Las vocales con tilde hacen que un algoritmo tome una frase palíndroma como si no lo
fuese. Por esto, supondremos que el usuario introduce la frase sin tildes.
*/
import java.util.Scanner;
public class Ejercicio_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sn = new Scanner(System.in);
		
		String sinEspacios ="";		//frase sin espacios
		
		System.out.println("Escribe una frase");
		String frase = sn.nextLine();
		int longfrase = frase.length();
		
		for(int i = 0; i<longfrase; i++) {
			if(frase.charAt(i) != ' ') {
				sinEspacios += frase.charAt(i);
				//System.out.println(sinEspacios);
				
			}
		}
		System.out.println("La frase sin espacios es: " + sinEspacios);
		
		
		//PA DAR LA VUELTA A LA FRASE 
		int longSinEspacios = sinEspacios.length();

		for(int i = longSinEspacios-1; i >= 0; i--) {
			char fraseReves = (sinEspacios.charAt(i));
			
			System.out.print(fraseReves);
		}
	}

}
