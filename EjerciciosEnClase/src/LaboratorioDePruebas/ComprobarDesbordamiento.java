package LaboratorioDePruebas;

public class ComprobarDesbordamiento {

    public static void ejecutarPrograma (){
        short i = 32767;
        short desb = ++i;
        System.out.println( desb );

    }// fin ejecutarPrograma

}// fin-class ComprobarDesbordamiento
