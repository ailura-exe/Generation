Algoritmo primosProfe
	Definir numeroIngresado, iteracion, divisionResiduoCero Como Entero
	
	Escribir "ingrese un valor:"
	Leer numeroIngresado
	
	iteracion=1
	divisionResiduoCero=0
	
	Mientras iteración <= numeroIngresado Hacer
		Si (numeroIngresado%iteracion==0)Entonces
			divisionResiduoCero =divisionResiduoCero+1
		FinSi
		iteracion=iteracion+1
	FinMientras
	
	Si(divisionResiduoCero==2) Entonces
		Escribir "El numero ingresado es primo"
	SiNo
		Escribir "El numero ingresado no es primo, intentalo con otro"
	FinSi
	
FinAlgoritmo
