Algoritmo Busca_del_tesoro
	
	Definir tesoroX,tesoroY, minaY, minaX ,tiradaFila, tiradaColumna Como entero  //Y SON LAS filas DE LA MATRIZ Y X SON LAS columnas DE LA MATRIZ
	Definir Final_Partida, RepetirTiradaX, RepetirTiradaY Como Logico
	Final_Partida= Falso
	RepetirTirada= Falso


	Dimension tablero[4,5]

	//declaración de la dimension y rellenarla con espacios en blanco
	Para f<-4 Hasta 1 con paso -1 Hacer
		
		para c<-1 Hasta 5 Hacer
			tablero[f,c]= " "
			
		FinPara
		Escribir ""
	FinPara
	minaY= 1+azar(4)
	minaX=1+azar(5)	
	//Código para que no sean iguales los valores de la mina y el tesoro.
	Repetir
		tesoroX=1+azar(5)
		tesoroY= 1+ azar(4)
	Hasta Que (minaY<>tesoroY) y (minaX<> tesoroX)
	
	//SubProceso  "INCIO" imprime por pantalla una pequeña pantalla de incio. y el SubProceso  tableroG imprime por pantalla el tablero.
	inicio
	Escribir "¡BUSCA DEL TESORO!"
	Escribir "----------------------------"
	tableroG(tablero)
	
	//Instrucciones Repetir, Para Cada una de las coordenadas a introducir.
	Repetir
		
		Repetir
			
			Escribir "Dime la coordenada X :"
			leer tiradaColumna
			si (tiradaColumna < 1) y (tiradaColumna > 5) Entonces
				Escribir "la coordenada X se encuentra fuera de rango, porfavor introducela de nuevo"				
			finsi
			
		Hasta Que  (tiradaColumna >=1) y (tiradaColumna <=5)
		
		Repetir
			
			Escribir "Dime la coordenada Y :"
			leer tiradaFila
			si (tiradaFila < 1) y (tiradaFila > 4) Entonces
				Escribir "la coordenada Y se encuentra fuera de rango, porfavor introducela de nuevo"				
			finsi
			
		Hasta Que  (tiradaFila >=1) y (tiradaFila <=4)
			
		
		si (tiradaFila = tesoroY) y (tiradaColumna = tesoroX) Entonces
			
			Escribir " ¡HAS ACERTADO! "
			Escribir "----------------------------"
			Escribir "la posición del tesoro esta en : (",tesoroY, "," , tesoroX, ")"
			Escribir "La mina estaba en la posición : (", minaY, ",", minaX , ")"
			tablero[tesoroY,tesoroX]= "$"
			tablero[minaY,minaX]="*"
			tableroG(tablero)
			Final_Partida=Verdadero
		FinSi
		
		
		si (tiradaFila = minaY) y (tiradaColumna = minaX) Entonces
				Escribir "lo siento, has perdido."
				tablero[tesoroY,tesoroX]= "$"
				tablero[minaY,minaX]="*"
				tableroG(tablero)
				Final_Partida=Verdadero
				
		FinSi
			
		Si no (Final_Partida) entonces
			tablero[tiradaFila,tiradaColumna]="X"
			tableroG(tablero)
		FinSi
		
		
	Hasta Que Final_Partida	
	final
FinAlgoritmo

SubProceso tableroG(matriz)
	Escribir "Y"
	Para x<-4 Hasta 1 con paso -1 Hacer
		Escribir Sin Saltar x,"|"
		para j<-1 Hasta 5 Hacer
			Escribir Sin Saltar ""
			Escribir Sin Saltar matriz[x,j], " "
		FinPara
		Escribir ""
	FinPara 
	Escribir "  ---------"
	Escribir "X 1 2 3 4 5"
FinSubProceso

SubProceso inicio
	Escribir "¡BIENVENIDO A LA BÚSQUEDA DEL TESORO!"
	Escribir "escribe 1 para iniciar el Juego"
	Leer decision
	Repetir
		si decision=1 Entonces
			Escribir "iniciando..."
		sino
			Escribir "Sólo puedes escribir 1 para iniciar el juego"
			Leer decision
		FinSi
		
	Hasta Que decision=1
	
FinSubProceso

SubProceso final
	Escribir "SI QUIERES VOLVER A JUGAR INSERTA UNA MONEDA($)"
	Leer moneda
	si moneda="$" Entonces
		Final_Partida= Falso
		Escribir "iniciando..."
	SiNo
		Escribir "para salir escribe salir."
		Leer moneda
		si moneda="salir"
			Final_Partida=Verdadero
		FinSi
	FinSi
FinSubProceso



