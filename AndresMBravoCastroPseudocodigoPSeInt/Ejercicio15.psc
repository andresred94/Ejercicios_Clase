
Funcion opIngresada <- jugadaJugador ( Vacio )
	Escribir "ingresa una de las tres opciones"
	Leer opIngresada 
	opIngresada <- Minusculas(opIngresada)
	
Fin Funcion

// algoritmo que interpreta el juego de papel piedra o tijera
Algoritmo ejercicioQuince
	Definir resp como cadena
	Definir jugador Como Entero
	opMaquina <- Aleatorio(0,2)
	PIEDRA <- 0
	PAPEL <- 1
	TIJERA <- 2
	
	Escribir "¿Juegas piedra papel o tijera?"
	resp <- jugadaJugador ( Vacio )
	
	Mientras resp <> "piedra" Y resp <> "papel" Y resp <> "tijera" Hacer
		resp <- jugadaJugador ( Vacio )
	Fin Mientras
	
	Segun resp Hacer
		"piedra":
			jugador <- 0
		"papel":
			jugador <- 1
		"tijera":
			jugador <- 2			
		De Otro Modo:
			Escribir "Error: vuelve a ingresar una opcion"
	Fin Segun
	
	
	Segun opMaquina Hacer
		0:
			Escribir "La maquina ha escogido PIEDRA" 
		1:
			Escribir "La maquina ha escogido PAPEL"
		2:
			Escribir "La maquina ha escogido TIJERA"
	Fin Segun
	
	
	// casos en los que gana el jugador
	Si jugador == PIEDRA Y opMaquina == TIJERA Entonces
		Escribir "¡Has Ganado! :D"
	SiNo Si jugador == TIJERA Y opMaquina == PAPEL Entonces
			Escribir "¡Has ganado! :D"
		SiNo Si jugador == PAPEL Y opMaquina == PIEDRA Entonces
				Escribir "¡Has ganado! :D" 
			SiNo Si jugador == opMaquina Entonces
					Escribir "¡Ha sido empate! :/"
				SiNo
					Escribir "¡Has perdido! :("
				FinSi
			FinSi
		FinSi
	FinSi
	
	
	
FinAlgoritmo
