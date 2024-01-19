package LaboratorioDePruebas.PrimeraEva;

public class EsCapicua {
    // atributos
    private static int num;
    private static String nNormal = "";
    private static String nCambiado = "";

    // setters y getters

    public static void setNum ( int num ) {
        EsCapicua.num = num;
    }
    public static String getnNormal () {
        return nNormal;
    }
    public static void setnCambiado ( String nCambiado ) {
        EsCapicua.nCambiado = nCambiado;
    }
    public static void setnNormal ( String nNormal ) {
        EsCapicua.nNormal = nNormal;
    }

    // constructores
    public EsCapicua(){}

    // métodos de la clase
    public String convierteAString(){
        return this.nNormal = Integer.toString ( num );
    }
    public boolean siEsCapicua (){
        boolean esCierto = false;
        if ( nNormal.contains ( nCambiado ) ){
            esCierto = true;
        }
        return esCierto;
    }

    public String numCambiado (){
        String rsp = "";
        // recorremos el String
        for ( int i = nNormal.length () - 1 ; i >= 0 ; i-- ) {
            rsp += nNormal.charAt ( i );
        }
        return rsp;
    }
}
