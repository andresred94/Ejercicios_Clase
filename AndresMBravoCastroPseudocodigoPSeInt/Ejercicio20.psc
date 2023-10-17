// Algoritmo  que calcula el factorial de un numero
Algoritmo ejercicioVeinte
	Definir factorial Como Entero
	Escribir "Ingresa un numero para calcular su factorial"
	Leer numIngresado
	
	factorial <- 1
	
	Para contador <- 1 Hasta numIngresado Con Paso 1 Hacer
		factorial <- factorial * contador// n * (n +1)
	Fin Para
	
	Escribir "El factorial de " numIngresado " es: " factorial
	
FinAlgoritmo
// solo se puede hasta el factorial de 12