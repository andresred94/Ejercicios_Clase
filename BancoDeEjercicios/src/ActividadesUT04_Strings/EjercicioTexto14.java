package ActividadesUT04_Strings;

public class EjercicioTexto14 {
    public static void main(String[] args) {
        String palabara1 = "hola";
        String palabara2 = "adios";
        System.out.println(unirCadena(palabara1,palabara2));

    }

    private static String unirCadena(String cad1, String cad2){
        int cont1 = 0;
        int cont2 = 0;
        char [] entrelazadas = new char[cad1.length() + cad2.length()];
        for (int i = 0; i < entrelazadas.length; i++) {
            char p1 = cad1.charAt(cont1);
            entrelazadas[i] = p1;
            cont1++;
            char p2 = cad2.charAt(cont2);
            entrelazadas[i] = p2;
            cont2++;
        }
        String rsp = entrelazadas.toString();
        return rsp;
    }// fin unirCadena


}// fin-class EjercicioTexto14
