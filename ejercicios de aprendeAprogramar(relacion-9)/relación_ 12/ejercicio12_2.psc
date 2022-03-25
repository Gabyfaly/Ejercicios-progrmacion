Funcion resultado <-cantidadDivisores(num)
	contador<-0
	para x <-1 Hasta num Con Paso 1 Hacer
		si num % x = 0 Entonces
			contador= contador + 1
		FinSi
	FinPara
	resultado<- contador
FinFuncion

Algoritmo ejercicio12_2
	Escribir "dime un número , para saber cuántos divisores tiene"
	leer num
	Escribir "tiene exactamente : ", cantidadDivisores(num), " divisores"
FinAlgoritmo
