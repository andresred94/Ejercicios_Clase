Algoritmo metodoCentinela
	
	Escribir "Ingresa los numeros que quieras	 sumar y calcular la media"
	Escribir "para salir ingresa un número negaivo"
	Leer numIngresado
	Definir media Como Real
	Definir suma Como Entero
	Definir contador Como Entero
	contador <- 1
	suma <- 0
	
	Mientras numIngresado > 0 Hacer
		suma <- suma + numIngresado
		Escribir "Vuelve a ingresar otro número: "
		Leer numIngresado
		media <- suma / contador
		contador <- contador + 1
	Fin Mientras	
	
	Escribir "La suma de los números es: " suma
	Escribir "La media de los numeros es: " media
	
FinAlgoritmo
