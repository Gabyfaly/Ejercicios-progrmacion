Algoritmo ejercicio9_6
	dimension matriz[7]
	Definir maximo,matriz Como Entero
	Escribir "dime 7 números enteros"
	para i<-1 Hasta 7 con paso 1 Hacer
		leer matriz[i]	
	FinPara
	maximo= matriz[1]
	para i<-1 Hasta 7 con paso 1 Hacer
		si maximo < matriz[i] Entonces
			maximo=matriz[i]
		FinSi		
	FinPara
	
	Escribir "el maximo de los números es : " maximo
	
FinAlgoritmo
