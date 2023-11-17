package ActividadesUT03.BucleFor;
public class Ejercicio2_1 {

    public static void ejecutarPrograma(){
        int impares = contarImpares(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Cantidad de números impares: " + impares);
    }// fin ejecutarPrograma

    private static int contarImpares(int... numeros) {
        int impares = 0;

        for (int n : numeros) {
            if (n % 2 != 0) {
                impares++;
            }
        }

        return impares;
    }
}// fin-class Ejercicio2_1
