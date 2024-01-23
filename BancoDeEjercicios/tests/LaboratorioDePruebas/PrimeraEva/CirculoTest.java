package LaboratorioDePruebas.PrimeraEva;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CirculoTest {

    public static Circulo c1;

    @BeforeAll
    public static void init (){
        c1 = new Circulo(3.5);
    }

    @Test
    public void calcAreaCirculo () {
        double resultado = c1.calcAreaCirculo ();
        c1.setArea ( resultado );
        assertEquals ( 38.48, resultado , 0.01);
    }

    @Test
    public void calcLongCirculo () {
        double resultado = c1.calcLongCirculo ();
        c1.setLongitud ( resultado );
        assertEquals ( 21.99 , resultado , 0.01);
    }
}