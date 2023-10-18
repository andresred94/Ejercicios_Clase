/**
 * Este archivo Java representa un programa que permite al usuario ingresar un número y luego determina si ese número
 * es primo o no.
 * @autor Noelia Mena
 * @date 2023/09/26
 */

import java.util.Scanner;

public class EjerciciosDiagramaFlujo {

    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        //cuentaAtras();
        //cuadradoN();
        //notaFinal();
        //calcularInversión();
        //numerosPrimos();
        //diaSemana();
        //mayorQue();
        //asteriscos();
        //aleatorio();
        //cancion99BottlesOfBeer();
        //anioBiciesto();
        //fibonacci();
        //factorialN();
        //decimal_a_Binario();
        piedraPapelTijera();

    }

    private static void piedraPapelTijera() {
        int jugador, ordenador;

        do{
            System.out.println("Elige piedra(1), papel(2) o tijera(3)");
            jugador = entrada.nextInt();
        }while (jugador <= 0);

        ordenador = (int) (Math.random() * 3) + 1;
        System.out.println(ordenador);

        while (ordenador == 0){
            ordenador = (int) (Math.random() * 3) + 1;
        }

        if (jugador == ordenador) {
            System.out.println("Empate, el ordenador a elegido " + ordenador);
        } else if ((jugador == 1 && ordenador == 3) || (jugador == 2 && ordenador == 1) ||
                (jugador == 3 && ordenador == 2)) {
            System.out.println("Has ganado, el ordenador a elegido " + ordenador);
        } else if ((ordenador == 1 && jugador == 3) || (ordenador == 2 && jugador == 1) ||
                (ordenador == 3 && jugador == 2)) {
            System.out.println("Has perdido, el ordenador a elegido " + ordenador);
        }
    }

    private static void decimal_a_Binario() {
        int num, residuo, binario, base;

        binario = 0;
        base = 1;

        System.out.println("Escriba un número");
        num = entrada.nextInt();

        while (num < 0){
            System.out.println("Ingrese un número válido");
            num = entrada.nextInt();
        }

        while (num > 0){
            residuo = num % 2;
            binario = binario + residuo * base;
            num = num/2;
            base = base * 10;
        }

        System.out.println("Ese número en binario es " + binario);
    }

    private static void factorialN() {
        int num, factorial;

        factorial = 1;

        System.out.println("Escriba un número");
        num = entrada.nextInt();

        while (num <= 0){
            System.out.println("Ingrese un número válido");
            num = entrada.nextInt();
        }

        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
        }

        System.out.println("El factorial de " + num + " es " + factorial);
    }

    private static void fibonacci() {
        int a, b, c, num;

        a = 0;
        b = 1;

        System.out.println("Escribe un número");
        num = entrada.nextInt();

        while (num <= 0){
            System.out.println("Ingrese un número válido");
            num = entrada.nextInt();
        }

        while (b <= num){
            System.out.println(b);
            c = a + b;
            a = b;
            b = c;
        }
    }

    private static void anioBiciesto() {
        int anio, anioActual;

        anioActual = 2023;

        System.out.println("Introduce un año");
        anio = entrada.nextInt();

        while (anio < 0){
            System.out.println("Ingrese un año válido");
            anio = entrada.nextInt();
        }

        if (anio == anioActual) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " es bisiesto");
            }else {
                System.out.println("El año " + anio + " no es bisiesto");
            } 
        } else if (anio > anioActual) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " no será bisiesto");
            }else {
                System.out.println("El año " + anio + " será bisiesto");
            }
        } else if (anio < anioActual) {
            if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
                System.out.println("El año " + anio + " fue bisiesto");
            }else {
                System.out.println("El año " + anio + " no fue bisiesto");
            }
        }

    }

    private static void cancion99BottlesOfBeer() {
        int i;

        for (i = 99; i > 0; i--) {
            if (i <= 99 && i > 2) {
                System.out.println(i + " bottles of beer on the wall, " + i +
                        " bottles of beer. Take one down and pass it around, " + (i - 1) + " bottles of beer on the wall.");
            } else if (i == 2) {
                System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. Take one down and pass" +
                        " it around, " + (i - 1) + " bottle of beer on the wall.");
            } else if (i == 1) {
                System.out.println(i + " bottle of beer on the wall, " + i + " bottle of beer. Take one down and pass " +
                        "it around, no more bottles of beer on the wall.");
            }
        }

        if (i == 0) {
            i = 99;
            System.out.println("No more bottles of beer on the wall, no more bottles of beer. Go to the store and buy " +
                    "some more, " + i + " bottles of beer on the wall.");

        }
    }

    private static void aleatorio() {
        int num, ordenador;

        ordenador = (int) (Math.random() * 100) + 1;

        while (ordenador == 0){
            ordenador = (int) (Math.random() * 100) + 1;
        }

        do {
            System.out.println("Escribe un número del 1 al 100");
            num = entrada.nextInt();
        }while(num < 1);

        if (num == ordenador){
            System.out.println("Has acertado, el ordenador a elegido el " + ordenador);
        } else if (num !=  ordenador) {
            if (num < ordenador)
            System.out.println("No has acertado, tu número es menor, el ordenador a elegido " + ordenador);
            else if (num > ordenador) {
                System.out.println("No has acertado, tu número es mayor, el ordenador ha elegido el " + ordenador);
            }
        }
    }

    private static void asteriscos() {
        int j = 10;

        String h= String.valueOf('*');

        for (int i = 0; i < j; i++) {
            System.out.println(h);
            h += "*";
        }
    }

    private static void mayorQue() {
        int n1, n2, n3;

        System.out.println("Dime el 1er número:");
        n1 = entrada.nextInt();
        System.out.println("Dime el 2º número:");
        n2 = entrada.nextInt();
        System.out.println("Dime el 3er número:");
        n3 = entrada.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("El mayor es: " +n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("El mayor es: " +n2);
        } else if (n3 > n1 && n3 > n2) {
            System.out.println("El mayor es: " +n3);
        } else if (n1 == n2 || n1 == n3) {
            System.out.println("Son iguales");
        } else if (n2 == n1 || n2 == n3) {
            System.out.println("Son iguales");
        }else if (n3 == n1 || n3 == n2) {
            System.out.println("Son iguales");
        }
    }

    private static void diaSemana() {
        int dia;
        System.out.println("Dame un número y te diré el día de la semana");
        dia = entrada.nextInt();

        switch (dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Lunes");
                break;
            case 3:
                System.out.println("Martes");
                break;
            case 4:
                System.out.println("Miércoles");
                break;
            case 5:
                System.out.println("Jueves");
                break;
            case 6:
                System.out.println("Viernes");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Error, solo puedes poner números del 1 al 7");

        }

    }

    /**
     * Determina si un número ingresado por el usuario es primo o no.
     * Muestra un mensaje apropiado en función del resultado de la verificación.
     */
    private static void numerosPrimos() {
        int n = obtenerNumero(); // Obtiene un número del usuario llamando a la función obtenerNumero.
        int i = 2; // Inicializa un contador para comprobar si n es primo.
        int cantidad = 0; // Inicializa un contador para contar los divisores de n.

        if (n < 2) {
            System.out.println("El número " + n + " no es primo"); // Imprime un mensaje si n es menor que 2 y sale de
            // la función.
            return;
        }

        do {
            if (n % i == 0) { // Comprueba si i es un divisor de n.
                cantidad++; // Incrementa el contador de divisores si i es un divisor.
            }
            i++; // Incrementa i para comprobar el siguiente número.
        } while (i <= n);

        if (cantidad == 1) {
            System.out.println("El número " + n + " es primo"); // Imprime un mensaje si n tiene exactamente un divisor.
        } else {
            System.out.println("El número " + n + " no es primo"); // Imprime un mensaje si n tiene más de un divisor.
        }
    }

    private static void calcularInversión() {

        double inversion;
        double interesAnual;
        int numAnios;

        // Solicitar la cantidad a invertir
        do{
            System.out.print("Ingresa la cantidad a invertir: ");
            inversion = entrada.nextDouble();
        } while (inversion <= 0);

        // Solicitar la tasa de interés anual
        do{
            System.out.print("Ingresa la tasa de interés anual (en porcentaje): ");
            interesAnual = entrada.nextDouble() / 100.0; // Convertir a decimal
        } while (interesAnual <= 0);

        // Solicitar el número de años de inversión
        do{
            System.out.print("Ingresa el número de años de inversión: ");
            numAnios = entrada.nextInt();
        } while (numAnios <= 0);

        // Calcular y mostrar la rentabilidad cada año
        for (int i = 1; i <= numAnios; i++) {
            double rentabilidad = inversion * interesAnual;
            inversion += rentabilidad;

            System.out.println("Año " + i + ": Rentabilidad = " + rentabilidad + " - Total = " + inversion);
        }
    }

    private static void notaFinal() {
        double notaTeorica;  // Variable para almacenar la nota teórica.
        double notaPractica; // Variable para almacenar la nota práctica.

        do {
            System.out.println("Ingresa tu nota teórica:"); // Solicita la nota teórica al usuario.
            notaTeorica = entrada.nextDouble(); // Lee la nota teórica ingresada por el usuario.
        } while (notaTeorica < 0 || notaTeorica > 10); // Repite si la nota teórica está fuera del rango válido (0-10).

        do {
            System.out.println("Ingresa tu nota práctica:"); // Solicita la nota práctica al usuario.
            notaPractica = entrada.nextDouble(); // Lee la nota práctica ingresada por el usuario.
        } while (notaPractica < 0 || notaPractica > 10); // Repite si la nota práctica está fuera del rango válido (0-10).

        double notaFinal = (notaTeorica * 0.4) + (notaPractica * 0.6); // Calcula la nota final.

        System.out.printf("Tu nota final es %.2f. Eso es: ", notaFinal); // Muestra la nota final con dos decimales.
        if (notaFinal < 5) {
            System.out.println("Insuficiente.");
        } else if (notaFinal < 6) {
            System.out.println("Suficiente.");
        } else if (notaFinal < 7) {
            System.out.println("Buena.");
        } else if (notaFinal < 9) {
            System.out.println("Notable.");
        } else {
            System.out.println("Sobresaliente.");
        }
    }

    /**
     * Calcula el cuadrado de N primeros números
     */
    private static void cuadradoN() {
        int n = obtenerNumero(); // Obtiene un número del usuario llamando a la función obtenerNumero.
        int cuadrado;// Guardará el cuadrado de num
        int i = 0;

        while (i <= n) { // Repetimos el proceso mientras que i sea menor o igual que el número leído
            cuadrado = i * i;
            System.out.println("El cuadrado de "+ i + " es " + cuadrado);
            i++; // Incrementamos i en cada iteración
        }
    }

    /**
     * Solicita un número al usuario y realiza una cuenta regresiva desde ese número hasta cero.
     * El número ingresado por el usuario determina el punto de inicio de la cuenta regresiva.
     * @see EjerciciosDiagramaFlujo#obtenerNumero()
     */
    private static void cuentaAtras() {
        int n = obtenerNumero(); // Obtiene un número del usuario llamando a la función obtenerNumero.
        int i = 0;

        while (n >= i) { // Mientras el número n sea mayor o igual que i...
            System.out.println(n); // Imprime el valor de n.
            n--; // Decrementa n en 1 en cada iteración.
        }
    }

    /**
     * Obtiene un número entero no negativo ingresado por el usuario.
     * @return El número entero no negativo ingresado por el usuario.
     */
   private static int obtenerNumero() {
        int numero;

        do {
            System.out.println("Escribe un número:"); //
            while (!entrada.hasNextInt()) { // Mientras no se ingrese un entero válido:
                System.out.println("Por favor, introduce un número válido:"); // Solicita al usuario que ingrese un
                // número válido.
                entrada.next(); // Descarta la entrada no válida.
            }
            numero = entrada.nextInt(); // Obtiene el número válido ingresado por el usuario.
        } while (numero < 0); // Continúa solicitando un número hasta que se ingrese uno no negativo.

        return numero; // Devuelve el número válido ingresado por el usuario.
    }

    /*private static int obtenerNumero() {
        int numero;

        do {
            System.out.println("Escribe un número:");
            if (entrada.hasNextInt()) {
                numero = entrada.nextInt();
                if (numero >= 0) {
                    break;
                } else {
                    System.out.println("Por favor, introduce un número no negativo:");
                }
            } else {
                System.out.println("Por favor, introduce un número válido:");
                entrada.next(); // Descarta la entrada no válida.
            }
        } while (true);

        return numero;
    }*/
}
