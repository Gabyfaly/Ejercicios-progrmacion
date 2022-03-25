Algoritmo sin_titulo
	definir a,b,c Como entero

	Escribir "dime un caracter"
	Leer a
	
	Escribir "dime un caracter"
	Leer b
	
	Escribir "dime un caracter"
	Leer c
	si (a > b) y (a > c) Entonces
		si(b > c) Entonces
			Escribir a," > ", b, " > ", c		
		SiNo
			Escribir a," > ", c, " > ", b	
		FinSi
	FinSi
	si (b > a) y (b > c) Entonces
		si(a > c) Entonces
			Escribir b," > ", a, " > ", c		
		SiNo
			Escribir b," > ", c, " > ", a	
		FinSi
	FinSi
	si (c > a) y (c > b) Entonces
		si(a > b) Entonces
			Escribir c," > ", a, " > ", b		
		SiNo
			Escribir c," > ", b, " > ", a	
		FinSi
	FinSi

	
FinAlgoritmo
