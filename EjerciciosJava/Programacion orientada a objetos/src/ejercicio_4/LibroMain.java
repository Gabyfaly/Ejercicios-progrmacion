package ejercicio_4;

import java.util.Scanner;

public class LibroMain {

	public static void main(String[] args) {
		
		Libro libro1= new Libro("El quijote", "Cervantes", 1, 0);
		Libro libro2 = new Libro();
		Scanner sc = new Scanner(System.in);
		System.out.println("indicanos el nombre del libro");
		libro2.setTitulo(sc.next());
		System.out.println("Dime el nombre del autor");
		libro2.setAutor(sc.next());
		System.out.println("Numero de ejemplares disponibles");
		libro2.setNum_ejemplares(sc.nextInt());
		System.out.println("Por último dime el número de ejemplares prestados");
		libro2.setEjemplares_prestados(sc.nextInt());
		
		System.out.println("El primer libro es:"+ libro1.toString());
		libro1.prestamo();
		System.out.println(libro1.toString());
		libro1.devolucion();
		System.out.println(libro1.toString());
		libro1.prestamo();
		if(libro1.prestamo()) {
			System.out.println("El prestamo se ha realizado con exito");
		}else {
			System.out.println("No se ha podido realizar el prestamo");
		}
		System.out.println(libro1.toString());
		
		System.out.println("");
		System.out.println("El libro2 es :" + libro2.toString());
		sc.close();
		}
		
		

}
