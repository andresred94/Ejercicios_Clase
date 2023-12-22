package EjerciciosArray2D.PDFdos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    private static Scanner lector = new Scanner ( System.in );

    public static void main(String[] args) {

        int [][] matrix = generarMatriz();

        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }

    }

    private static int [][] generarMatriz (){
        System.out.printf("¿Cuantas columnas quieres que tenga cada fila? = ");
        int ncolum = lector.nextInt();

        int [][] matrixGen = new int [5][ncolum];

        for (int i = 0; i < matrixGen.length; i++) {
            for (int j = 0; j < matrixGen[i].length; j++) {
                matrixGen[i][j] = (int)(Math.random() * 100 + 1);
            }
        }

        return matrixGen;
    }// fin generarMatriz

}// fin-class Ejercicio1
