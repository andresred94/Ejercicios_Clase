Algoritmo mayorNumero
	Escribir "Ingresa tres numeros enteros"
	Leer num1, num2, num3
	//Comprueba el numero mayor
	Si num1 > num2 & num1 > num3 Entonces 
		Escribir num1 " Es el numero mayor"
	SiNo Si num2 > num1 & num2 > num3 Entonces
			Escribir num2 " Es el numero mayor"
		SiNo Si num3 > num1 & num3 > num2 Entonces
				Escribir num3 " Es el numero mayor"
			FinSi
		FinSi
	Fin Si
	//Comprueba si son iguales
	Si num1 = num2  Entonces
		Escribir num1 " es igual a " num2
	Sino Si num1 = num3 Entonces
			Escribir num1 " es igual a " num3			
		Sino Si num3 = num2 Entonces
				Escribir num3 " es igual a " num2
			Fin Si
		Fin Si
	Fin Si
	
	
	
FinAlgoritmo
