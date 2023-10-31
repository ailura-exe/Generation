Algoritmo  factorialTaller1
	Definir num Como Entero
	Escribir "Ingrese un número positivo"
	Leer num
	Si num < 0 Entonces
		Escribir "Valor inválido"
	SiNo
		factorial <- 1
		Para i <- 1 Hasta num Con Paso 1 Hacer
			factorial = factorial * i
		Fin Para
		Escribir "El factorial de " num " es " factorial
	Fin Si
	
FinAlgoritmo