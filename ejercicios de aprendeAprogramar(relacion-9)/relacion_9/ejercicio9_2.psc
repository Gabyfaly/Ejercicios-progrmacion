Algoritmo ejercicio9_2
	Dimension  datos[5]
	suma<-0
	
	para i <- 1 hasta 5 Hacer
		Escribir "dime 5 numeros de uno en uno: ", i
		leer datos[i]
	FinPara
	para i<-1 hasta 5 Hacer
		suma<-suma+ datos[i]
	FinPara
	escribir "la suma de tus numeros es : ", suma
	media<- suma/5
	
	Escribir "la media de tus numeros es: ",media
	Escribir "los valos son mayores o iguales que la media"
	Para i<-1 Hasta 5 Hacer
		si media <= datos[i] Entonces
			Escribir datos[i]
		FinSi
	FinPara

	
FinAlgoritmo
