package relacion_4;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		char[] simbolo= new char[10];
		simbolo[0]='a';
		simbolo[1]='x';
		simbolo[4]='$';
		simbolo[6]='%';
		simbolo[7]='+';
		simbolo[8]='Q';
	for(int x=0; x<10; x++) {
		
		System.out.println(simbolo[x]);
	}
	//Al no haber valores inicializados se quedan como un espacio en blanco
		
	}

}
