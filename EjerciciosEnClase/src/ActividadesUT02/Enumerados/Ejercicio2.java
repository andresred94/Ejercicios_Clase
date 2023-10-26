package ActividadesUT02.Enumerados;

public class Ejercicio2 {

    public static void ejecutarPrograma (){
        System.out.println ("Dias laborales");
        diasLaborales ();
        System.out.println ("Primer trimestre");
        primerTrimestre ();
        System.out.println ("Calificaciones de un alumno");
        califAlumno8();




    }// fin ejecutarPrograma





    private static void califAlumno8 () {

        enum calif {Suspenso,Aprobado,Sobresaliente}

        for ( calif nota : calif.values () ) {
            System.out.println (nota);
        }

    }// fin califAlumnos

    private static void primerTrimestre () {

        enum pTrim {Enero,Febrero,Marzo};

        for ( pTrim mes : pTrim.values ()) {
            System.out.println (mes);
        }

    }// fin primerTrimestre

    private static void diasLaborales (){
        enum diasL {Lunes,Martes,Miercoles,Jueves,Viernes}

        for (  diasL laborables : diasL.values() ) {
            System.out.println (laborables);
        }

    }// fin diasLaborales




}// fin-class Ejercicio2
