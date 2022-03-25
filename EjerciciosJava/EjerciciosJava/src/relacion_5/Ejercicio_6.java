package relacion_5;

import java.util.Scanner;

public class Ejercicio_6 {
	
	
	  public static int voltea(int x) {
		    if (x < 0) {
		      return voltea(-x);
		    }

		    int volteado = 0;

		    while(x > 0) {
		      volteado = (volteado * 10) + (x % 10);
		      x = x / 10;
		    }

		    return volteado;
		  }
		 
	 

	public static void main(String[] args) {
		
		System.out.println("dime un uckin numero");
		Scanner sc= new Scanner(System.in);
		int polla= sc.nextInt();
		System.out.println("volteame esta "+ voltea(polla));
		
	}

}
