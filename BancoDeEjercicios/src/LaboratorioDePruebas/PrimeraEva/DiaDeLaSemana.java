package LaboratorioDePruebas.PrimeraEva;

import java.util.Scanner;

public class DiaDeLaSemana {

    // atributos
    private int diaS;

    // contructores
    public DiaDeLaSemana(){
        diaS = 0;
    }

    // setters y getters
    public void setDiaS ( int diaS ) {
        this.diaS = diaS;
    }
    public int getDiaS () {
        return diaS;
    }

    //<-- metodos principales -->//
    public String comprobarDia (){
        String rsp = "";
            switch ( diaS ){
            case 1:
                rsp = "Lunes";
                break;
            case 2:
                rsp = "Martes";
                break;
            case 3:
                rsp = "Miercoles";
                break;
            case 4:
                rsp = "Jueves";
                break;
            case 5:
                rsp = "Viernes";
                break;
            case 6:
                rsp = "Sábado";
                break;
            case 7:
                rsp = "Domingo";
                break;
            default:
                rsp = "Error: no has ingresado un dia valido";
                break;
        }// fin switch
        return rsp;
    }// fin ejecutarPrograma

    //<-- metodos secundarios -->//
}// fin-class DiaDeLaSemana
