package relacion_5;

import java.util.Scanner;

public class Ejercicio_2 {
	
	public static Boolean esPrimo(int n) {
		boolean primo = true;
		for(int i= 2; i<n/2; i++) {
			if(n%i==0) {
				primo= false;
			}else {
				primo= true;
				}
		}
		return primo;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para comprobar si es primo");
		int num= sc.nextInt();
		if(esPrimo(num)==true) {
			System.out.println("El número que has introducido es primo");
		}else {
			System.out.println("El número que has introducido no es primo");
		}
		

		sc.close();
	}

}
