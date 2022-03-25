Algoritmo positivo_negativo_cero
	definir numero Como real
	Escribir "dime un número real"
	leer numero

	Si numero =0  Entonces
		numero = cero
		Escribir "el numero es 0"
	SiNo
		si numero < 0 Entonces
			numero = negativo
			Escribir "el numero es negativo"
		SiNo
			numero= positivo
			escribir"el numero es positivo"
		FinSi
	Fin Si
	
	
FinAlgoritmo
