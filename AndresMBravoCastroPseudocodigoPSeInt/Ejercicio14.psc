// algoritmo que juega a adivinar un numero del 1 al 100
Algoritmo ejercicioCatorce
	Escribir "Intenta adivinar un n�mero del 1 al 100"
	Leer numIngresado
	numAleatorio <- Aleatorio(1,100)
	
	Mientras numIngresado <> numAleatorio Hacer
		
		Si numIngresado > numAleatorio Entonces
			Escribir "ingresa un n�mero menor"
			Leer numIngresado
		SiNo
			Escribir "ingresa un n�mero mayor"
			Leer numIngresado
		Fin Si
		
	Fin Mientras
	
	Escribir "�Enhorabuena has adivinado el n�mero"
	
FinAlgoritmo
