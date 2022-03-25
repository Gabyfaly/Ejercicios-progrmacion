package ejercicio_10;

import java.util.Scanner;

public class Gestimal {
	public static int N=100;

	
	public static void main(String args[]) {
		int condicion = 0;
		String codigo="";
		String descripcion="";
		int precioCompra;
		int precioVenta;
		int stock;
		
		Scanner sc= new Scanner(System.in);

		
		do {
			System.out.println("Elija una opción dentro del menú");
			System.out.println("1. Listado");
			System.out.println("2. Alta");
			System.out.println("3. Baja");
			System.out.println("4. Modificación");
			System.out.println("5. Entrada de mercancía");
			System.out.println("6. Salida de mercancía");
			System.out.println("7. Salir");
			
			sc.next();
			
			Articulo art[] = new Articulo[N];
			switch (condicion) {
			
			case 1: 
				System.out.println("\nLISTADO");
				System.out.println("-----------");
				for(int i =0; i<=N;i++) {
					if(art[i].getCodigo().equals("LIBRE")) {
						System.out.println(art[i]);

					}
				}
				System.out.println("Si desea hacer otra consulta introduzca la opción");
				condicion=sc.nextInt();
			break;	
			case 2:
				System.out.println("Introduce el código del producto");
				codigo= sc.next();
				System.out.println("Introduce la descripción");
				descripcion= sc.next()	;
				System.out.println("Introduce el precio de compra y el precio de venta");
				precioCompra=sc.nextInt();
				precioVenta=sc.nextInt();
				System.out.println("Por último añade la cantidad en unidades de producto");
				stock= sc.nextInt();
				
				for(int i =0; i<=N;i++) {
					if(art[i].getCodigo().equals("LIBRE")) {
						art[i].setCodigo(codigo);
						art[i].setDescripcion(descripcion);
						art[i].setPrecio_compra(precioCompra);
						art[i].setPrecio_venta(precioVenta);
						art[i].setStock(stock);
					}
					if(art[i].getCodigo().equals(codigo)) {
						art[i].setStock(art[i].getStock()+1);
					}
				}
				System.out.println("Si desea hacer otra consulta introduzca la opción");
				condicion=sc.nextInt();
			break;
				case 3:
					System.out.println("Para dar de baja un artículo debes de conocer el código");
					System.out.println("..........................................................");
					System.out.println("Introduce el código del artículo a eliminar");
					codigo=sc.next();
					for(int i =0; i<=N;i++) {
						if(art[i].getCodigo().equals(codigo)) {
							art[i].setCodigo("LIBRE");
							art[i].setStock(art[i].getStock()-1);
						}
			          }System.out.println("articulo borrado."); 
			          System.out.println("Si desea hacer otra consulta introduzca la opción");
						condicion=sc.nextInt();
		        break;
		        
				case 4:
					System.out.println("Modificación de datos");
					
			
			default:
				throw new IllegalArgumentException("Unexpected value: " + condicion);
			}
			
		} while (condicion!=7);
	}
}
