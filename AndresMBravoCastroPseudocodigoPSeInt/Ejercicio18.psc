// algoritmo que comprueba si un año es bisiesto
Algoritmo ejercicioDieciocho
	Definir multi4, multi100, multi400 Como Entero
	
	Escribir "Ingresa un año mayor que 0"
	Leer anio
	
	Si anio < 0 Entonces
		Escribir "Error: vuelve a ingresar un año"
		Leer anio
	Fin Si
	
	multi4 <- anio MOD 4
	multi100 <- anio MOD 100
	multi400 <- anio MOD 400
	
	Si multi4 = 0 Y multi100 <> 0 Entonces
		Escribir anio " es un año bisiesto"
	SiNo Si multi100 = 0 Y multi400 = 0 Entonces
			Escribir anio " es un año bisiesto"
		SiNo
			Escribir anio " no es un año bisiesto"
		FinSi
	Fin Si
	
	// 1900 no lo es, 2000 lo es, 2100, 2200, 2300 no lo es, pero 2400 es otro año bisiesto.
FinAlgoritmo
