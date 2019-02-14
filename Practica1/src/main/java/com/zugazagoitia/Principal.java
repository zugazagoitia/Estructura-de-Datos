package com.zugazagoitia;

public class Principal {
    public static void main(String[] args) {

        Alumno[] alumnos = new Alumno[4];

        alumnos[0] = new Alumno("Felipe","Arias Gonzalez","aa1253",3.50);
        alumnos[1] = new Alumno("Manuel","Garcia Sacedón","ax0074",8.35);
        alumnos[2] = new Alumno("Margarita","Lopez Medina","mj7726",7.70);
        alumnos[3] = new Alumno("Estela","Sanchez Arellano","bc2658",6.75);

        alumnos[3].agregarAsignatura("Estructura de Datos");
        alumnos[3].agregarAsignatura("Fundamentos de Programación");
        alumnos[3].mostrarAsignaturas();
        System.out.println();
        alumnos[0].mostrarAlumno();
        System.out.println();
        alumnos[3].mostrarAlumno();

        System.out.println();

        pressAnyKeyToContinue();
        System.out.println(new String(new char[50]).replace("\0", "\r\n"));

        GrupoAlumnos grupoAlumno = new GrupoAlumnos(20,"g1");
        for (Alumno a:alumnos) {
            grupoAlumno.insertarAlumno(a);
        }

        Alumno yo = new Alumno("Alberto","Zugazagoitia Rodríguez","bp0337",10.0);
        yo.agregarAsignatura("Lógica y Matemática Discreta");
        yo.agregarAsignatura("Fundamentos de Programación");
        grupoAlumno.insertarAlumno(yo);

        grupoAlumno.mostrarGrupo();

        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("Media: "+grupoAlumno.mediaCalif());
        System.out.println();
        grupoAlumno.maxCalif();


    }
    static private void pressAnyKeyToContinue()
    {
        System.out.println("Pulsa enter para continuar...");
        try
        {
            System.in.read();
        }
        catch(Exception e)
        {}
    }

}
