package EjerciciosPseint;

public class BucleCancion {

    //-- METODOS PRINCIPALES --//
    public static void ejecutarPrograma(){
        for (int i = 99; i >= 1 ; i--) {
            System.out.printf("%n%d bottles of beer on the wall, %d bottles of beer,",i,i);
            System.out.printf("Take one down and pass it around, "+ (i -1 ) +" bottles of beer on the wall");
        }
    }// fin ejecutarPrograma

}// fin BucleCancion
