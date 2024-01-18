package LaboratorioDePruebas.ProgDeObjetos;

public class Persona {
    // Atributos
    public String nombre;
    private int edad;
    private double estatura;
    private String dni ="";

    // métodos constructores
    public Persona(String nombre, int edad, double estatura, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
    }

    public Persona (String nombre){
        this.nombre = nombre;
    }
    public Persona() {
        this.nombre = nombre;
        this.edad = edad;
        this.estatura = estatura;
        this.dni = dni;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0){
            this.edad = edad;
        } else {
            System.err.println("La edad no puede ser negativa.");
        }
    }// fin setEdad

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        if (estatura > 0){
            this.estatura = estatura;
        } else {
            System.err.println("La estatura no puede ser negativa.");
        }
    }// fin setEstatura

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        if (dni.length() > 9 || dni.length() < 9){
            System.err.println("El DNI tiene que tener 8 números y una letra");
        } else {
            this.dni = dni;
        }
    }

}// fin-class Persona
