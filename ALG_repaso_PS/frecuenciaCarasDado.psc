Algoritmo frecuenciaCarasDado
	
	Definir fq1 Como Entero
	Definir fq2 Como Entero
	Definir fq3 Como Entero
	Definir fq4 Como Entero
	Definir fq5 Como Entero
	Definir fq6 Como Entero
	Definir cara Como Entero	
	
	fq1 = 0
	fq2 = 0
	fq3 = 0
	fq4 = 0
	fq5 = 0
	fq6 = 0
	
	
	Para i<-1 Hasta 1000 Con Paso 1 Hacer		
		cara = Aleatorio(1,6)
				
		Segun cara Hacer
			1:
				fq1<-fq1 + 1
			2:
				fq2<-fq2 + 1
			3:
				fq3<-fq3 + 1
			4:
				fq4<-fq4 + 1
			5:
				fq5<-fq5 + 1
			6:
				fq6<-fq6 + 1
		Fin Segun		
		
	Fin Para
	
	Escribir "Cara 	Frecuencia"
	Escribir " 1   Frecuencia " fq1
	Escribir " 2   Frecuencia " fq2
	Escribir " 3   Frecuencia " fq3
	Escribir " 4   Frecuencia " fq4
	Escribir " 5   Frecuencia " fq5
	Escribir " 6   Frecuencia " fq6
	
FinAlgoritmo
