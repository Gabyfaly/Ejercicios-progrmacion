package ejercicio_3;

import java.util.Scanner;

import ejercicio_1.Fecha;
import ejercicio_1.Vehiculo;

public class Ejercicio_3 {
	
	static Vehiculo[] vehiculos = new Vehiculo[50];
	static int contador;
	
	public static void main(String[] args) {
		int opcion;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("Selecciones alguna de las opciones disponibles:");
			System.out.println("1. nuevo vehiculo");
			System.out.println("2. listra vehiculo");
			System.out.println("3. buscar vehiculo");
			System.out.println("4. actualizar km");
			System.out.println("5. Salir");
			opcion=sc.nextInt();
			
			switch (opcion) {
			
			case 1: insertarVehiculo();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 2: listarVehiculo();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 3: System.out.println("dime la matricula a buscar");
			buscarVehiculo(sc.next());
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 4: System.out.println("dime la matricula a buscar");
			actualizaKm(sc.next());
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			} 
		}while (opcion!=5);
	}
	private static void muestraOpciones() {
		System.out.println("Selecciones alguna de las opciones disponibles:");
		System.out.println("1. nuevo vehiculo");
		System.out.println("2. listra vehiculo");
		System.out.println("3. buscar vehiculo");
		System.out.println("4. actualizar km");
		
	}
	public static Vehiculo buscarVehiculo(String matricula) {
		for(int i =0; i<= vehiculos.length;i++) {
			if(vehiculos[i].getMatricula()==matricula) {
				return vehiculos[i] ;
			}
		}
		return null;
		
	}
	public static int insertarVehiculo() {
		Scanner sc = new Scanner(System.in);
		Vehiculo v = new Vehiculo();
		int res = 0;
		Fecha fecha_matriculacion = new Fecha();
		System.out.println("Dime la marca del vehículo:");
		v.setMarca(sc.next());
		System.out.println("Dime la matrícula del vehículo:");
		v.setMatricula(sc.next());
		
		System.out.println("Dime el kilometraje del vehiculo");
		v.setNum_km(sc.nextInt());
		System.out.println("Dime la fecha de matriculacion dia/mes/año en ese orden");
		
		
		fecha_matriculacion.setDia(sc.nextInt());
		fecha_matriculacion.setMes(sc.nextInt());
		fecha_matriculacion.setAño(sc.nextInt());
		v.setFecha_matriculacion(fecha_matriculacion);
		System.out.println("Descripcion del vehiculo:");
		v.setDescripcion(sc.next());
		System.out.println("Indica el Precio:");
		v.setPrecio(sc.nextDouble());
		System.out.println("Nombre del propietario:");
		v.setNombre_propietario(sc.next());
		System.out.println("Dime el DNI del titular:");
		v.setDni(sc.next());
		
		for(int i =0; i<=vehiculos.length; i++) {
			if(vehiculos[i].getMatricula()==v.getMatricula()) {
				res=-2;
			}else if(contador==50) {
				res=-1;
			}else {
				vehiculos[i].setMarca(v.getMarca());
				vehiculos[i].setMatricula(v.getMatricula());
				vehiculos[i].setNum_km(v.getNum_km());
				vehiculos[i].setFecha_matriculacion(v.getFecha_matriculacion());
				vehiculos[i].setDescripcion(v.getDescripcion());
				vehiculos[i].setPrecio(v.getPrecio());
				vehiculos[i].setNombre_propietario(v.getNombre_propietario());
				vehiculos[i].setDni(v.getDni());
				res=0;
			}
		}
		
		return res;
		
	}
	public static void listarVehiculo() {
		System.out.println("Estos son los coches del concesionario");
		for(int i =0; i<=vehiculos.length;i++) {
			System.out.println(i+"datos del vehículo: "+ vehiculos[i].toString());
		}
	}
	
	public static boolean actualizaKm(String matricula) {
		boolean res= false;
		Scanner sc = new Scanner(System.in);
		int km;
		for(int x= 0; x<=vehiculos.length; x++) {
			if(vehiculos[x].getMatricula()==matricula) {
				System.out.println("Dime el numero a añadir:");
				km= sc.nextInt();
				vehiculos[x].setNum_km(vehiculos[x].getNum_km()+km);
				res=true;
			}
		}
		return res;
	}

}
