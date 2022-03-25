Algoritmo Ejercicio_8
	
	Definir num, cont Como entero
	cont <- 0
	
	Repetir
		
		Escribir "Introduce números enteros positivos e introduce uno negativo para acabar"
		
		Leer num
		
		si num >= 0 entonces
			
			cont <- cont + 1
			
		FinSi
		
	Mientras Que num>= 0
	
	Escribir "La cantidad de números introducidos es: ", cont
	
	
FinAlgoritmo