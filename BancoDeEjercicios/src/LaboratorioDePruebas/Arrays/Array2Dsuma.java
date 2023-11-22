package LaboratorioDePruebas.Arrays;

public class Array2Dsuma {

    public static void main(String[] args) {
        // Ejemplo de uso
        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.printf ( "Matriz 1%n" );
        imprimirMatriz ( matriz1 );
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
        System.out.printf ( "Matriz 2%n" );
        imprimirMatriz ( matriz2 );

        int[][] resultado = sumarMatrices(matriz1, matriz2);

        // Imprimir el resultado
        imprimirMatriz(resultado);
    }

    // Función para sumar dos matrices
    public static int[][] sumarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;

        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        return resultado;
    }

    // Función para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}// fin-class Array2Dsuma
