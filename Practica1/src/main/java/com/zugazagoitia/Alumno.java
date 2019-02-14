package com.zugazagoitia;


import lombok.Getter;
import lombok.Setter;
public class Alumno {

    @Getter
    @Setter
    private String nombre;
    @Getter
    @Setter
    private String apellidos;
    @Getter
    @Setter
    private String matricula;
    @Getter
    @Setter
    private double calificacion;

    private String asignaturas[];
    @Getter
    private int numAsignaturas;

    public Alumno(String nombre, String apellidos, String matricula, double calificacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.matricula = matricula;

        this.calificacion = calificacion;
        this.numAsignaturas = 0;

        this.asignaturas = new String[4];
    }

    public Alumno(){
        nombre = "";
        apellidos = "";
        matricula = "";

        calificacion = 0;
        numAsignaturas = 0;

        asignaturas = new String[4];
    }


    public void agregarAsignatura(String asig){
        if(numAsignaturas >=5){
            System.out.println("Error, máximo de asignaturas alcanzado");
        }else{
            this.asignaturas[this.numAsignaturas]=asig;
            this.numAsignaturas++;
        }
    }

    public void mostrarAsignaturas(){
        if (this.numAsignaturas ==0){
            System.out.println("El alumno no está matriculado en ninguna asignatura");
        }else{
            for (int i = 0; i < this.numAsignaturas; i++) {
                System.out.println("- "+this.asignaturas[i]+".");
            }
        }
    }

    public void mostrarAlumno(){ //TODO: Metodo
        System.out.println(this.apellidos+", "+this.nombre+". Matrícula: "+this.matricula+" ("+this.calificacion+")");
        mostrarAsignaturas();

    }


}
