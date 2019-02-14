package com.zugazagoitia;

import lombok.Getter;
import lombok.Setter;

public class GrupoAlumnos {

    private Alumno[] listaAlumnos;
    @Getter
    private int numAlumnos = 0;
    @Getter
    private int maximo;
    @Getter
    @Setter
    private String nombre;

    public GrupoAlumnos(){

        maximo=10;
        nombre="GrupoDesconocido";
        listaAlumnos = new Alumno[maximo];

    }

    public GrupoAlumnos(int maximo, String nombre){
        this.maximo=maximo;
        this.nombre=nombre;
        listaAlumnos = new Alumno[this.maximo];
    }



    Alumno alumnoPos(int i){
        return listaAlumnos[i];
    }

    public boolean insertarAlumno(Alumno a){
        if (numAlumnos==maximo){
            return false;
        }else{
            listaAlumnos[numAlumnos]=a;
            numAlumnos++;
            return true;
        }
    }

    public void mostrarGrupo(){
        System.out.println(nombre);
        System.out.println();
        for (int i = 0; i < numAlumnos ; i++) {
            System.out.println();
            listaAlumnos[i].mostrarAlumno();
        }
    }
    public double mediaCalif(){
        int i;
        double temp = 0.0;
        for (i = 0; i < numAlumnos ; i++) {

            temp+=listaAlumnos[i].getCalificacion();
        }
        return temp/i;
    }
    public void maxCalif(){
        int i;
        double temp=0;
        int cal=0;
        for (i = 0; i < numAlumnos ; i++) {
            if(listaAlumnos[i].getCalificacion()>temp){
                temp=listaAlumnos[i].getCalificacion();
                cal=i;
            }
        }

            listaAlumnos[cal].mostrarAlumno();

    }



}
