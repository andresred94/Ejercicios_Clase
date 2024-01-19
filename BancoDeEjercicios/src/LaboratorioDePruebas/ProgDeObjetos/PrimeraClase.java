package LaboratorioDePruebas.ProgDeObjetos;
public class PrimeraClase {
    public static void main(String[] args) {
        Persona p1, p2 , p3;
        p1 = new Persona("Andrés",29,1.60,"52053342H");
        p2 = new Persona("Sara");
        p3 = new Persona();
        System.out.printf("Nombre: %s Edad: %d Estatura: %.2f Nombre: %s%n",p1.getNombre(),p1.getEdad(),p1.getEstatura(),p1.getDni() );
        System.out.println(p2.getNombre());
        // El constructor vacio inicializa los valores a NULL o 0
        System.out.printf("Nombre: %s Edad: %d Estatura: %.1f DNI: %s ",p3.getNombre(),p3.getEdad(),p3.getEstatura(),p3.getDni());
        // ToDo Crear una clase Cuenta corriente
        // tiene que tener DNI , nombreTitular y Saldo

    }// fin main
}// fin-class Personas
