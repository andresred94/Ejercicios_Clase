Funcion suma <- tirarDados (Vacio)// Generar ambos tiros de los dados
	Definir dado1, dado2, suma como entero 
	dado1 = Aleatorio(1,6) 
	dado2 = Aleatorio(1,6)
	suma = dado1 + dado2
	Escribir " El jugador tiró " dado1 " + " dado2 " = " suma
Fin Funcion

Algoritmo juegoCraps
	miPunto = 0
	sumaDeDados = tirarDados(Vacio)
	
	//Estados del juego
	Definir  GANO Como Cadena
	Definir PIERDE Como Cadena
	Definir  CONTINUA Como Cadena
	Definir  ESTADO Como Cadena
	
	//posibles positivos
	SIETE <- 7
	ONCE <- 11
	
	//posibles negativos
	DOS_UNOS <- 2 
	TRES <- 3
	DOCE <- 12
	
	//primer tiro de dados
	Escribir "El punto es " sumaDeDados
	
	//estado del juego segun la suma de los dados
	Segun sumaDeDados Hacer
		SIETE: 
			ESTADO<-"GANO"
		ONCE:
			ESTADO<-"GANO"
		DOS_UNOS:
			ESTADO<-"PIERDE"
		TRES:	
			ESTADO<-"PIERDE"	
		DOCE:
			ESTADO<-"PIERDE"
			
		De Otro Modo:
			ESTADO <-"CONTINUA"
			miPunto <- sumaDeDados
			
	Fin Segun
	
	//bucle que se repite hasta que termina el juego
	Mientras ESTADO = "CONTINUA" Hacer
		sumaDeDados <- tirarDados(Vacio)
		
		Si sumaDeDados <> miPunto Entonces
			ESTADO <-"CONTINUA"
		Fin Si
		
		Si sumaDeDados = miPunto Entonces
			ESTADO <-"GANO" 
		FinSi
		
		Si sumaDeDados = SIETE Entonces
			ESTADO <-"PIERDE"
		FinSi
		
	Fin Mientras
	
	//mensaje que se muestra en caso de que pierda o gane
	
	Si ESTADO = "GANO" Entonces
		Escribir "El jugador gana"
	SiNo Si ESTADO = "PIERDE" Entonces
			Escribir "El jugador pierde"
		FinSi
	Fin Si
	
FinAlgoritmo	
