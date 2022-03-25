Algoritmo multiplo_de_otro
		Definir n1 Como Entero
		Definir n2 Como Entero
		Escribir "dime el primer número"
		leer n1
		Escribir "dime el segundo número"
		leer n2
		
		Si n1%n2=0 Entonces
			Escribir "el segundo número es múltiplo del primero"
		SiNo
			si n2%n1 = 0 Entonces
				Escribir "el primero número es múltiplo del segundo"
			SiNo
				escribir "ni el primer número es múltiplo del segundo ni viceversa"
				
			FinSi
			
		Fin Si
FinAlgoritmo

	

