package LaboratorioDePruebas;

public class ImprimirVariables {

    public static void ejecutarPrograma () {

        // Buscar más información en:
        // https://docs.oracle.com/javase/8/docs/api/java/util/Formatter.html#syntax

        // crear e inicializar las variables
        int a = 1;
        float b = 2.0F;
        double c = 3.141592653;
        String mensaje = "soy un string";
        boolean mentira = true;

        /*<-- USANDO System.out.printf -->*/
        /*
         * %d - para indicar un numero entero
         * %f - para indicar un numero decimal
         * %t - para indicar fecha/hora
         * %s - para indicar un String
         * %b - para indicar que es booleano
         * %n - para indicar un salto de linea
         */

        System.out.printf("--Usando printf--");
        System.out.printf("%n(esto es un int) %d",a);
        System.out.printf("%n(esto es un float) %.4f",b);// muestra decimal con 4 cifras
        System.out.printf("%n(esto es un double) %.0f",c);// muestra sin decimales
        System.out.printf("%n(esto es un String en minúscula) %s", mensaje);// muestra el String en minuscula
        System.out.printf("%n(esto es un String en mayúscula) %S", mensaje);// muestra el String en mayúscula
        System.out.printf("%n(esto es un booleano) %b",mentira);
        System.out.printf("%nint = %d, float = %.2f, double = %.0f, String = %s, boolean = %b",a,b,c,mensaje,mentira);
        System.out.printf ( "%nLa suma de las variables double y float es: %.2f%n", b + c );// muestra la suma con 2 cifras

        System.out.printf ( "%n" );//espacio en blanco

        /*<-- USANDO Syste.out.println -->*/
        System.out.println("--Usando println--");
        System.out.println("(esto es un int) " + a);
        System.out.println("(esto es un float) " + b);
        System.out.println("(esto es un double) " + c);
        System.out.println("(esto es un String) " + mensaje);
        System.out.println("(esto es un booleano) " + mentira);
        System.out.println("int = " + a + ", float = " + b + ", double = " + c + ", String = " + mensaje + ", boolean = " + mentira);
        System.out.println ("La suma del double y el float es: " + (b + c));

        System.out.printf ( "%n" );//espacio en blanco

        /*<-- USANDO System.out.print -->*/
        System.out.print("--Usando print--");
        System.out.printf ( "%n" );//espacio en blanco
        System.out.print("(esto es un int) " + a);
        System.out.println ("");
        System.out.print("(esto es un float) " + b);
        System.out.printf ( "%n" );//espacio en blanco
        System.out.print("(esto es un double) " + c);
        System.out.println ("");//espacio en blanco
        System.out.print("(esto es un String) " + mensaje);
        System.out.printf ( "%n" );//espacio en blanco
        System.out.print("(esto es un booleano) " + mentira);
        System.out.println ("");//espacio en blanco
        System.out.print("int = " + a + ", float = " + b + ", double = " + c + ", String = " + mensaje + ", boolean = " + mentira);


    }// fin-ejecutarPrograma

}// fin-ImprimirVariables
