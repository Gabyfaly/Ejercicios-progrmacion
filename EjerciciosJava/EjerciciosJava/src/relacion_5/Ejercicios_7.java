package relacion_5;

import java.util.Scanner;

public class Ejercicios_7 {
	
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
	public static Long voltea(Long x) {
	    if (x < 0) {
	      return voltea(-x);
	    }

	    Long volteado = 0L;

	    while(x > 0) {
	      volteado = (volteado * 10) + (x % 10);
	      x = x / 10;
	    }

	    return volteado;
	  }
	 
	
	public static long digitoN(Long x, int n) {
	    x = voltea(x);

	    while (n-- > 0) {
	      x = x / 10;
	    }

	    return x % 10;
	  }
	
	public static void main(String[] args) {
		
		
		System.out.println(digitoN(262489231L,0));
	}

}
