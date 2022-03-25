
package ejercicio_2;

import java.util.Scanner;

public class CuentaMain {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String nombre= sc.nextLine();
		String num_cuenta = sc.nextLine();
		double interes = sc.nextDouble();
		double saldo = sc.nextDouble();
		
		Cuenta cuenta1= new Cuenta();
		Cuenta cuenta2 = new Cuenta("Juan Fernández Rubio", "1234567890",1.75, 300);
		
		
		cuenta1.setNombre(nombre);
		cuenta1.setNum_cuenta(num_cuenta);
		cuenta1.setSaldo(saldo);
		cuenta1.setTipo_interes(interes);
		Cuenta cuenta3 = new Cuenta(cuenta1);
		System.out.println(cuenta1.toString());
		cuenta1.ingreso(100);
		System.out.println("El saldo de la cuenta1 es : " + cuenta1.getSaldo());
		System.out.println(cuenta2.toString());
		System.out.println(cuenta3.toString());
		
		cuenta3.transferencia(cuenta2, 10.0);
		System.out.println("El saldo de la cuenta3 es de: "+ cuenta3.getSaldo());
		sc.close();
	}
	
}
