package ejercicio_2;

import java.util.Scanner;

import ejercicio_1.Fecha;
import ejercicio_1.Vehiculo;

public class Ejercicio2 { 

	public static void main(String[] args) {
		/*1.Nuevo vehiculo
		 *2.vermatricula
		 *3.ver numKm
		 *4.actualizar km
		 *5.ver antigüedad
		 *6. mostrar propietrio
		 *7.mostrar descripcion
		 *8. mostrar precio
		 *9. salir 
		 * */
		int opcion=0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Selecciones alguna de las opciones disponibles:");
			System.out.println("1. nuevo vehiculo");
			System.out.println("2. vermatricula");
			System.out.println("3. ver numero de Km");
			System.out.println("4. actualizar km");
			System.out.println("5. ver antigüedad");
			System.out.println("6. mostrar propietario");
			System.out.println("7. mostrar descripcion");
			System.out.println("8. mostrar precio");
			System.out.println("9. salir ");
			opcion=sc.nextInt();
			
			switch (opcion) {
			
			case 1: nuevoVehiculo();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 2: verMatricula();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 3: verNum_km();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 4: actualizarKm();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 5: verAntiguedad();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 6: mostrarPropietario();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 7: muestraDescripcion();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
			
			case 8: muestraPrecio();
			System.out.println("Desea elegir otra opción: ");
			opcion=sc.nextInt();
			muestraOpciones();
			break;
				
			}
			
		} while (opcion!=9);
		
		
		
	}
	public static void muestraOpciones() {
		System.out.println("Selecciones alguna de las opciones disponibles:");
		System.out.println("1. nuevo vehiculo");
		System.out.println("2. vermatricula");
		System.out.println("3. ver numero de Km");
		System.out.println("4. actualizar km");
		System.out.println("5. ver antigüedad");
		System.out.println("6. mostrar propietario");
		System.out.println("7. mostrar descripcion");
		System.out.println("8. mostrar precio");
		System.out.println("9. salir ");
	}
	//Nuevo vehículo
	public static Vehiculo nuevoVehiculo() {
	Scanner sc = new Scanner(System.in);
	String marca = null;
	String matricula = null;
	 int num_km = 0;
	 Fecha fechaActual= new Fecha(18, 03, 2022);
	 Fecha fecha_matriculacion = new Fecha();
	 String descripcion = null;
	 double precio = 0;
	 String nombre_propietario = null;
	 String dni = null;
	 Vehiculo v = new Vehiculo(marca, matricula, num_km, fecha_matriculacion, descripcion, precio, nombre_propietario, dni);			
	System.out.println("Dime la marca del vehículo:");
	v.setMarca(sc.next());
	System.out.println("Dime la matrícula del vehículo:");
	matricula=sc.next();
	
	if(matriculaCorrecta(matricula)==true) {
		v.setMatricula(matricula);
	}
	System.out.println("Dime el kilometraje del vehiculo");
	num_km=sc.nextInt();
	System.out.println("Dime la fecha de matriculacion dia/mes/año en ese orden");
	
	fecha_matriculacion.setDia(sc.nextInt());
	fecha_matriculacion.setMes(sc.nextInt());
	fecha_matriculacion.setAño(sc.nextInt());
	if(fecha_matriculacion.esMayorQue(fechaActual) || fecha_matriculacion==fechaActual) {
		v.setFecha_matriculacion(fecha_matriculacion);
	}
	System.out.println("Descripcion del vehiculo:");
	v.setDescripcion(sc.next());
	System.out.println("Indica el Precio:");
	v.setPrecio(sc.nextDouble());
	System.out.println("Nombre del propietario:");
	v.setNombre_propietario(sc.next());
	System.out.println("Dime el DNI del titular:");
	dni=sc.next();
	if(DniCorrecto(dni)==true) {
	v.setDni(dni);
	}
	
	
	return v;
	
	}
	private static boolean DniCorrecto(String dni) {
		char[] cadenaDNI = dni.toCharArray();
		boolean res= false;
		if(cadenaDNI.length==9) {
			for(int i=0; i<= cadenaDNI.length-1;i++) {
				for(int x =0;x<=9;x++) {
					if(cadenaDNI[cadenaDNI.length]!=x && cadenaDNI[i]==x) {
						res = true;
					}else {
						res=false;
					}
				}
			}
		}
		
		
		return res;
	}
	private static boolean matriculaCorrecta(String matricula) {
		char[] letraMatricula = matricula.toCharArray();
		boolean res=false;
		if(letraMatricula.length==8) {
			for(int i =0; i<=letraMatricula.length-3;i++) {
				for(int x =0; x<=9;x++) {
					if(letraMatricula[i]==x && (letraMatricula[5]!=x || letraMatricula[6]!=x || letraMatricula[7]!=x)) {
						res=true;
					}
				}
			}
		}
		return res;
	}

	
	// ver matricula
	public static void verMatricula() {
	System.out.println("La matricula del vehículo es: "+ nuevoVehiculo().getMatricula());
	}
	public static void verNum_km() {
		System.out.println("El número de kilometros del vehículo es : "+nuevoVehiculo().getNum_km());
	}
	public static void actualizarKm() {
		Scanner sc= new Scanner(System.in);
		int nuevosKM;
		System.out.println("Cuántos kilometros hay que añadirle: ");
		nuevosKM=sc.nextInt();
		nuevosKM+=nuevoVehiculo().getNum_km();
		nuevoVehiculo().setNum_km(nuevosKM);
	}
	public static void verAntiguedad() {
		System.out.println("El vehículo tiene : "+ nuevoVehiculo().getAnios()+ " años");
	}
	public static void mostrarPropietario() {
		System.out.println("El propietario del vehículo es : " + nuevoVehiculo().getNombre_propietario());
	}
	public static void muestraDescripcion() {
		System.out.println("Descripción : "+ nuevoVehiculo().getDescripcion());
	}
	public static void muestraPrecio() {
		System.out.println("El precio del vehículo es de : "+ nuevoVehiculo().getPrecio());
	}
}