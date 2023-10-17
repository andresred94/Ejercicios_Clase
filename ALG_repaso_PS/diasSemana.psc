Algoritmo diasSemana
	Escribir "Ingresa un dia de la semana por ejemplo 1 es lunes"
	Leer diaIngresado
	
	diaIngresado <- trunc(diaIngresado)
	
	
	
	Mientras diaIngresado < 1 o diaIngresado > 7 Hacer
		Escribir "Has ingresado un valor no válido. Vuelve a escribir un numero del 1 al 7"
		Leer diaIngresado
		diaIngresado <- trunc(diaIngresado)
	Fin Mientras
	
	Segun diaIngresado Hacer
		1:
			Escribir "Lunes"
		2:
			Escribir "Martes"
		3:
			Escribir "Miercoles"
		4:
			Escribir "Jueves"
		5:
			Escribir "Viernes"
		6:
			Escribir "Sábado"
		7:
			Escribir "Domingo"
	Fin Segun
	
	
FinAlgoritmo
