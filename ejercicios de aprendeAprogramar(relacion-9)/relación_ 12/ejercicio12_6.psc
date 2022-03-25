Funcion esPar(num)
	si num % 2 = 0 Entonces
		Escribir "el número : ", num , " es par"
	SiNo
		Escribir "el número : ", num, " es impar"
	FinSi
FinFuncion
Algoritmo ejercicio12_6
	Escribir "Dime un número para saber si es par o impar"
	leer num
	esPar(num)
FinAlgoritmo
