SubProceso escribirEspaciado(texto)
	para x<- 1 hasta Longitud(texto) Hacer
		Escribir Sin Saltar Subcadena(texto,x,x), " "
	FinPara
	escribir""
FinSubProceso

Algoritmo ejercicio12_4
	Escribir "dime un texto,frase o palabra"
	leer texto
	escribirEspaciado(texto)	
FinAlgoritmo
