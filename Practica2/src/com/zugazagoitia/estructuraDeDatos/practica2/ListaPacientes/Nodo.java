package com.zugazagoitia.estructuraDeDatos.practica2.ListaPacientes;

class Nodo {

    private Paciente dato;
    private Nodo siguiente;

    public Nodo(Paciente dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }


    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public Paciente getDato() {
        return dato;
    }

    public void setDato(Paciente dato) {
        this.dato = dato;
    }
}
