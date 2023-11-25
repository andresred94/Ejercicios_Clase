package ActividadesUT04;

public class Ejercicio22 {

    public static void ejecutarPrograma(){

    loterialNavidad ();

    }// fin ejecutarPrograma

    private static int [][] loterialNavidad(){
        int [] numAlea = new int[1807];


        for ( int i = 0 ; i < numAlea.length ; i++ ) {
            int nRan = (int) (Math.random () * 99999 + 1);
            numAlea[i] = nRan;
            while ( contieneNumero ( numAlea , nRan ) ) {
                nRan = (int) (Math.random () * 99999 + 1);
            }
        }// fin for

        int [][] premiados = new int [5][2];
        int numPremiados = 5;

        for ( int i = 0 ; i < numPremiados ; i++ ) {

            for ( int j =  0 ; j < premiados.length ; j++ ) {
                for ( int k = 0 ; k < premiados[i].length ; k++ ) {
                    premiados[j][k] = numAlea[i];
                }
            }
            System.out.printf ( "%dº número premiado : %d" , i + 1 , numAlea[i]);
            System.out.println ();
        }



        return premiados;
    }// fin-class loterialNavidad

    private static boolean contieneNumero ( int[] array1D , int numero ) {
        for ( int i = 0 ; i < array1D.length ; i++ ) {
            if ( array1D[i] == numero ) {
                return true;
            }
        }
        return false;
    }// fin contieneNumero



}// fin-class Ejercicio22
