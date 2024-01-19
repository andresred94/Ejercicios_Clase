package LaboratorioDePruebas.Arrays;

public class Array1DSuma {
    // atributos
    private int [] rsp;

    // contructores
    public Array1DSuma(){}

    // settes y getters
    public void setRsp ( int[] rsp ) {
        this.rsp = rsp;
    }
    public int[] getRsp () {
        return rsp;
    }

    // métodos de la clase
    public int [] sumaArrays (int [] array1 , int [] array2){
        rsp = new int [array1.length];
        for (int i = 0; i < array1.length; i++) {
            rsp[i] = array1[i] + array2[i];
        }

        return rsp;
    }// fin SumaArrays
}// Array1DSuma
