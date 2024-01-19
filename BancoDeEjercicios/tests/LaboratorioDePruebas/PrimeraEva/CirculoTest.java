package LaboratorioDePruebas.PrimeraEva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    Circulo c1 = new Circulo ();

    @Test
    void calcAreaCirculo () {
        c1.setRadio ( 3.5 );
        double resultado = c1.calcAreaCirculo ();
        c1.setArea ( resultado );
        assertEquals ( 38.48, resultado , 0.01);
    }

    @Test
    void calcLongCirculo () {
        c1.setRadio ( 3.5 );
        double resultado = c1.calcLongCirculo ();
        c1.setLongitud ( resultado );
        assertEquals ( 21.99 , resultado , 0.01);
    }
}