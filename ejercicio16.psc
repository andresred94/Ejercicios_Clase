//Algoritmo que lea un n�mero e indique si es primo. Un n�mero es primo si
//no divisible por ning�n m�s peque�o que este. Ejemplo 7 es primo, ya que
//no es divisible por 2, 3, 4, 5 y 6. (el resto es distinto de cero)
Algoritmo ejercicio16
	
	Definir num, i, contador Como Entero;
	
	i = 2; //Inicializa i a 2 ya que es el 1er n�mero primero
	contador = 0; //Inicializa contador a 0 para evitar que pete
	
	Repetir
		Escribir "Dime un n�mero y te dir� si es primo";
		Leer num;
	Hasta Que num > 0; //Evita el 0 y n�meros los negativos
	
	Si num >= i Entonces //Si el n�mero ingresado es >= 2, comienza a buscar divisores
		Repetir
			Si num MOD i == 0 Entonces //Verifica si num es divisble por i
				contador = contador + 1; //Si es divisible, incrementa el contador
			FinSi
			i = i + 1; //Incrementa i para verificar el siguiente n�mero
		Hasta Que i > num; //Continua hasta que i sea mayor que num
	FinSi
	
	Si contador == 1 Entonces //Comprueba el valor del contador para determinar si el n�mero es primo
		Escribir "El n�mero ", num , " es primo.";
	SiNo
		Escribir "El n�mero ", num , " no es primo.";
	FinSi
	
FinAlgoritmo
