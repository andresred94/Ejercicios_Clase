// algoritmo que imprime un triangulo
Algoritmo ejercicioVeintidos
	
	Escribir "Ingresa el tamaño de la base del triangulo"
	Leer baseTriangulo
	
	Definir i Como Entero
	Definir j Como Entero
		
	Para i <- 1 Hasta baseTriangulo Con Paso 1 Hacer
		
		Para  j <- 1 Hasta i - 1 Con Paso 1 Hacer
			Escribir Sin Saltar "*"
		FinPara
		
		Para j <- 1 Hasta baseTriangulo - i Con Paso 1 Hacer
			Escribir Sin Saltar " "
		FinPara
		
		Escribir " "
		
	Fin Para
	
	
FinAlgoritmo
