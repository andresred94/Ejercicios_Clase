Funcion contador <- usandoPara ( Vacio )
	
	Para contador<-1 Hasta 19 Con Paso 1 Hacer
		Escribir contador
	FinPara
	
Fin Funcion

Funcion contador <- usandoMientras ( Vacio )
	
	contador <- 1
	Mientras contador < 20 Hacer
		Escribir contador
		contador <- contador + 1
	Fin Mientras
	
	
Fin Funcion
Funcion contador <- usandoRepetir ( Vacio )
	
	contador <- 1
	Repetir
		Escribir contador
		contador <- contador + 1
	Hasta Que contador = 20
	
Fin Funcion

Algoritmo mostrarNumeros
	
	Definir result Como Entero
	
	Escribir "Usando Para"
	result <- usandoPara ( Vacio )
	Escribir result
	
	Escribir "Usando mientras"
	result <- usandoMientras ( Vacio )
	Escribir  result 
		
	Escribir "Usando repetir"
	result <- usandoRepetir ( Vacio )
	Escribir result	
	
FinAlgoritmo
