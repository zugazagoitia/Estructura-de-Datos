package com.zugazagoitia.estructuraDeDatos.practica2.ListaPacientes;

public class Paciente {
    private String nombre;
    private String estado;
    private String sintomas;

    public Paciente(String nombre) {
        this.nombre = nombre;
        this.estado = "hospitalizado";
    }

    public Paciente(String nombre, String sintomas) {
        this.nombre = nombre;
        this.sintomas = sintomas;
        this.estado = "hospitalizado";
    }

    public String getNombre() {
        return nombre;
    }


    public String getSintomas() {
        return sintomas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public void darAlta() {
        this.estado = "alta";
    }

    public boolean estaAlta() {
        return estado.equals("alta");
    }

    public boolean equals(Paciente p){
        boolean igual=false;
        if (this.nombre.equals(p.nombre)){
            if(this.estado.equals(p.estado)){
                if (this.sintomas.equals(p.sintomas)){
                    if(this.estaAlta()==p.estaAlta()){
                        igual=true;
                    }
                }
            }
        }
        return igual;
    }

    public void verPaciente() {
        System.out.println("Nombre: " + nombre + ".  Síntomas: " + sintomas + ".  Estado: " + estado);
    }


}
