package ActividadesUT04_Strings;

public class EjercicioMain04 {

    public static void main ( String[] args ) {

        for ( int i = 0 ; i < args.length ; i++ ) {
            if (args.length > 0){
                int n = Integer.parseInt(args[0]);
                for (int j = 0; j < n; j++) {
                    System.out.println("Modulo ejecutandose.");
                }
            }
        }

        if (args.length == 0){
            System.out.println("No se han ingresado parametros en la función main.");
        }

    }// fin main

}// fin-class EjercicioMain04
