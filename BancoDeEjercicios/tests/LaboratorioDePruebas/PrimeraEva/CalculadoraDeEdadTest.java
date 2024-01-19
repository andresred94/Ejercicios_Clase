package LaboratorioDePruebas.PrimeraEva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraDeEdadTest {

    CalculadoraDeEdad calc1 = new CalculadoraDeEdad ();
    @Test
    void calcEdad () {
        calc1.setAnioN ( 1994 );
        calc1.calcEdad ();
        int resultado = calc1.getEdad ();
        assertEquals ( 30 , resultado );


    }
}