package LaboratorioDePruebas.PrimeraEva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiaDeLaSemanaTest {
    DiaDeLaSemana d1 = new DiaDeLaSemana ();
    int lunes = 1;
    int error = 8;
    @Test
    void comrobarDia () {
        d1.setDiaS ( lunes );
        assertEquals ( "Lunes",d1.comprobarDia () );
    }

    @Test
    void comprobarDia () {
        d1.setDiaS ( error );
        assertEquals ( "Error: no has ingresado un dia valido", d1.comprobarDia () );
    }
}