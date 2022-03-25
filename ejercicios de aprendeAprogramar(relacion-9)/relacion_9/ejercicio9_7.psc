Algoritmo ejercicio9_7
	Definir n, i, array Como Entero
	dimension array[10]
	array[1]<-1
	array[2]<-3
	array[3]<-5
	array[4]<-7
	array[5]<-9
	array[6]<-11
	array[7]<-13
	array[8]<-15
	array[9]<-17
	array[10]<-19
	Escribir "Qué dato deseas buscar"
	leer n
	cont<-0
	Para i<-1 Hasta 10 con paso 1 Hacer
		si array[i]==n Entonces
			cont<-cont+1
		FinSi
	FinPara
	si cont>0 Entonces
		Escribir "el dato se ha encontrado ", cont, " veces"
	SiNo
		escribir"el dato no se ha encontrado"
	FinSi
FinAlgoritmo
