package LaboratorioDePruebas.PrimeraEva;
import java.time.LocalDate;

public class CalculadoraDeEdad {

    //atributos
    private int anioA, anioN, edad;
    private LocalDate fechaActual = LocalDate.now();

    // métodos contructores
    public CalculadoraDeEdad(){
        this.anioA =fechaActual.getYear();
    }

    // setter y getter
    public int getAnioA () {
        return anioA;
    }

    public int getAnioN () {
        return anioN;
    }
    public void setAnioN ( int anioN ) {
        this.anioN = anioN;
    }
    public int getEdad () {
        return edad;
    }

    //<-- Metodo principal -->//
    public void calcEdad() {
        this.edad = this.anioA - this.anioN;
    }// fin ejecutarPrograma



}// fin-class CalcularEdad
