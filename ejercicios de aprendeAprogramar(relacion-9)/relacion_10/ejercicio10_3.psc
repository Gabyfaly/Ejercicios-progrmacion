Algoritmo ejercicio10_3
	Definir num Como Real
	escribir "dime un numero, para hacer su raiz cúbica, para pararlo introduce un 0"
	Repetir
		Leer num
		si num > 0 Entonces
			Escribir "la raiz cúbica de tu numero es : ", num^(1/3)
		SiNo
			Escribir "has introducido un numero negativo, no es posible calcular su raiz cuadrada"
		FinSi
	Hasta Que num=0
	Escribir "hemos terminado."
	
	
FinAlgoritmo
