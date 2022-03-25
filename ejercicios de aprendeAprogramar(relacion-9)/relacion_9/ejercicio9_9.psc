Algoritmo ejericio9_9
	Dimension datos[2,2]
	Definir datos, determinante Como real
	//a11*a22-a21*a12
	Escribir "dime la posición(1,1) de la matrix 2x2"
	Leer datos[1,1]
	Escribir "dime la posición(1,2) de la matrix 2x2"
	Leer datos[1,2]
	Escribir "dime la posición(2,1) de la matrix 2x2"
	Leer datos[2,1]
	Escribir "dime la posición(2,2) de la matrix 2x2"
	Leer datos[2,2]
	determinante<-(datos[1,1]*datos[2,2])-(datos[1,2]*datos[2,1])
	Escribir "el determinante de esta matriz 2x2 = a11*a22-a21*a12= " determinante
	
FinAlgoritmo
