Algoritmo contarPalabras
	Escribir "Ingrese un parrafo"
	Leer parrafo
	n <- 0
	n = Longitud(parrafo)
	espacios <- 0
	Para i<- 0 Hasta n-1 Con Paso 1 Hacer
		Si Subcadena(parrafo,i,i)=" " Entonces
			espacios = espacios + 1
		Fin Si
	Fin Para
	Escribir "El parrafo tiene " espacios+1 " palabras"
FinAlgoritmo