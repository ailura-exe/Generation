Algoritmo menu_opciones
	
	Definir detalle_producto, total_productos Como Cadena;
	Definir cantidad,producto Como Entero;
	Definir precio, subtotal_prod, subtotal, total, iva, propina Como Real;
	Definir terminar Como Logico
	
	terminar <- Falso
	subtotal <- 0
	total_productos <- ""
	detalle_producto <- ""
		
	Hacer
		Escribir " Seleccione el producto a llevar"
		Escribir "    1. - Coca-Cola 2L $15.00"
		Escribir "    2. - Agua con Gas $10.00"
		Escribir "    3. - Burritos de Pollo $8.50"
		Escribir "    4. - Ajinomen $9.50"
		Escribir "    5. - Pie de Queso $23.00"
		Escribir "    6. - Helado de Vainilla $18.50"
		Escribir "    7. - Terminar compra"	
		Escribir Sin Saltar "    :";
				
		Repetir 
			Leer producto;
			
			Si producto < 1 o producto > 7 Entonces
				Escribir Sin Saltar "Valor incorrecto, Ingresa una opción existente"
			FinSi
			Si producto = 7
				terminar <- Verdadero
			FinSi
			
		Hasta Que producto >= 1 o producto < 7
		
		si terminar = Falso Entonces
			
			Escribir "Ingrese  la cantidad de productos a llevar";
			Leer  cantidad;
			
			precio <- 0
			Segun producto Hacer
				1:
					precio <- 15.00
					detalle_producto <- "<Coca-Cola 2L>";
				2:
					precio <- 10.00
					detalle_producto <- "<Agua con Gas>";
				3:
					precio <- 8.50
					detalle_producto <- "<Burritos de Pollo>";
				4:
					precio <- 9.50
					detalle_producto <- "<Ajinomen>";
				5:
					precio <- 23.00
					detalle_producto <- "<Pie de Queso>";
				6:
					precio <- 18.50
					detalle_producto <- "<Helado de Vainilla>";
				De Otro Modo:
					Escribir "La opción elegida no está disponible" 
			Fin Segun
			subtotal_prod <- precio*cantidad;
			
			subtotal = subtotal + subtotal_prod
			total_productos = Subcadena(total_productos,0,longitud(total_productos)-1) + " " + Subcadena(detalle_producto,0,Longitud(detalle_producto)-1);
		FinSi
		
		
	Hasta que terminar = Verdadero
	
	iva <- subtotal*0.19
	total <- subtotal+iva
	
	propina <-0
	
	Si total > 10 y total <= 100 Entonces
		propina <- total * 0.05
	FinSi
	Si total > 100 y total <= 200 Entonces
		propina <- total * 0.1
	FinSi
	Si total > 200  Entonces
		propina <- total * 0.15
	FinSi
		
	Escribir "Resumen Factura"
	Escribir "*******************"
	Escribir total_productos;
	Escribir "Subtotal: ",subtotal;
	Escribir "IVA: ",iva;
	Escribir "Total: ",total;
	Escribir "Propina: ",propina;
	Escribir "Valor a Pagar: ",total+propina;
	
	

FinAlgoritmo
