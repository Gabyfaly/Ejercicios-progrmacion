Algoritmo ejercicio10_2
	Definir num Como Real
	escribir "dime un numero, para hacer su raiz cuadrada, para pararlo introduce un 0"
	Repetir
		Leer num
		si num > 0 Entonces
			Escribir "la raiz cuadrada de tu numero es : ", raiz(num)
		SiNo
			Escribir "has introducido un numero negativo, no es posible calcular su raiz cuadrada"
		FinSi
	Hasta Que num=0
	
FinAlgoritmo
