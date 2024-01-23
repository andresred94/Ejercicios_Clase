package LaboratorioDePruebas.Arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Array1DSumaTest {
    Array1DSuma a1 = new Array1DSuma ();
    int [] Array1 =  {1,2,3,4,5};
    int [] Array2 =  {1,2,3,4,5};

    @Test
    void sumaArrays () {
        int [] resultado = a1.sumaArrays ( Array1 , Array2 );
        int [] esperado = {2,4,6,8,10};
        assertArrayEquals ( esperado , resultado );
    }
}// fin-class Array1DSumaTest