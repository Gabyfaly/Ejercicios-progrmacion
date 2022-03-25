Algoritmo ejercicio9_4
	Dimension vectorX[3] 
	Dimension vectorY[3] 
	Dimension vector_suma[3] 
	definir i, vectorX,vectorY,vector_suma Como Entero
	Escribir "dime el valor de las coordenadas de X, de izq a derecha"
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		
		Leer vectorX[i]		
	FinPara
	
	Escribir "el vector X es igual a : ( ", vectorX[1], ", ",vectorX[2], ", ", vectorX[3], " )"
	
	Escribir "dime el valor de las coordenadas de Y, de izq a derecha"
	Para i<-1 Hasta 3 Con Paso 1 Hacer
	
		Leer vectorY[i]
	FinPara
	
	Escribir "el vector Y es igual a : ( ", vectorY[1], ", ",vectorY[2], ", ", vectorY[3], " )"
	
	Escribir "el vector suma es igual a :"
	Para i<-1 Hasta 3 Con Paso 1 Hacer
		vector_suma[i]<-vectorX[i]+ vectorY[i]
		Escribir vector_suma[i]
		
	FinPara
	
	
	
	
FinAlgoritmo
