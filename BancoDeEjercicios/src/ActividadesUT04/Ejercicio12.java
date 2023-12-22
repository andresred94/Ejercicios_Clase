package ActividadesUT04;

public class Ejercicio12 {

    public static void ejecutarPrograma(){
        int [] notasAlu = {1,2,3,4,5};
        int mediaAlu = obtenerMedia(notasAlu);

        System.out.printf("La nota media del alumno es : %d" , mediaAlu);

    }// fin ejecutarPrograma

    private static int obtenerMedia(int [] array1D){
        int suma = 0;
        int media = 0;
        for (int i = 0; i < array1D.length ; i++) {
            suma = suma + array1D[i];
        }

        Math.floor(media = suma / array1D.length);

        return media;
    }// fin obtenerMedia

}// fin-class Ejercicio12
