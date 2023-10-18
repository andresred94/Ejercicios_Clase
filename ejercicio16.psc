//Algoritmo que lea un número e indique si es primo. Un número es primo si
//no divisible por ningún más pequeño que este. Ejemplo 7 es primo, ya que
//no es divisible por 2, 3, 4, 5 y 6. (el resto es distinto de cero)
Algoritmo ejercicio16
	
	Definir num, i, contador Como Entero;
	
	i = 2; //Inicializa i a 2 ya que es el 1er número primero
	contador = 0; //Inicializa contador a 0 para evitar que pete
	
	Repetir
		Escribir "Dime un número y te diré si es primo";
		Leer num;
	Hasta Que num > 0; //Evita el 0 y números los negativos
	
	Si num >= i Entonces //Si el número ingresado es >= 2, comienza a buscar divisores
		Repetir
			Si num MOD i == 0 Entonces //Verifica si num es divisble por i
				contador = contador + 1; //Si es divisible, incrementa el contador
			FinSi
			i = i + 1; //Incrementa i para verificar el siguiente número
		Hasta Que i > num; //Continua hasta que i sea mayor que num
	FinSi
	
	Si contador == 1 Entonces //Comprueba el valor del contador para determinar si el número es primo
		Escribir "El número ", num , " es primo.";
	SiNo
		Escribir "El número ", num , " no es primo.";
	FinSi
	
FinAlgoritmo
