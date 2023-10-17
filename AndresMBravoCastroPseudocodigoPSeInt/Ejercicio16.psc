// algoritmo que comprueba si un numero es primo o no
Algoritmo ejercicioDieciseis
	
	Escribir "Ingresa un número"
	Leer numIngresado
	Definir contador Como Entero
	Definir result Como Entero
	Para contador <- 1  Hasta numIngresado Con Paso 1 Hacer
		result <- numIngresado % 2
	Fin Para
	Si result <> 0 Entonces
		Escribir "Es primo"
	SiNo
		Escribir "No es primo"
	Fin Si
	
FinAlgoritmo
