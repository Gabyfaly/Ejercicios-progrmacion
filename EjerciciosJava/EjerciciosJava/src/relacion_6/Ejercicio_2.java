package relacion_6;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("introduce una contraseña");
		String contraseña = sc.next();
		System.out.println("Este va a ser tu primer intento");
		String intento =sc.next();
		
		int numCaracteres = contraseña.length();
		char inicial = contraseña.charAt(0);
		char ultimo = contraseña.charAt(numCaracteres-1);
		boolean adivina= false;
		
		
		System.out.println("Las pista son las siguientes:");
		System.out.println("Letra inicial: "+ inicial+ " letra final: "+ ultimo+" el número de carácteres que contiene la contraseña"+ numCaracteres);
		
		
		// VERSION 1.0
		do {
			System.out.println("intenta adivinar la contraseña");
			intento=sc.next();
			if(contraseña.equals(intento)) {
				adivina=true;
			}else {
				System.out.println("no has acertado ni un carajo");
			}
			
		} while (adivina);
		System.out.println("\n Enhorabuena makina as asertado");
		
		System.out.println("introduce una nueva contraseña");
		String contraseña2 = sc.next();
		System.out.println("Este va a ser tu primer intento");
		String intento2 =sc.next();
		//VERSION 2.0
		do {
			System.out.println("intenta adivinar la contraseña");
			intento=sc.next();
			if(contraseña2.length()==intento2.length()) {
				adivina=true;
			}else {
				adivina=false;
			}
			
		}while(adivina);
		sc.close();
	}

}
