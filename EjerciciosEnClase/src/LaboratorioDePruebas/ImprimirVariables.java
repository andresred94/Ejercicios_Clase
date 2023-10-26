package LaboratorioDePruebas;

public class ImprimirVariables {

    public static void ejecutarPrograma () {
        int a = 1;
        float b = 2.0F;
        double c = 1.0;
        String mensaje = "soy un String";
        boolean mentira = true;

        /** USANDO printf **/
        /**
         * %d - para indicar un numero entero
         * %f - para indicar un numero decimal
         * %t - para indicar fecha/hora
         * %s - para indicar un String
         * %b - para indicar que es booleano
         * %n - para indicar un salto de linea
         */
        System.out.printf("--Usando printf--%n");
        System.out.printf("(esto es un int) %d",a);
        System.out.printf("%n(esto es un float) %f",b);
        System.out.printf("%n(esto es un double) %f",c);
        System.out.printf("%n(esto es un String) %s", mensaje);
        System.out.printf("%n(esto es un booleano) %b%n",mentira);
        System.out.printf("int %d, float %.2f, double %.3f, String %s, boolean %b%n",a,b,c,mensaje,mentira);


        /** USANDO println **/
        System.out.println("--Usando println--");
        System.out.println("(esto es un int) " + a);
        System.out.println("(esto es un float) " + b);
        System.out.println("(esto es un double) " + c);
        System.out.println("(esto es un String) " + mensaje);
        System.out.println("(esto es un booleano) " + mentira);
        System.out.println("int " + a + ", float " + b + ", double " + c + ", String " + mensaje + ", boolean " + mentira);



    }// fin-ejecutarPrograma

}// fin-ImprimirVariables
