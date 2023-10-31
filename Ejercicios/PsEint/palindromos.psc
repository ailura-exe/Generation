Algoritmo palindromos
	Definir num, original, reverso, digito Como Entero
	Escribir "Ingrese un número"
	Leer num 
	
	original <- num
	reverso <- 0
	
	Mientras num > 0 Hacer
		digito = num%10
		reverso = reverso*10 + digito
		num = (num /10)-(digito/10)
	Fin Mientras
	
	Si original == reverso Entonces
		Escribir "El número es un palíndromo"
	SiNo
		Escribir "El número no es un palíndromo"
	Fin Si
	
FinAlgoritmo
