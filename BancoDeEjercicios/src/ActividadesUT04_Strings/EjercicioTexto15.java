package ActividadesUT04_Strings;

public class EjercicioTexto15 {
    public static void main ( String[] args ) {
        int dni = 52053342;
        System.out.println (obtenerNIF ( dni ));
    }

    /**
     * Funcion que recibe un entero que es un número de DNI sin signo.
     * y devuelve con el número acompañado del signo.
     * @param dni entero que representa el número de dni sin signo
     * @return número de dni con el signo incluido
     */
    private static String obtenerNIF(int dni){
        String letreas = "TRWAGMYFPDXBNJZSQVHLCKE";
        int numResto = dni % 23;
        String resp = Integer.toString ( dni );// pasamos el entero a String
        resp += letreas.charAt ( numResto );
        return resp;
    }

}// fin-class EjercicioTexto15
