package relacion_6;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("introduce una contrase�a");
		String contrase�a = sc.next();
		System.out.println("Este va a ser tu primer intento");
		String intento =sc.next();
		
		int numCaracteres = contrase�a.length();
		char inicial = contrase�a.charAt(0);
		char ultimo = contrase�a.charAt(numCaracteres-1);
		boolean adivina= false;
		
		
		System.out.println("Las pista son las siguientes:");
		System.out.println("Letra inicial: "+ inicial+ " letra final: "+ ultimo+" el n�mero de car�cteres que contiene la contrase�a"+ numCaracteres);
		
		
		// VERSION 1.0
		do {
			System.out.println("intenta adivinar la contrase�a");
			intento=sc.next();
			if(contrase�a.equals(intento)) {
				adivina=true;
			}else {
				System.out.println("no has acertado ni un carajo");
			}
			
		} while (adivina);
		System.out.println("\n Enhorabuena makina as asertado");
		
		System.out.println("introduce una nueva contrase�a");
		String contrase�a2 = sc.next();
		System.out.println("Este va a ser tu primer intento");
		String intento2 =sc.next();
		//VERSION 2.0
		do {
			System.out.println("intenta adivinar la contrase�a");
			intento=sc.next();
			if(contrase�a2.length()==intento2.length()) {
				adivina=true;
			}else {
				adivina=false;
			}
			
		}while(adivina);
		sc.close();
	}

}
