package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;



public class PilaCaracteres {
    private NodoCaracteres cimaPila;
    private int numElementos;

    public PilaCaracteres() {
        cimaPila = null;
        numElementos = 0;
    }


    public boolean pilaVacia() {

        return cimaPila == null;
    }

    public void apilar(char dato) {
        if (this.pilaVacia())
            cimaPila = new NodoCaracteres(dato, null);
        else {
            NodoCaracteres nuevo = new NodoCaracteres(dato, cimaPila);
            cimaPila = nuevo;
        }
        numElementos++;
    }

    public char desapilar() {
        char valor;
        if (this.pilaVacia()) {
            System.out.println("Error, la pila está vacía");
            valor = Character.MIN_VALUE;
        } else {
            valor = cimaPila.getDato();
            cimaPila = cimaPila.getSiguiente();
            numElementos--;
        }
        return valor;
    }

    public char cima() {
        char valor;
        if (this.pilaVacia()) {
            System.out.println("Error, la pila está vacía");
            valor = Character.MIN_VALUE;
        } else {
            valor = cimaPila.getDato();
        }
        return valor;
    }

    public boolean equals(PilaCaracteres pila){
        boolean eq = true;
        PilaCaracteres aux = this;
        if (this.numElemPila()!= pila.numElemPila())eq = false;
        else {
            for (int i = 0; i < this.numElemPila(); i++) {
                if (aux.cima() != pila.cima()) {
                    eq = false;
                    break;
                }else {
                    pila.desapilar();
                    aux.desapilar();
                }

            }
        }


        return eq;
    }

    public boolean equals(ColaCaracteres cola){
        boolean eq = true;
        PilaCaracteres aux = this;
        if (this.numElemPila()!= cola.numElem) eq = false;
        else {
            for (int i = 0; i < this.numElemPila(); i++) {
                if (aux.cima() != cola.primero()) {
                    eq = false;
                    break;
                }else {
                    cola.desencolar();
                    aux.desapilar();
                }

            }
        }


        return eq;
    }


    public int numElemPila() {
        return numElementos;
    }

    public void escribirPila() {
        NodoCaracteres aux = cimaPila;
        System.out.println("contenido de la pila");

        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }
}
