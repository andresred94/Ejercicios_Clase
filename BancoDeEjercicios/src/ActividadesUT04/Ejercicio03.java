package ActividadesUT04;

public class Ejercicio03 {

    public static void ejecutarPrograma(){
        quiniela ();
    }// fin ejecutarPrograma
        private static char [] quiniela (){
        char [] quinGen = new char[15];// Array de 14 indices o 15 posiciones
        char [] prob = {'1','2','X'};
            System.out.printf ( "Resultados de la quiniela:%n" );
        for ( int i = 0 ; i < quinGen.length ; i++ ) {
            int nRan = (int) (Math.random () * 3);
            quinGen [i] = prob[nRan];
            System.out.printf ("Partido : %02d | Resultado : %C%n", i + 1, quinGen[i]);
        }
        return quinGen;
    }// fin quiniela

}// fin-class Ejercicio04
