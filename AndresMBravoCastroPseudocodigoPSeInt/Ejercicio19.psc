// algoritmo que muestra los N primeros numeros de de la secuencia de fibonacci
Algoritmo ejercicioDiecinueve
	Definir numIngresado Como Entero
	Escribir "Mostrar la sucesión de Fibonacci hasta un número ingresado"
	Leer numIngresado
	
	numFibo <- 1// n + 1 
	valTope <- 1// ( n - 1 )
	
	Repetir
		Escribir Sin Saltar numFibo " "
		
		valTope <- numFibo + valTope
		numFibo <- valTope - numFibo// ( n + 1 ) - n
		
	Hasta Que numFibo > numIngresado
	
	
FinAlgoritmo
