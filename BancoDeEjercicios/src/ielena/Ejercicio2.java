package ielena;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner lector = new Scanner(System.in);

    public static void main(String[] args) {
        // a
        int salDesActu [] = {1080,1500,1110};
        int salActu [] = acutalizarSalario(salDesActu);
        System.out.println(Arrays.toString(salActu));
        //b
        char [] trajadores = {'A','R','F','L','M'};
        int [] sueldos = {1112,1250,1112,1324,1563};
        imprimirTrabajadoresSueldos(trajadores,sueldos);

    }

    public static int [] acutalizarSalario(int [] num){

        for (int i = 0; i < num.length; i++) {
            while (num[i] < 1112){
                System.out.printf("El salario en la posicion %d es %d. Introduce otro = " , i + 1 , num[i]);
                int salIn = lector.nextInt();
                num[i] = salIn;
            }
        }
        return num;
    }// calcularSalario

    public static void imprimirTrabajadoresSueldos(char [] t , int [] s ){
        for (int i = 0; i < t.length; i++) {
            if (s[i] > 1112){
                System.out.printf("El trabajador %c recibe un sueldo de %d.%n" , t[i] , s[i]);
            }
        }
    }



}// Ejercicio2
