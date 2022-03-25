Algoritmo ejericio9_10
	Dimension datos[3,3]
	Definir datos, determinate, determinanteD1,determinanteD2 Como real
	//(a11*a22*a33 + a12*a23*a31 +a21*a32*a13) - (a13*a22*a31+ a12*a21*a33 + a23*a32*a11)
	Escribir "dime la posición de la primera fila(a11,a12,a13) de la matrix 3x3"
	Para i<-1 hasta 3 Con Paso 1 Hacer
		Leer datos[1,i]
	FinPara
	Escribir "dime la posición de la primera fila(a21,a22,a23) de la matrix 3x3"
	Para i<-1 hasta 3 Con Paso 1 Hacer
		Leer datos[2,i]
	FinPara
	Escribir "dime la posición de la primera fila(a31,a32,a33) de la matrix 3x3"
	Para i<-1 hasta 3 Con Paso 1 Hacer
		Leer datos[3,i]
	FinPara
	Escribir "|",datos[1,1] ,"," ,datos[1,2],",",  datos[1,3],"|"
	Escribir "|",datos[2,1] , "," ,datos[2,2], "," ,datos[2,3],"|"
	Escribir "|",datos[3,1] , "," ,datos[3,2],"," , datos[3,3],"|"
	
	determinanteD1<-(datos[1,1]*datos[2,2]*datos[3,3])+(datos[1,2]*datos[2,3]*datos[3,1])+(datos[2,1]*datos[3,2]*datos[1,3])
	determinanteD2<-(datos[1,3]*datos[2,2]*datos[3,1])+(datos[1,2]*datos[2,1]*datos[3,3])+(datos[2,3]*datos[3,2]*datos[1,1])
	determinante=determinanteD1-determinanteD2
	Escribir "el determinante de esta matriz 3X3 es igual a : " determinante
	
FinAlgoritmo
