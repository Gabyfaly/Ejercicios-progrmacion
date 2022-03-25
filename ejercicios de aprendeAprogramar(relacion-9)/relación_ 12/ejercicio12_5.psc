funcion mayorDeTres(n1,n2,n3)
	si (n1 > n3) y (n1 > n2)Entonces
		mayor=n1
		Escribir "El mayor de los tres es el ", n1
	SiNo
		si(n2 > n1) y (n2 > n3) Entonces
			mayor=n2
			Escribir "El mayor de los tres es el ", n2
		SiNo
			Escribir "El mayor de los tres es el ", n3
		FinSi
	FinSi
FinFuncion

Algoritmo ejercicio12_5
	Escribir "dime tres nº para saber cúal es el mayor"
	leer n1,n2,n3
	mayorDeTres(n1,n2,n3)
FinAlgoritmo
