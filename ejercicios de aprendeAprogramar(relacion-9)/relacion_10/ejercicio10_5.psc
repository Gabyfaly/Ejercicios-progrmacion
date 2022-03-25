Algoritmo ejercicio10_5
	Definir n1, n2, suma Como Entero
	Escribir "dime dos numeros enteros"
	Leer n1
	leer n2
	suma = 0 
	si n1 > 0 y n2 >0 Entonces
		Escribir "el valor absoluto de su diferencia es : ", suma=n1-n2
	SiNo
		si n1 < 0 y n2 >0 Entonces
			Escribir "la distancia es : " , suma=abs(n1) + n2
		SiNo
			si n1 <0 y n2<0 Entonces
				Escribir "la distancia es : ", suma=abs(n1)-n2
			SiNo
				Escribir "la distancia es: ", suma=n1-n2
				
			FinSi
			
		FinSi
		Escribir "el valor absoluto de su diferencia es : " , suma
		
	FinSi
	
	
FinAlgoritmo
