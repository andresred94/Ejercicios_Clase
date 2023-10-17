// funcion que almacena la resta de las coordenadas Y
Funcion result <- coordEjey ( y1 , y2 )
	result <- y1 - y2	
Fin Funcion

// funcion que almacena la resta de las coordenadas X
Funcion result <-  coordEjex ( x1 , x2 )
	result <- x1 - x2	
Fin Funcion

// algoritmo que calcula la distancia entre dos puntos
Algoritmo ejercicioTrece
	Definir ejeX Como Real
	Definir ejeY Como Real
	Definir result Como Real
	
	Escribir " Calculadora de distancias "
	Escribir " ingresa las coordenadas de X del punto A "
	Leer x1
	Escribir " ingresa las coordenadas de Y del punto A "
	Leer y1
	
	Escribir " ingresa las coordenadas de X del punto B "
	Leer x2
	Escribir " ingresa las coordenadas de Y del punto B "
	Leer y2
	
	ejeX <- coordEjex ( x1 , x2 )
	ejeY <- coordEjey ( y1 , y2 )
	
	result <- raiz( ( ejeX ) ^ 2 + ( ejeY ) ^ 2)
	Escribir "La ditancia entre el punto A y el punto B es: " result 
		
FinAlgoritmo
