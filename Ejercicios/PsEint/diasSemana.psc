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
			Escribir "S�bado"
		7:
			Escribir "Domingo"
		De Otro Modo:
			Escribir "El valor no es v�lido"
	Fin Segun
	
	Si diaDeLaSemana>=1 y diaDeLaSemana<=7 Entonces
		Si diaDeLaSemana>=1 y diaDeLaSemana<=5 Entonces
			Escribir "Es d�a laboral"
		FinSi	
		Si diaDeLaSemana>=6 y diaDeLaSemana<=7 Entonces
			Escribir "Es d�a festivo"
		FinSi
		
	FinSi
	
FinAlgoritmo
