package LaboratorioDePruebas.ProgDeObjetos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {
    Persona p1 = new Persona ();

    // testeando setter y getters de la clase Persona
    @Test
    void setNombre () {
        String esperado = "Andrés";// Si ingreso un entero no pasa el test
        p1.setNombre ( esperado );
        String resultado = p1.getNombre ();
        assertEquals ( resultado , esperado );
    }

    @Test
    void setEdad () {
        int esperado = 28;// Si ingreso un número negativo no pasa el test
        p1.setEdad ( esperado );
        int resultado = p1.getEdad ();
        assertEquals ( resultado , esperado );
    }

    @Test
    void setEstatura () {
        double esperado = 1.60;// Si ingreso una estatura negativa no pasa el test
        p1.setEstatura ( esperado );
        double resultado = p1.getEstatura ();
        assertEquals ( resultado , esperado );

    }

    @Test
    void setDni () {
        String esperado = "52053342H";// Si ingreso más de 9 caracteres no pasa el test
        p1.setDni ( esperado );
        String resultado = p1.getDni ();
        assertEquals ( esperado , resultado );
    }
}