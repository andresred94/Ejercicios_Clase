package LaboratorioDePruebas.PrimeraEva;

import java.util.Locale;
import java.util.Scanner;

public class MenuFunciones {
    //atributos
    private static Scanner lector = new Scanner(System.in);

    public static void ejecutarMenu() {
        int opEscogida;
        do {
            System.out.printf("1) divisionEntera%n");
            System.out.printf("2) calculaIVA%n");
            System.out.printf("3) salario%n");
            System.out.printf("4) salir%n");
            System.out.printf("Seleccione una opción para ejecutar una función = ");
            opEscogida = obtenerEntero1_5();

            if (opEscogida == 1) {
                System.out.printf("Introduce el primer operador = ");
                int dividendo = obtenerEnteroPos();
                System.out.printf("Introduce el segundo operador = ");
                int divisor = obtenerEnteroPos();
                System.out.printf("La division entre %d y %d es %d%n", dividendo, divisor, divisionEntera(dividendo, divisor));
            } else if (opEscogida == 2) {
                System.out.printf("Ingresa el importe positivo en euros = ");
                double imp = obtenerDecimalPos();
                System.out.printf("Ingresa el IVA (entre 0.00 y 1.00) = ");
                double iva = obtenerDecimalPos();
                double resp = imp + (calcularIva(imp, iva));
                System.out.printf("El importe ingresado con el IVA indicado añadido es = %.2f€%n", resp);
            } else if (opEscogida == 3) {
                double resp;

                // inicio
                System.out.printf("Ingresa la cantidad de horas que has trabajado = ");
                double hIngresadas = obtenerDecimalPos();

                // control errores
                while (hIngresadas < 0 || hIngresadas > 144) {
                    System.out.printf("Error : no has ingresado horas válidas. Vuelve a ingresar otro valor = ");
                    hIngresadas = obtenerDecimalPos();
                }

                System.out.printf("Ingresa el precio en euros por cada hora = ");
                double pIngresado = obtenerDecimalPos();

                // control errores
                while (pIngresado < 0) {
                    System.out.printf("Error : no has ingresado un precio válido. Vuelve a ingresar otro valor = ");
                    pIngresado = obtenerDecimalPos();
                }

                // calcula las horas convencionales y extras
                if (hIngresadas > 40) {
                    resp = salario(40, pIngresado);
                    System.out.printf("Tu salario esa semana sin contar las horas extras es de %.0f€%n", resp);
                    resp = resp + (salario(Math.abs(40 - hIngresadas), (pIngresado * 1.5)));
                    System.out.printf("Tu salario esa semana con el 50%% más por cada hora extra adicional es de %.0f€%n", resp);

                } else {
                    resp = salario(hIngresadas, pIngresado);
                    System.out.printf("Tu salario esa semana es de %.0f€%n", resp);
                }
            } else {
                System.out.printf("¡Adiós!");
            }

        } while (opEscogida != 4);


    }// fin ejecutarMenu

    private static int divisionEntera(int dividendo, int divisor) {
        int respuesta;
        if (divisor == 0) {
            System.out.printf("%nEl divisor es 0");
            respuesta = 0;
        } else {
            respuesta = dividendo / divisor;
        }
        return respuesta;
    }// fin divisionEntera

    private static double salario(double horas, double pHora) {
        double resp = horas * pHora;
        return resp;
    }

    private static double calcularIva(double importe, double iva) {
        double resp = importe * iva;
        return resp;
    }// fin calcularIva

    private static int obtenerEntero1_5() {
        int n = lector.nextInt();
        if (n < 0 || n > 4) {
            n = -1;
        }
        return n;
    }// fin obtenerEntero1_5

    private static int obtenerEnteroPos() {
        int n = lector.nextInt();
        if (n < 0) {
            n = -1;
        }
        return n;
    }// fin pedirEntero

    private static double obtenerDecimalPos() {
        lector.useLocale(Locale.ENGLISH);// permite leer un double con punto
        double n = lector.nextDouble();
        if (n < 0) {
            n = -1;
        }
        return n;
    }// fin pedirDecimal
}// fin-class MenuFunciones
