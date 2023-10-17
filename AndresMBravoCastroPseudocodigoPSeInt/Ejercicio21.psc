// Algoritmo  que convierte un decimal a binario
Algoritmo ejercicioVeintiuno
	
	Definir resto Como Real
	Escribir "Ingrese un número decimal: "
	
	Leer numIngresado
	binario <- ""
	resto <- 0
	
	Mientras numIngresado > 0 Hacer
		
		resto <- numIngresado % 2 
		binario <- ConvertirATexto( resto ) + binario
		numIngresado <- trunc( numIngresado / 2)
		
	Fin Mientras
	
	Escribir binario 
	
FinAlgoritmo

