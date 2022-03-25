SubProceso  iniciales(texto)
	Escribir Sin Saltar Mayusculas(Subcadena(texto,1,1))
	para x<-1 Hasta Longitud(texto) Hacer
		si Subcadena(texto,x,x) = " " Entonces
			Escribir Sin Saltar Mayusculas(Subcadena(texto,x+1,x+1))
		SiNo
			Escribir Sin Saltar Minusculas(Subcadena(texto,x+1,x+1))
		FinSi
	FinPara
	Escribir ""
FinSubProceso

Algoritmo ejercicio12_8
	Leer texto
	iniciales(texto)
FinAlgoritmo
