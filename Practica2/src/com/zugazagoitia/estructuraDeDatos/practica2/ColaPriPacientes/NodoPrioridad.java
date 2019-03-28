package com.zugazagoitia.estructuraDeDatos.practica2.ColaPriPacientes;

public class NodoPrioridad {
    private int clave;
    private Cola dato;
    private NodoPrioridad siguiente;

    public NodoPrioridad(int clave, Cola dato, NodoPrioridad siguiente) {
        this.clave = clave;
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public NodoPrioridad getSiguiente() {
        return siguiente;
    }

    public Cola getDato() {
        return dato;
    }

    public void setSiguiente(NodoPrioridad siguiente) {
        this.siguiente = siguiente;
    }

    public void setCola(Cola dato) {
        this.dato = dato;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }
}
