package ActividadesUT03.BucleFor;

public class Ejercicio9 {

    public static void imprimirTriangulo(int n) {
        System.out.printf("%nImprime un triángulo ascendente de asteriscos%n");

        if (n >= 0) {
            for (int i = 1; i <= n; i += 2) {
                // Espacios en blanco para alinear el triángulo
                for (int k = 0; k < (n - i) / 2; k++) {
                    System.out.print(" ");
                }

                // Asteriscos con cantidad impar
                for (int j = 0; j < i; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        } else {
            System.out.printf("Error: has ingresado un valor no válido.");

        }
    }

}// fin-class Ejercicio9
