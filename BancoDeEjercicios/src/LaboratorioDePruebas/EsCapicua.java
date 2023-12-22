package LaboratorioDePruebas;

public class EsCapicua {
    public static void ejecutarPrograma (){
        int num = 1221;
        String pal = Integer.toString ( num );
        System.out.println (numCambiado ( pal ));
        System.out.println (siEsCapicua ( num ));
    }// fin ejecutarPrograma

    private static boolean siEsCapicua (int num){

        boolean esCierto = false;
        String numero = Integer.toString ( num );
        if ( numero.equals ( numCambiado ( numero ) ) ){
            esCierto = true;
        }
        return esCierto;
    }

    private static String numCambiado (String num){

        String pal = "";
        // recorremos el String
        for ( int i = num.length () - 1 ; i >= 0 ; i-- ) {
            pal = pal + num.charAt ( i );
        }
        System.out.printf ( "%s " , pal );
        return pal;
    }
}
