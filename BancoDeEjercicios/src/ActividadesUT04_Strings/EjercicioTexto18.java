package ActividadesUT04_Strings;

public class EjercicioTexto18 {

    public static void main ( String[] args ) {
        String frase1 ="z";
        String frase2 ="Hw wx, Euxwh?";
        int cod1 = 3;
        int cod2 = -3;
        System.out.println (cifrarCesar ( frase1,cod1 ));
        System.out.println (cifrarCesar ( frase2,cod2 ));
    }// fin main

    private static String cifrarCesar(String cadena, int codigo){
        String abcMay = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String abcMin = "abcefghijklmnopqrstuvwxyz";
        String rsp = "";

        for ( int i = 0 ; i < cadena.length () ; i++ ) {
            char carCad = cadena.charAt(i);
            char carCif = carCad;

            if (Character.isUpperCase(carCad)) {
                int indc = (abcMay.indexOf(carCad) + codigo) % abcMay.length();// % para evitar que se vaya de rango
                carCif = abcMay.charAt(indc);
            } else if (Character.isLowerCase(carCad)) {
                int indc = (abcMin.indexOf(carCad) + codigo) % abcMin.length();
                carCif = abcMin.charAt(indc);
            }
            /*
            if ( codigo > 0 ){
                if (Character.isUpperCase(carCad)) {
                    int indc = (abcMay.indexOf(carCad) + codigo) % abcMay.length();// % para evitar que se vaya de rango
                    carCif = abcMay.charAt(indc);
                } else if (Character.isLowerCase(carCad)) {
                    int indc = (abcMin.indexOf(carCad) + codigo) % abcMin.length();
                    carCif = abcMin.charAt(indc);
                }
            } else {
                if (Character.isUpperCase(carCad)) {
                    int indc = (abcMay.indexOf(carCad) - codigo) % abcMay.length();// % para evitar que se vaya de rango
                    carCif = abcMay.charAt(indc);
                } else if (Character.isLowerCase(carCad)) {
                    int indc = (abcMin.indexOf(carCad) - codigo) % abcMin.length();
                    carCif = abcMin.charAt(indc);
                }
            }*/

            rsp += carCif;
        }
        return rsp;
    }// fin cifrarCesar

}// fin-class EjercicioTexto18
