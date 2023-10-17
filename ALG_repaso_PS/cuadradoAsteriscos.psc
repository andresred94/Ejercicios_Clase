Algoritmo cuadradoAsteriscos
	Definir tamanio como entero
	Definir n Como Entero
	Definir j Como Entero
	
	Escribir "ingresa un tamaño para el cuadrado"
	Leer tamanio
	
	Para n <-1 Hasta tamanio Con Paso 1 Hacer
		Para j <- 1 Hasta tamanio Con Paso 1 Hacer
			Si (n == 1 o n == tamanio) o ( j == 1 o j == tamanio ) Entonces
				Escribir sin saltar "*"
			SiNo
				Escribir Sin Saltar " "
			Fin Si
		Fin Para
		Escribir " "
	Fin Para
	
	
	
	
FinAlgoritmo
