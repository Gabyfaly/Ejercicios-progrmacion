package tres_en_rayas;

import java.util.Random;
import java.util.Scanner;

public class TresEnRayas {  
	public static int x1;
	public static int x2;
	public static int x3;
	public int o1,o2,o3=0;
	
	public static void imprimeTablero(int[] tablero) {
		int[] funcion= new int[9];
		
		
			for(int j=0;j<3;j++) {
				System.out.print("-");
				if (funcion[j]==0) {
					System.out.println("-");
				}else if(funcion[j]==1) {
					System.out.println("X");
				}else {
					System.out.println("O");
				}
			}
			System.out.println("");
			for(int j=3;j<6;j++) {
				System.out.print("-");
				if (funcion[j]==0) {
					System.out.println("-");
				}else if(funcion[j]==1) {
					System.out.println("X");
				}else {
					System.out.println("O");
				}
			}			System.out.println("");

			for(int j=6;j<9;j++) {
				if (funcion[j]==0) {
					System.out.println("-");
				}else if(funcion[j]==1) {
					System.out.println("X");
				}else {
					System.out.println("O");
				}
				System.out.print("-");
			}			System.out.println("");
			
		}
	
	
	public static int mueveFichaAleatoria(String[] tablero) {
		Random random= new Random();
		int numaleatorio= random.nextInt(9);
		for(int x=0; x<tablero.length;x++) {
			if(tablero.toString().charAt(numaleatorio)=='-') {
				 tablero[numaleatorio]="X";
			}else {
				return -1;
				
			}
			
		}
		
		return numaleatorio;
		
	}
	public static int conviertePosicionMovimiento(String movimiento) {
		int resultado = 0;
		switch(movimiento) {
			case "arriba izquierda":
				resultado=0;
				break;
				
			case "arriba centro":
				resultado=1;
				break;
				
			case "arriba derecha":
				resultado=2;
				break;
				
			case "centro izquierda":
				resultado=3;
				break;
				
			case "centro centro":
				resultado=4;
				break;
				
			case "centro derecha":
				resultado=5;
				break;
				
			case "abajo izquierda":
				resultado=6;
				break;
				
			case "abajo centro":
				resultado=7;
				break;
				
			default:
				resultado=8;
				break;
		}
		
		
		return resultado;
	}
	
	public static boolean usuarioMueveFicha(String movimiento, String[] tablero) {
		boolean posible=false;
		for(int i=0; i< tablero.length;i++) {
			int posicion= conviertePosicionMovimiento(movimiento);
			if(!tablero[posicion].contains("X") || !tablero[posicion].contains("O")) {
				posible=true;
			}
		}
		return posible;
	}
	
	public static void limpiaTablero(int repetir) {
		int[] funcion= new int[9];
		
		if(repetir==1) {
			imprimeTablero(funcion);
		}
		
	}
	
	public static boolean ganaPrograma(int ficha1,int ficha2,int ficha3) {
		boolean res= false;
		if((ficha1==0 && ficha2==1 && ficha3==2)||(ficha1==0 && ficha2==2 && ficha3==1)||(ficha1==2 && ficha2==1 && ficha3==0)) {
			res=true;
		}else if(ficha1==3 && ficha2==4 && ficha3==5) {
			res=true;
		}else if(ficha1==6 && ficha2==7 && ficha3==8) {
			res=true;
		}else if(ficha1==0 && ficha2==3 && ficha3==6) {
			res=true;
		}else if(ficha1==1 && ficha2==4 && ficha3==7) {
			res=true;
		}else if(ficha1==2 && ficha2==5 && ficha3==8) {
			res=true;
		} else if(ficha1==0 && ficha2==4 && ficha3==8) {
			res=true;
		}else if(ficha1==2 && ficha2==4 && ficha3==6) {
			res=true;
		}
		return res;
	}
	
	public static boolean ganaUsuario(int ficha1,int ficha2,int ficha3) {
		boolean res= false;
		if((ficha1==0 && ficha2==1 && ficha3==2)||(ficha1==0 && ficha2==2 && ficha3==1)||(ficha1==2 && ficha2==1 && ficha3==0)) {
			res=true;
		}else if(ficha1==3 && ficha2==4 && ficha3==5) {
			res=true;
		}else if(ficha1==6 && ficha2==7 && ficha3==8) {
			res=true;
		}else if(ficha1==0 && ficha2==3 && ficha3==6) {
			res=true;
		}else if(ficha1==1 && ficha2==4 && ficha3==7) {
			res=true;
		}else if(ficha1==2 && ficha2==5 && ficha3==8) {
			res=true;
		} else if(ficha1==0 && ficha2==4 && ficha3==8) {
			res=true;
		}else if(ficha1==2 && ficha2==4 && ficha3==6) {
			res=true;
		}
		return res;
	}
	
	public static void main(String[] args) {
		
//		variables
		int[] tablero= new int[9];
		Scanner sc = new Scanner(System.in);
		String movimiento= sc.nextLine();
		System.out.println("Bienvenido al Tres en Rayas");
		
		imprimeTablero(tablero);
		
		System.out.println("Es tu turno, dime que movimiento deseas realizar RECUERDA, SOLO PUEDES ESCRIBIR DOS PALABRAS");
		System.out.println("PRIMERA PALABRA: arriba, centro, abajo   SEGUNDA PALABRA: izquierda, centro, derecha");
		
		do {
			
		}while(!ganaUsuario(x1, x2, x3)|| !ganaPrograma(x1,x2,x3));
		
		
	// NO ME HA DADO TIEMPO A SEGUIR ESCRIBIENDO
	}
	

}
