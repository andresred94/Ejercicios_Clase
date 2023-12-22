package EjerciciosCadenas;

public class Ejercicio3 {

    public static void main ( String[] args ) {

        String cad = "Arriba la birra";
        cad.toLowerCase ();
        char letra = 'i';
        int cont = 0;

        for ( int i = 0 ; i < cad.length () ; i++ ) {
            if ( cad.charAt ( i ) == letra ){
                cont++;
            }
        }



        System.out.printf ( "El caracter \"%c\" se repite %d veces." , letra , cont  );

    }// fin main
    
}// fin-class Ejercicio3
