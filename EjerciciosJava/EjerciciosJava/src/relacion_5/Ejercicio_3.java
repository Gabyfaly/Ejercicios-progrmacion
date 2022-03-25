package relacion_5;

import java.util.Scanner;

public class Ejercicio_3 {
	
	public static Boolean esPrimo(long n) {
	    if (n < 2) {
	      return false;
	    } else {
	      for (long i = n-1; i >= 2; i--) {
	        if (n % i == 0) {
	          return false;
	        }
	      }
	    }
	    return true;
	  }
	
	  public static int siguientePrimo(int x) {
		    while (!esPrimo(++x)) {};

		    return x;
		  }
	

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("introduce un numero");
		int n= sc.nextInt();
		System.out.println("El siguiente primo es :"+ siguientePrimo(n));
		sc.close();
	}

}
 