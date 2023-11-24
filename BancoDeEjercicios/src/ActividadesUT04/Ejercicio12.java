package ActividadesUT04;

public class Ejercicio12 {

    public static void ejecutarPrograma(){
        int [] notasAlu = {2,2,2,2,2};
        int mediaAlu = obtenerMedia(notasAlu);

        System.out.printf("La nota media del alumno es : %d" , mediaAlu);

    }// fin ejecutarPrograma

    private static int obtenerMedia(int [] array1D){
        int media = 0;
        for (int i = 0; i < array1D.length ; i++) {
            media = media + array1D[i];
        }
        media = media / array1D.length;

        Math.floor(media);

        return media;
    }// fin obtenerMedia

}// fin-class Ejercicio12
