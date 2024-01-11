package ActividadesUT04_Strings;

public class EjercicioTexto14 {
    public static void main(String[] args) {
        String palabara1 = "holaaaaaaaaaa";
        String palabara2 = "adios";
        System.out.println(unirCadena(palabara1,palabara2));

    }
    private static String unirCadena(String cad1, String cad2){

        char[] entrelazadas = new char[cad1.length() + cad2.length()];

        int index = 0;
        // recorremos ambas palabras con un solo for
        for (int i = 0, j = 0; i < cad1.length() || j < cad2.length(); i++, j++) {
            // ingresamos el primer caracter de la primera palabra en la primera posicion
            if (i < cad1.length()) {
                entrelazadas[index++] = cad1.charAt(i);
            }
            // la primera letra de la segunda palabra se guarda en la seguda posicion del array
            if (j < cad2.length()) {
                entrelazadas[index++] = cad2.charAt(j);
            }

        }// fin for

        return new String ( entrelazadas );
    }// fin unirCadena
}// fin-class EjercicioTexto14
