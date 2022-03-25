package ejercicio_6;

import java.util.Scanner;

public class Fecha_main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int dia= sc.nextInt();
		int mes= sc.nextInt();
		int anyo= sc.nextInt();
		System.out.println("Introduce fecha");
		System.out.println("dia:" + dia);
		System.out.println("mes:" + mes );
		System.out.println("año:" + anyo );
		Fecha f= new Fecha(dia,mes,anyo);
		System.out.println("lA FECHA INTRODUCIDA ES :" + f);
		
		for(int i=0; i<11; i++) {
			System.out.println(f.diaSiguiente());
		}
		sc.close();
	}

}
