Funcion resultado <-esMultiplo(n1,n2)
	si n1 % n2 = 0 Entonces
		Escribir "el primer n�mero es divisible por el segundo" 
	SiNo
		si n2%n1 =0 Entonces
			Escribir "el segundo n� es divisible por el primero"
		SiNo
			Escribir "el primer n�mero no es divisible por el segundo"
		FinSi
	FinSi
	

FinFuncion
Algoritmo ejercicio12_3
	Escribir "Dime dos n�meros enteros"
	leer n1 , n2
	Escribir esMultiplo(n1,n2)
FinAlgoritmo
