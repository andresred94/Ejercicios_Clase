package LaboratorioDePruebas.PrimeraEva;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EsCapicuaTest {
    EsCapicua n1 = new EsCapicua ();
    int enteroCapicua = 1001;
    String cadenaCapicua = "1001";
    @Test
    void convierteAString () {
        n1.setNum ( enteroCapicua );
        String resultado = n1.convierteAString ();
        n1.setnNormal(resultado);
        assertEquals ( cadenaCapicua , resultado );
    }

    @Test
    void numCambiado () {
        n1.setNum(enteroCapicua);
        n1.setnNormal ( cadenaCapicua );
        String resultado = n1.convierteAString ();
        assertEquals ( cadenaCapicua , resultado );
    }
    @Test
    void siEsCapicua () {
        n1.setNum(enteroCapicua);
        n1.setnNormal ( cadenaCapicua );
        assertEquals ( true, n1.siEsCapicua ());
    }
}