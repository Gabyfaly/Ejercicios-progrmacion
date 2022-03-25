Algoritmo Ejercicio_11
	Definir num, cont_cero, suma_pos, suma_neg, cont_neg Como Entero
	cont_cero=0
	cont_neg=0
	suma_neg=0
	suma_pos=0
	
	Para i=1 Hasta 10 Con Paso 1 Hacer
		Escribir " Introduce un número"
		Leer num
		Si num==0 Entonces
			cont_cero=cont_cero+1
		SiNo
			Si num>0 Entonces
				suma_pos=suma_pos+num
			SiNo
				suma_neg=suma_neg+num
				cont_neg=cont_neg+1
			Fin Si
		Fin Si
		
	Fin Para
	
	Escribir "La suma de los números positivos es: ", suma_pos
	si cont_neg<>0 Entonces
	
		Escribir "La media de los números negativos es: ", suma_neg/cont_neg
	SiNo
		Escribir " No se han introducido números negativos"
	FinSi
	
	Escribir "Has escrito ", cont_cero, " ceros"
	
	
FinAlgoritmo
