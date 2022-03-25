package relacion_5;

import java.util.Scanner;

public class Ejercicio_1 {
	
	private static boolean esCapicua(int num) {
        return num==invertirNumero(num);
    }
     
    private static int invertirNumero(int num){
        int cifra, inverso = 0;
        while(num>0){
            cifra = num%10;
            inverso = cifra + inverso * 10; 
            num /= 10;
        }
        return inverso;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un número para comprobar si es capicua");
		int num= sc.nextInt();
		System.out.println("El número que has introducido es "+esCapicua(num)+ " capicua");
		sc.close();
	}
	
}
