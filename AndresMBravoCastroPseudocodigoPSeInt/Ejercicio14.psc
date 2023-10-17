// algoritmo que juega a adivinar un numero del 1 al 100
Algoritmo ejercicioCatorce
	Escribir "Intenta adivinar un número del 1 al 100"
	Leer numIngresado
	numAleatorio <- Aleatorio(1,100)
	
	Mientras numIngresado <> numAleatorio Hacer
		
		Si numIngresado > numAleatorio Entonces
			Escribir "ingresa un número menor"
			Leer numIngresado
		SiNo
			Escribir "ingresa un número mayor"
			Leer numIngresado
		Fin Si
		
	Fin Mientras
	
	Escribir "¡Enhorabuena has adivinado el número"
	
FinAlgoritmo
