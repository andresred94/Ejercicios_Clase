package EjerciciosCadenas;

public class Ejercicio4 {

    public static void main(String[] args) {
        String cadena = "Andres111";
        int cont = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))){
                cont++;
            }

        }


        int cantLetras = cadena.length() - cont;
        System.out.printf("La cadena contiene %d caracteres." , cantLetras);



    }

}// fin-class Ejercicio4

