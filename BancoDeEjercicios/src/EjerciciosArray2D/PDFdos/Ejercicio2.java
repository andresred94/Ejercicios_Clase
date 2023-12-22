package EjerciciosArray2D.PDFdos;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {
    private static Scanner lector = new Scanner ( System.in );

    public static void main(String[] args) {
        int [][] matrixGen = generarMatriz();
        for (int i = 0; i < matrixGen.length; i++) {
            System.out.println(Arrays.toString(matrixGen[i]));
        }
    }

    private static int [][] generarMatriz (){
        System.out.printf("¿Cuantas filas y columnas quieres que tenga la matriz? = ");
        int longMatriz = lector.nextInt();

        int [][] matrix1 = new int [longMatriz][longMatriz];
        int [][] matrix2 = new int [longMatriz][longMatriz];

        System.out.printf("Rellena la primera matriz: %n");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.printf("Ingresa un número en la fila %d | columna %d = " , i + 1 , j + 1 );
                int nIn = lector.nextInt();
                matrix1[i][j] = nIn;
            }
        }



        System.out.printf("Rellena la segunda matriz: %n");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.printf("Ingresa un número en la fila %d | columna %d = " , i + 1 , j + 1 );
                int nIn = lector.nextInt();
                matrix2[i][j] = nIn;
            }
        }

        int [][] sumaMatrix = new int[longMatriz][longMatriz];
        System.out.printf("La suma de ambas matrices es: %n");
        for (int i = 0; i < sumaMatrix.length; i++) {
            for (int j = 0; j < sumaMatrix[i].length; j++) {
                int nSumado = matrix1[i][j] + matrix2[i][j];
                sumaMatrix[i][j] = nSumado;
            }
        }

        return sumaMatrix;
    }// fin generarMatriz

}// fin-class Ejercicio2
