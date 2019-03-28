package com.zugazagoitia.estructuraDeDatos.practica2.ColaPriPacientes;

public class ColaPrioridades {
    private NodoPrioridad inicio;

    public ColaPrioridades() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    /** Inserta el paciente en la cola que le corresponde según su prioridad.
     * Si no hay ningún paciente con la misma prioridad, crea una cola nueva en la que mete al paciente.
     */
    public void encolar(int prioridad, Paciente paciente) {

        NodoPrioridad anterior = null;
        NodoPrioridad actual = inicio;

        while ((actual != null) && (actual.getClave() < prioridad)) {
            anterior = actual;
            actual = actual.getSiguiente();
        }
        if ((actual == null) || (actual.getClave() > prioridad)) {
            Cola aux = new Cola();
            aux.encolar(paciente);
            NodoPrioridad nuevo = new NodoPrioridad(prioridad, aux, actual);
            if (actual == inicio) { // insertar al principio de la lista
                inicio = nuevo;
            } else {
                anterior.setSiguiente(nuevo);
            }
        }else{
            actual.getDato().encolar(paciente);
        }

    }

    /** Busca la clave en la lista. Si la encuentra devuelve el alumno asociado a dicha clave,
     * y si no la encuentra devuelve NULL.
     */
    public Paciente desencolar() {
        Paciente twoPac;
        if (inicio == null){
            twoPac = null;
        }else {
            Cola aux = inicio.getDato();
            twoPac = aux.desencolar();
            if (aux.colaVacia()) {
                inicio = inicio.getSiguiente();
            }
        }
        return twoPac;
    }

    /** Visualizar todos los pacientes del hospital, ordenados por prioridad
     */
    public void verColaPrioridades() {

        NodoPrioridad aux;
        aux = inicio;
        while (aux != null) {
            System.out.printf("Priodidad %d:\n",aux.getClave());
            aux.getDato().verCola();
            System.out.println();
            aux = aux.getSiguiente();
        }

    }
}


