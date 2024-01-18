package ActividadesUT04_Strings;

import java.util.Scanner;

public class EjercicioTexto19 {
    private static Scanner lector = new Scanner(System.in);
    public static void main(String[] args) {
        String palAdiv = "Informatica";
        String pal = "";

        boolean esCierto = false;
        boolean adivinada = false;


        do {
            System.out.print("Ingresa una letra para adivinar la palabra = ");
            char c = lector.next().charAt(0);
            for (int i = 0; i < palAdiv.length(); i++) {
                if (c == palAdiv.charAt(i)){
                    esCierto = true;
                } else {
                  esCierto = false;
                }
            }
            if (esCierto){
                pal += c;
                System.out.println(pal);
            }


            if (palAdiv.length() == pal.length()){
                adivinada = true;
            }
            if (adivinada){
                System.out.println(pal);
            }


        } while (!adivinada);
    }
}// fin-class Ejercicio19
