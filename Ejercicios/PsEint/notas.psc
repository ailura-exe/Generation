Algoritmo notas
	//Solicitamos los datos de entrada, las notas 
	Escribir "Ingrese nota 1"
	Leer nota1
	Escribir "Ingrese nota 2"
	Leer nota2
	Escribir "Ingrese nota 3"
	Leer nota3
	
	//Operamos los valores obteniendo el promedio
	promedio<-(nota1+nota2+nota3)/3
	
	//Si el valor es mayor a 3.0, el alumno paso, si no perdió, usamos un condicional para comparar los datos
	
	Si promedio>=3.0 Entonces
		Escribir "Su nota es: " promedio ", usted pasó."
	SiNo	
		Escribir "Su nota es: " promedio ", usted perdió."
	FinSi
		
	
	
	
FinAlgoritmo
