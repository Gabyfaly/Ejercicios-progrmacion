Algoritmo ejercicio9_8
	Dimension x[2,10]
	
	Definir i, x, mayor1,mayor2 Como Entero
	Escribir "dime 10 nºs"
	para i<-1 Hasta 10 Con Paso 1 Hacer
		leer x[1,i]
		
	FinPara
	mayor1=x[1,1]
	Escribir "dime otros 10 nº"
	Para  i<-1 hasta 10 con paso 1 Hacer
		leer x[2,i]
		
	FinPara
	mayor2=x[2,1]
	para i<-1 Hasta 10 Con Paso 1 Hacer
		si mayor1 > x[1,i] Entonces
			
		SiNo
			Escribir mayor1=x[1,i]
		FinSi
	FinPara
	Escribir "el mayor de los numeros de la primera fila es: ", mayor1
	para i<-1 Hasta 10 Con Paso 1 Hacer
	si mayor2 > x[2,i] Entonces
		
	SiNo
		Escribir mayor2=x[2,i]
	FinSi
	FinPara
	Escribir "el mayor de los numeros de la segunda fila es: ", mayor2
	si mayor1>mayor2 Entonces
		Escribir "el mayor de los dos máximos es : ", mayor1
	SiNo
		Escribir "el mayor de los dos máximos es : ", mayor2
	FinSi
FinAlgoritmo

	
	