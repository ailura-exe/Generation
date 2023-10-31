Algoritmo contarPalabras_profe
	Definir frase como Cadena
	Definir espacios, i, cantidad Como Entero
	
	espacios=0;
	i=0
	
	cantidad=0;
	Escribir "Ingrese una frase"
	Leer frase
	cantidad = Longitud(frase)
	
	Para i=0 hasta cantidad Con Paso 1 Hacer 
		Si Subcadena(frase,i,i)=" " Entonces
			espacios = espacios+1
		FinSi
	FinPara
	Escribir "La frase tiene " espacios+1 " palabras."
FinAlgoritmo
