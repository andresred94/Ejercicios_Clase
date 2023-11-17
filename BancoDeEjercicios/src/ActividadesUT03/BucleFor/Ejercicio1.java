package ActividadesUT03.BucleFor;

public class Ejercicio1 {

    public static void bucleFor01(){
        int suma , i , j;
        for ( i = 1 ; i < 5 ; i ++) {
            System.out.printf ( "%nEl valor de i es %d%n" , i );
            // hasta que no termina este bucle no suma 1 a i
            for ( j = 3 ; j >= 0 ; j-- ){
                suma = i  * 10 + j;
                System.out.printf ( "(i * 10 + j ) = %d%n" , suma );
            }
        }

    }// fin ejecutarPrograma

}// fin-class Ejercicio1
