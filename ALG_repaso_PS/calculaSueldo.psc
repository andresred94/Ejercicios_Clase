// metodo para leer los dias trabajados
Funcion cantDias <- diasTrabajados ( Vacio )
	Escribir "Dias trabajados en una semana: "
	Leer cantDias
	
	Mientras cantDias <= 0 O cantDias >= 7 Hacer
		Escribir "Error: vuelve a ingresar una cantidad válida."
		Leer cantDias
	FinMientras
	
Fin Funcion

//metedo para leer el cargo
Funcion cargo <- escogerCargo ( Vacio )
	Definir cargo Como Caracter
	Leer cargo
	cargo <- Minusculas(cargo)
	Segun cargo Hacer
		"cajero":
			cargo <- "cajero"
		"reponedor":
			cargo <- "reponedor"
		"responsable":
			cargo <- "responsable"
		"mantenimiento":
			cargo <- "mantenimiento"
		De Otro Modo:
			Escribir "Error: vuelve a ingresar un cargo válido"
			cargo <- escogerCargo ( Vacio ) 
	Fin Segun
	
Fin Funcion

//Algoritmo que ejecuta todo el programa
Algoritmo calculaSueldo
	Definir empleado Como Cadena
	Definir dias Como Entero
	Definir result Como Real
	
	Escribir "Bienvenido a la calculadora de sueldos, escoge un cargo, estos pueden ser: "
	Escribir "Cajero"
	Escribir "Reponedor"
	Escribir "Responsable"
	Escribir "Mantenimiento"
	
	empleado <- escogerCargo ( Vacio )
	
	Escribir "Ingresa los dias trabajados, tiene que ser menor que 7 días"
	dias <- diasTrabajados ( Vacio )
	
	
	Segun empleado Hacer
		"cajero":
			result <- dias * 100
			Escribir "su sueldo sería de " result " por semana"
		"reponedor":
			result <- dias * 90
			Escribir "su sueldo sería de " result " por semana"
		"responsable":
			result <- dias * 120
			Escribir "su sueldo sería de " result " por semana"
		"mantenimiento":
			result <- dias * 82
			Escribir "su sueldo sería de " result " por semana"
	Fin Segun
	
FinAlgoritmo
