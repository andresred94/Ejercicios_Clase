package LaboratorioDePruebas.Arrays;

public class ArrayConCaracteres {
    public static void main(String[] args) {
        char [] nVocales = {'a','b','d','e','i'};
        int resp = comprobarVocales(nVocales);
        System.out.printf("Hay %d vocales%n" , resp);
    }

    private static int comprobarVocales (char [] caract){
        int contVocales = 0;

        for (int i = 0; i < caract.length; i++) {
            char ch = caract[i];
            switch (ch){
                case 'a','A':
                    contVocales++;
                    break;
                case 'e','E':
                    contVocales++;
                    break;
                case 'i','I':
                    contVocales++;
                    break;
                case 'o','O':
                    contVocales++;
                    break;
                case 'u','U':
                    contVocales++;
                    break;
                default:
                    break;
            }
        }

        return contVocales;

    }// fin comprobarVocales
}// fin-class ArrayConCaracteres
