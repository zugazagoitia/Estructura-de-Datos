package com.zugazagoitia;

public class Alumno {

    private String nombre;
    private String apellidos;
    private String matricula;

    private double calificacion;

    private String asignaturas[];
    private int numAsignaturas;

    public void Alumno(){
        nombre = "";
        apellidos = "";
        matricula = "";

        calificacion = 0;
        numAsignaturas = 0;

         asignaturas = new String[4];
    }

    public void Alumno(String nombre, String apellidos, String matricula, double calificacion){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.matricula = matricula;

        this.calificacion = calificacion;
        this.numAsignaturas = 0;

        this.asignaturas = new String[4];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }

    public int getNumAsignaturas() {
        return numAsignaturas;
    }

    public void agregarAsignatura(String asig){
        if(numAsignaturas >=5){
            System.out.println("Error, máximo de asignaturas alcanzado");
        }else{
            this.asignaturas[this.numAsignaturas -1]=asig;
            this.numAsignaturas++;
        }
    }

    public void mostrarAsignaturas(){
        if (this.numAsignaturas ==0){
            System.out.println("El alumno no está matriculado en ninguna asignatura");
        }else{
            for (int i = 0; i < this.numAsignaturas -1; i++) {
                System.out.println("- "+this.asignaturas[i]+".");
            }
        }
    }

    public void mostrarAlumno(){ //TODO: Metodo

    }


}
