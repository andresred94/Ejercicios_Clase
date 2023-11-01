package ActividadesUT02.Enumerados;

public class Ejercicio1 {

    public static void ejecutarPrograma () {

        enum  Dias {LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO};

        Dias dia = Dias.MARTES;
        System.out.printf ( "Dia asignado: %s" , dia );

        System.out.printf ( "%nDia asignado: %s" , Dias.DOMINGO );

    }// fin-ejecutarPrograma

}// fin-class Ejercicio1
