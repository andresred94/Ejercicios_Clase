Funcion opIngresada <- menuDeOpciones ( Vacio )
	Escribir "Escoge una opción"
	Escribir " L = Calcular longitud"
	Escribir " M = Calcular masa"
	Escribir " S = Salir"
	Definir opIngresada Como Caracter
	Leer opIngresada
	Escribir opIngresada
Fin Funcion

Algoritmo calcularCantidades
	Definir opEscogida Como Caracter

	Mientras opEscogida <> "S" Hacer
		opEscogida = Mayusculas( menuDeOpciones( Vacio ) )
		
		Segun opEscogida Hacer
			"L":
				Escribir "Ingresa una longitud en cm p.ej. 200 cm"
				Leer cmIngresados
				pulgadas = cmIngresados / 2.54
				Escribir cmIngresados " centimetros en pulgadas es: " pulgadas
			"M":
				Escribir "Ingresa una cantidad en kg p.ej. 20 kg"
				Leer gmIngresados
				libras = gmIngresados * 2.2
				Escribir gmIngresados " kg en libras es: " libras
			S:
				
			De Otro Modo:
				Escribir "Has salido. "
		Fin Segun
		
	Fin Mientras
	
FinAlgoritmo
