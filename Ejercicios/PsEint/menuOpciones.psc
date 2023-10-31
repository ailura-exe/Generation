Algoritmo menuOpciones
	Escribir Sin Saltar "Ingresar la cantidad de productos a llevar"
	Leer cantidad
	
	Escribir "Seleccione el producto a llevar"
	Escribir "	1.Coca Cola 2L $6.000"
	Escribir "	2.Agua con Gas $3.000"
	Escribir "	3.Chocolate $4.000"
	Escribir "	4.Chocorramo $5.000"
	Escribir " 5.Arepa con queso $5.500"
	Escribir " 6.Helado de Vainilla $2.000" 
	Escribir Sin Saltar"		:"
	Repetir
		Leer producto
		Si producto<1 o producto>6
			Escribir Sin Saltar"Valor incorrecto, ingresa una opción válida"
		FinSi
	Hasta Que producto>=1 y producto<=6
	
	precio<-0
	
	Si producto=1 Entonces
		precio = 6000
	FinSi
	Si producto=2 Entonces
		precio = 3000
	FinSi
	Si producto=3 Entonces
		precio = 4000
	FinSi
	Si producto=4 Entonces
		precio = 5000
	FinSi
	Si producto=5 Entonces
		precio = 5500
	FinSi
	Si producto=6 Entonces
		precio = 2000
	FinSi
	
	Para i<-1 Hasta cantidad Con Paso 1 Hacer
		Segun producto Hacer
			1:
				secuencia_de_acciones_1
			2:
				secuencia_de_acciones_2
			3:
				secuencia_de_acciones_3
			4:
				
			5:
				
			6:
				
			De Otro Modo:
				secuencia_de_acciones_dom
		Fin Segun
	Fin Para
	
	subtotal<-precio*cantidad
	iva<-subtotal*0.16
	total<-subtotal+iva
	
	Escribir "El subtotal es: " subtotal
	Escribir "El iva es: " iva
	Escribir "El total con iva es: " total

	
FinAlgoritmo
