package ActividadesUT04_Strings;

public class EjercicioMain01 {

    public static void main ( String[] args ) {
        // Verifica si se han pasado parámetros
        if (args.length > 0) {
            //System.out.println ("Parametros recibidos:");
            System.out.printf("Parámetros recibidos:%n");
            // Imprime cada parámetro
            for (int i = 0; i < args.length; i++) {
                System.out.printf("Parámetro %d : %s%n" , i + 1 , args[i]);
            }
        } else {
            System.out.println("No se han recibido parámetros.");
        }

    }// fin main

}// fin-class EjercicioMain01
