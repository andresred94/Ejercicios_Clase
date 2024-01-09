package ActividadesUT04_Strings;

public class EjercicioTexto07 {

    public static void main ( String[] args ) {

        System.out.println (puntuacionScrabble ( "niño" ));
        System.out.println (puntuacionScrabble ( "hola" ));

    }// fin main

    private static int puntuacionScrabble(String palabra){
        palabra.toLowerCase ();
        int ptotal = 0;
        for ( int i = 0 ; i < palabra.length () ; i++ ) {
            switch (palabra.charAt(i) ){
                case 'a','e','i','o','u','l','n','r','s','t':
                    ptotal = ptotal + 1;
                    break;
                case 'd','g':
                    ptotal = ptotal + 2;
                    break;
                case 'b','c','m','p':
                    ptotal = ptotal + 3;
                    break;
                case 'f','h','v','w','y':
                    ptotal = ptotal + 4;
                    break;
                case 'k':
                    ptotal = ptotal + 5;
                    break;
                case 'j','x','ñ':
                    ptotal = ptotal + 8;
                    break;
                case 'q','z':
                    ptotal = ptotal + 10;
                    break;
                default:
                    ptotal = -1;
            }// fin switch
        }// fin for

        return ptotal;
    }// fin puntuacionScrabble

}// fin class EjercicioTexto07
