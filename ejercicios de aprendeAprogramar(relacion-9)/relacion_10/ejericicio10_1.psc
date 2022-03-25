Algoritmo ejericicio10_1	
	Definir num_azar, num_usuario, i Como Entero
	num_azar <- 1 + azar(100)
	escribir "Intenta adivinar el nº aleatorio que se va a generar entre el 1 y el 100, sólo vas a tener 7 oportunidades, suerte :)"
	para i<-1 Hasta 7 Hacer
		Leer num_usuario
		si num_azar= num_usuario Entonces
			Escribir "has acertado el nº aleatorio enhorabuena!!"
		SiNo
			si num_azar > num_usuario Entonces
				Escribir "te has quedado corto"
			sino
				Escribir "te has pasado"
			FinSi
		FinSi
	FinPara

	
FinAlgoritmo
