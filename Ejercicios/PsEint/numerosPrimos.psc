Algoritmo numerosPrimos
	Definir num, contador Como Entero
	Escribir "Ingrese un n�mero"
	Leer num
	contador <- 0
	Para i<-2 Hasta num-1 
		Si num%i = 0 Entonces
			contador = contador +1
		Fin Si
	Fin Para
	
	Si contador == 0 Entonces
		Escribir "El n�mero es primo"
	SiNo
		Escribir "El n�mero no es primo"
	Fin Si
	
FinAlgoritmo
