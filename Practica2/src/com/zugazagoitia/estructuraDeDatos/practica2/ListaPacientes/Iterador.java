package com.zugazagoitia.estructuraDeDatos.practica2.ListaPacientes;


class Iterador {
    private Nodo actual;

    public Iterador(Nodo comienzo) {
        actual = comienzo;
    }

    public boolean hasNext() {
        return actual != null;
    }

    public Paciente next() {
        Paciente resultado = actual.getDato();
        actual = actual.getSiguiente();
        return resultado;
    }
}
