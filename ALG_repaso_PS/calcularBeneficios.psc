Algoritmo calcularBeneficios
	
	Escribir "Ingresa la cantidad de ventas de teclado"
	Leer ventasTeclado
	
	Definir totalBenef Como Real
	Definir totalPrecio Como Real
	Definir ganancia Como Real
	Definir precioTeclado Como Real
	Definir benefTeclado Como Real
	
	GANANCIA = 0.0825
	
	Mientras ventasTeclado <= 0 Hacer
		Escribir "vuelve a ingresa otra cantidad"
		Leer ventasTeclado
	Fin Mientras
	
	Si ventasTeclado > 0 Y ventasTeclado <= 9 Entonces
		precioTeclado <- 10
		benefTeclado<- precioTeclado * GANANCIA
		totalPrecio<- precioTeclado * ventasTeclado
		totalBenef <- benefTeclado * ventasTeclado
		
	SiNo Si ventasTeclado >= 10 Y ventasTeclado <= 99 Entonces
			precioTeclado <- 8
			benefTeclado<- precioTeclado * GANANCIA
			totalPrecio<- precioTeclado * ventasTeclado
			totalBenef <- benefTeclado * ventasTeclado
		Sino Si ventasTeclado >= 100 Y ventasTeclado <= 499 Entonces
				precioTeclado <- 7
				benefTeclado<- precioTeclado * GANANCIA
				totalPrecio<- precioTeclado * ventasTeclado
				totalBenef <- benefTeclado * ventasTeclado
			Sino Si ventasTeclado >= 500 Entonces
					precioTeclado <- 6
					benefTeclado<- precioTeclado * GANANCIA
					totalPrecio<- precioTeclado * ventasTeclado
					totalBenef <- benefTeclado * ventasTeclado
				FinSi
			FinSi
		Fin Si
	FinSi
	
	Escribir "Las Ganancias son de: " totalBenef
	Escribir "El precio total que tiene que pagar el cliente es: " totalPrecio
	Escribir "por " ventasTeclado " vendidos"
		
	
FinAlgoritmo
