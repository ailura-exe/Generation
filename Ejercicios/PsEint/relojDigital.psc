Algoritmo relojDigital
	
	horas<-0
	minutos<-0
	seg<-0
	
	Mientras  Verdadero Hacer
		si Horas<10 Entonces
			Escribir "0" Sin Saltar
		FinSi
		Escribir horas, ":" Sin Saltar
		Si minutos<10 Entonces
			Escribir "0" Sin Saltar
		FinSi
		Escribir minutos ":" Sin Saltar
		Si seg <10 Entonces
			Escribir "0" Sin Saltar
		FinSi
		Escribir seg
		seg<-seg+1
		Si seg=60 Entonces
			minutos<-minutos+1
			seg<-0
			
			Si minutos=60 Entonces
				horas<-horas+1
				minutos<-0
				
				Si horas=24 Entonces
					horas<-0
					
				FinSi
			FinSi
		FinSi
		Esperar 1 Segundos
		Limpiar Pantalla
	FinMientras
	
FinAlgoritmo
