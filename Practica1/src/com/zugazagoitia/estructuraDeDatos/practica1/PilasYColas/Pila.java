package com.zugazagoitia.estructuraDeDatos.practica1.PilasYColas;

import java.util.ArrayList;

public class Pila {

    private Nodo cimaPila;
    private int numElementos;

    public Pila() {
        cimaPila = null;
        numElementos = 0;
    }


    public boolean pilaVacia() {

        return cimaPila == null;
    }

    public void apilar(int dato) {
        if (this.pilaVacia())
            cimaPila = new Nodo(dato, null);
        else {
            Nodo nuevo = new Nodo(dato, cimaPila);
            cimaPila = nuevo;
        }
        numElementos++;
    }

    public int desapilar() {
        int valor;
        if (this.pilaVacia()) {
            System.out.println("Error, la pila está vacía");
            valor = -9999;
        } else {
            valor = cimaPila.getDato();
            cimaPila = cimaPila.getSiguiente();
            numElementos--;
        }
        return valor;
    }

    public int cima() {
        int valor;
        if (this.pilaVacia()) {
            System.out.println("Error, la pila está vacía");
            valor = -9999;
        } else {
            valor = cimaPila.getDato();
        }
        return valor;
    }

    public int sumarElementos(){
        int suma=0;
        Nodo aux = cimaPila;
        suma=suma + aux.getDato();
        while(aux.getSiguiente()!=null){
            aux = aux.getSiguiente();
            suma=suma + aux.getDato();
        }
        return suma;

    }

    void unirPila(Pila p){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while (p.numElementos>0){
            temp.add(p.desapilar());
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            this.apilar(temp.get(i));
        }
    }


    public int numElemPila() {
        return numElementos;
    }

    public void escribirPila() {
        Nodo aux = cimaPila;
        System.out.println("contenido de la pila");

        while (aux != null) {
            System.out.println(aux.getDato());
            aux = aux.getSiguiente();
        }
    }


}
