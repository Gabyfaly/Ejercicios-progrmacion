package relacion_4;

import java.util.Scanner;

public class ejercicio6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array= new int[15];
	
		for(int x=0; x<15;x++) {
			array[x]=sc.nextInt();
		}
		System.out.println();
		
		//Muestra el array original
		System.out.println("Array original");
		for(int i =0; i<15;i++) {
			System.out.printf("  |%3d", i);
		}
		System.out.println();
		for(int x=0; x<15;x++) {
		System.out.printf("  |%3d", array[x]);
		}
		System.out.println();
		for(int i =0;i <100;i++) {
			System.out.print("-");
		}
		System.out.println();
		
		 
		int primero= array[14];
		for(int i=14; i>0;i--) {
			array[i]=array[i-1];
		}
		array[0]=primero;
		System.out.println("Array desplazado");
		for(int i =0; i<15;i++) {
			System.out.printf("  |%3d", i);
		}
		System.out.println();
		for(int x=0; x<15;x++) {
		System.out.printf("  |%3d", array[x]);
		}
		System.out.println();
		for(int i =0;i <100;i++) {
			System.out.print("-");
		}

	}
}
