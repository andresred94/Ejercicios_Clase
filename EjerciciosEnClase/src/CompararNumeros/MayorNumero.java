package CompararNumeros;

public class MayorNumero {

    /**
     * funcion a la que se le ingresa tres números como parámetro
     * y comprueba cual es el mayor de los tres
     * @param n1
     * @param n2
     * @param n3
     */
    public static int  algoritmo1 (int n1, int n2, int n3){
        return n3 > ( n1 > n2 ? n1 : n2) ? n3 : ( n1 > n2 ? n1 : n2 ) ;
    }// fin algoritmo2
}// fin MayorNumero
