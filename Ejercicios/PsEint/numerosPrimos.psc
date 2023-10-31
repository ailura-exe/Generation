Algoritmo numerosPrimos
	Definir num, contador Como Entero
	Escribir "Ingrese un número"
	Leer num
	contador <- 0
	Para i<-2 Hasta num-1 
		Si num%i = 0 Entonces
			contador = contador +1
		Fin Si
	Fin Para
	
	Si contador == 0 Entonces
		Escribir "El número es primo"
	SiNo
		Escribir "El número no es primo"
	Fin Si
	
FinAlgoritmo
