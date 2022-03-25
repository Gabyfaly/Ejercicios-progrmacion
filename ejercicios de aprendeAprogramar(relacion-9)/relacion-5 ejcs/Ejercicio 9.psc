Algoritmo Ejercicio_9
	
	Definir num, suma, cont Como entero
	suma <- 0
	cont=0
	
	Repetir
		
		Escribir "Introduce números enteros positivos e introduce uno negativo para acabar"
		
		Leer num
		
		si num >= 0 entonces
			
			suma <- suma + num
			cont=cont+1
			
		FinSi
		
	Mientras Que num>= 0
	
	Escribir "La suma de todos los números introducidos es: ", suma
	Escribir "Cantidad de números introducidos es: ", cont
	Escribir " La media es: ", suma/cont
	
		
FinAlgoritmo
