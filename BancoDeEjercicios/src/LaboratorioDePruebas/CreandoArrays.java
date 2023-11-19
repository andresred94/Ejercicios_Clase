package LaboratorioDePruebas;

public class CreandoArrays {

    public static void ejecutarPrograma (){
        int [] MiArray = {1,2,3,4,5};

        // MiArray.length - 1 --> porque el indice empieza en 0
        for ( int i = MiArray.length - 1 ; i >= 0 ; i-- ) {
            System.out.printf("Elemento en la posición %d : %d%n" , i , MiArray[i]);
        }

    }// fin ejecutarPrograma

}// fin-class CreandoArrays
