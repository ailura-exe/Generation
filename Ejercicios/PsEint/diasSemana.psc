Algoritmo diasSemana
	Escribir "Ingrese el valor del dia de la semana"
	Leer diaDeLaSemana
	
	Segun diaDeLaSemana Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Miercoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "Sábado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "El valor no es válido"
	Fin Segun
	
	Si diaDeLaSemana>=1 y diaDeLaSemana<=7 Entonces
		Si diaDeLaSemana>=1 y diaDeLaSemana<=5 Entonces
			Escribir "Es día laboral"
		FinSi	
		Si diaDeLaSemana>=6 y diaDeLaSemana<=7 Entonces
			Escribir "Es día festivo"
		FinSi
		
	FinSi
	
FinAlgoritmo
