Funcion esPar(num)
	si num % 2 = 0 Entonces
		Escribir "el n�mero : ", num , " es par"
	SiNo
		Escribir "el n�mero : ", num, " es impar"
	FinSi
FinFuncion
Algoritmo ejercicio12_6
	Escribir "Dime un n�mero para saber si es par o impar"
	leer num
	esPar(num)
FinAlgoritmo
