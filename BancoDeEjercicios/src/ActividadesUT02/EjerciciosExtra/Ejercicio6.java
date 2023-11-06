package ActividadesUT02.EjerciciosExtra;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ejercicio6 {
    protected static void ejecutarPrograma () {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
        double tarifaPorHora = 10.0; // Cambia esto a tu tarifa por hora.

        double salarioTotal = 0.0;

        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingresa el día de la semana (1-Lunes, 2-Martes, ..., 7-Domingo): ");
            int diaSemana = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer de entrada

            System.out.print("Ingresa la hora de inicio (HH:mm): ");
            String horaInicioStr = scanner.nextLine();

            System.out.print("Ingresa la hora de finalización (HH:mm): ");
            String horaFinStr = scanner.nextLine();

            try {
                Date horaInicio = dateFormat.parse(horaInicioStr);
                Date horaFin = dateFormat.parse(horaFinStr);

                long diferenciaMillis = horaFin.getTime() - horaInicio.getTime();
                double horasTrabajadas = diferenciaMillis / (60.0 * 60.0 * 1000);

                if (horasTrabajadas < 0) {
                    horasTrabajadas += 24.0; // Manejar el caso en que la jornada termine al día siguiente
                }

                double salarioDia = horasTrabajadas * tarifaPorHora;
                salarioTotal += salarioDia;

                System.out.println("Día " + i + ": Trabajaste " + horasTrabajadas + " horas. Ganaste $" + salarioDia);
            } catch (Exception e) {
                System.out.println("Hubo un error en el formato de la hora. Asegúrate de usar HH:mm.");
            }
        }

        System.out.println("Salario total de la semana: $" + salarioTotal);

    }// fin ejecutarPrograma


}// fin-class Ejercicio6
