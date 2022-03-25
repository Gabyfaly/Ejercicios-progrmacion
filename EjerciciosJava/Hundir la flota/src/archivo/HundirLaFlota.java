package archivo;

public class HundirLaFlota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][]tableroJugador;
		tableroJugador =new int[10][10];
		tableroJugador=inicializaMatriz(tableroJugador);
		
		int[][]tableroMaquina;
		tableroMaquina =new int[10][10];
		tableroMaquina=inicializaMatriz(tableroMaquina);
		
		int[][]tableroJugadasJugador;
		tableroJugadasJugador =new int[10][10];
		tableroJugadasJugador=inicializaMatriz(tableroJugadasJugador);
		
		int[][]tableroJugadasMaquina;
		tableroJugadasMaquina =new int[10][10];
		tableroJugadasMaquina=inicializaMatriz(tableroJugadasMaquina);
		
		tableroJugador=rellenaBarcos(tableroJugador);
		imprimeTableroJugador(tableroJugador);
	}
	public static void imprimeTableroJugador(int[][] tablero) {
		
		char[] indiceLetras= {'A','B','C','D','E','F','G','H','I','J'};
		int i;
		int j;
		
		for (j=0; j<indiceLetras.length+1; j++	) {

			System.out.print("["+j+"]");
			
		}	
		System.out.println("");
		for(i=0; i<indiceLetras.length; i++) {
			System.out.print("["+indiceLetras[i]+"] ");
			for (j=0; j<10; j++	) {
				if(tablero[i][j]==0) {
					System.out.print(".  ");
				}else {
				System.out.print(tablero[i][j]+"  ");
				}
			}	
			System.out.println("");
		}
		
	}
	
	public static int[][] inicializaMatriz(int[][] tablero){
		
		int i, j;
		
		for(i=0; i<10; i++) {
			for (j=0; j<10; j++	) {
				tablero[i][j]=0;
			}
		}
	
		return tablero;
	}
	
	public static int[][] rellenaBarcos(int[][] tablero){
		int indiceI,indiceJ;
		int barcos5=2;
		int barcos3=3;
		int barcos1=5;
		int posicion;
		boolean valido; 
		do {
			posicion=((int) (Math.random()*10)-8);
			valido=true;
			if (barcos5>0) { 
				if (posicion==0) {//Horizontal
					indiceJ=((int) (Math.random()*4));
					indiceI=((int) Math.random()*10);
				} else { //Vertical
					indiceI=((int) (Math.random()*4));
					indiceJ=((int) (Math.random()*10));
				}
				if (comprobarbarco(posicion,indiceI, indiceJ, tablero, 5)) {
					tablero=rellenabarco(posicion,indiceI, indiceJ, tablero, 5);
					barcos5--;
				}	
			}/* else if(barcos3>0) {
				if (posicion==0) {//Horizontal
					indiceJ=((int) ((Math.random()*10)-8));
					indiceI=((int) Math.random()*10);
				} else { //Vertical
					indiceI=((int) (Math.random()*10)-8);
					indiceJ=((int) Math.random()*10);
				}
				if (comprobarbarco(posicion,indiceI, indiceJ, tablero, 3)) {
					tablero=rellenabarco(posicion,indiceI, indiceJ, tablero, 3);
					barcos3--;
				}
			}else if(barcos1>0) {
				if (posicion==0) {//Horizontal
					indiceJ=((int) Math.random()*10);
					indiceI=((int) Math.random()*10);
				} else { //Vertical
					indiceI=((int) Math.random()*10);
					indiceJ=((int) Math.random()*10);
				}
				if (comprobarbarco(posicion,indiceI, indiceJ, tablero, 1)) {
					tablero=rellenabarco(posicion,indiceI, indiceJ, tablero, 1);
					barcos1--;
				}
			}*/
			
		} while(barcos5>0 );//|| barcos3>0 //|| barcos1>0
		return tablero;
	}
	
	public static boolean comprobarbarco(int posicion,int indiceI, int indiceJ, int[][] tablero, int dimensionBarco){
		boolean valido;
		int j;
		valido=true;
		if (posicion==0) {//Horizontal
			for (j=indiceJ; j<indiceJ+dimensionBarco;j++) {
				if(tablero[indiceI][j]>0) {
					valido=false;
				}
			}
		} else { //Vertical
			for (j=indiceI; j<indiceI+dimensionBarco;j++) {
				if(tablero[j][indiceJ]>0) {
					valido=false;
				}
			}
		}
		return valido;
	}
	
	public static int[][] rellenabarco(int posicion,int indiceI, int indiceJ, int[][] tablero, int dimensionBarco){
		int j;
		if (posicion==0) {//Horizontal
			for (j=indiceJ; j<indiceJ+dimensionBarco;j++) {
				tablero[indiceI][j]=dimensionBarco;
			}	
		} else { //Vertical
			for (j=indiceI; j<indiceI+dimensionBarco;j++) {
				tablero[j][indiceJ]=dimensionBarco;
			}
		}
		return tablero;
	}
}


