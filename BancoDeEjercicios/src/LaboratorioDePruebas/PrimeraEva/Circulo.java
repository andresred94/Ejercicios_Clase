package LaboratorioDePruebas.PrimeraEva;

public class Circulo {

    //atributos
    private static double radio , area , longitud ;

    // métodos constructores
    public Circulo(){

    }

    // setter y getter
    public double getRadio () {
        return radio;
    }
    public double getArea () {
        return area;
    }
    public double getLongitud () {
        return longitud;
    }

    public void setRadio ( double radio ) {
        this.radio = radio;
    }
    public void setArea ( double area ) {
        this.area = area;
    }
    public void setLongitud ( double longitud ) {
        this.longitud = longitud;
    }

    //<-- metodos de la clase -->//
    public static double calcAreaCirculo (){
        return Math.PI * (Math.pow(radio,2));
    }// fin calcAreaCirculo
    public static double calcLongCirculo(){
        return 2 * Math.PI * radio;
    }// fin calcLongCirculo

}// fin-class CalcularAreaCirculo
