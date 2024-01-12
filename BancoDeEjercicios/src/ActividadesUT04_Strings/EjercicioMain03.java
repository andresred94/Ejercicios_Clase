package ActividadesUT04_Strings;

public class EjercicioMain03 {

    public static void main ( String[] args ) {
        double media = 0;
        for ( int i = 0 ; i < args.length ; i++ ) {
            double n = Double.parseDouble ( args[i] );
            media = media + n;
        }
        double total = media / args.length;
        System.out.printf ("La nota media es %.1f" , total);

    }// fin main
}// fin-class EjercicioMain03
