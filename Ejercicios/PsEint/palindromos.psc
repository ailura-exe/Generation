Algoritmo palindromos
	Definir num, original, reverso, digito Como Entero
	Escribir "Ingrese un n�mero"
	Leer num 
	
	original <- num
	reverso <- 0
	
	Mientras num > 0 Hacer
		digito = num%10
		reverso = reverso*10 + digito
		num = (num /10)-(digito/10)
	Fin Mientras
	
	Si original == reverso Entonces
		Escribir "El n�mero es un pal�ndromo"
	SiNo
		Escribir "El n�mero no es un pal�ndromo"
	Fin Si
	
FinAlgoritmo
