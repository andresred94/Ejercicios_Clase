package LaboratorioDePruebas.ProgDeObjetos;

public class PrimeraClase {
    public static void main(String[] args) {
        Persona p = new Persona();
        p.setNombre("Andrés");
        p.setEdad(29);
        p.setEstatura((float) 1.65);
        p.setDni("51739920V");
        System.out.println(p.getNombre());
        System.out.println(p.getEdad());
        System.out.println(p.getEstatura());
        System.out.println(p.getDni());
    }// fin main
}// fin-class Personas
