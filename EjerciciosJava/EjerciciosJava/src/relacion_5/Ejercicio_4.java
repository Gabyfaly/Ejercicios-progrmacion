package relacion_5;

import java.util.Scanner;

public class Ejercicio_4 {
	public static double potencia(int base, int exponente) {
	    if (exponente == 0) {
	      return 1;
	    }

	    if (exponente < 0) {
	      return 1/potencia(base, -exponente);
	    }

	    int n = 1;

	    for (int i = 0; i < Math.abs(exponente); i++) {
	      n = n * base;
	    }

	    return n;
	  }
	
	 public static int digitos(int x) {
		    if (x < 0) {
		      x = -x;
		    }

		    if (x == 0) {
		      return 1;
		    } else {
		      int n = 0;
		      while (x > 0) {
		        x = x / 10; // se le quita un dígito a x
		        n++; // incrementa la cuenta de dígitos
		      }
		      return n;
		    }
		  }

	public static void main(String[] args) {
		System.out.println("Escribe una base y un exponente para calcular la potencia");
		
		Scanner sc= new Scanner(System.in);
		int base= sc.nextInt();
		int exponente = sc.nextInt();
		System.out.println("Tu número elevado al exponente da de resultado " + potencia(base, exponente));
		
		System.out.println("tu número tiene "+ digitos(sc.nextInt())+" digitos");
		sc.close();
	}

}
