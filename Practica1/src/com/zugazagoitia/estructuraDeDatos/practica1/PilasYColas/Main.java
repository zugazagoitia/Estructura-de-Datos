package com.zugazagoitia.estructuraDeDatos.practica1.PilasYColas;

import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        Pila pila1 = new Pila();
        pila1.apilar(1);
        pila1.apilar(2);
        pila1.apilar(3);
        System.out.println(pila1.sumarElementos());
        pila1.escribirPila();
        //System.out.println(pila1.sumarElementos());

        Pila pila2 = new Pila();
        pila2.apilar(10);
        pila2.apilar(20);
        pila2.apilar(30);
        System.out.println();
        pila2.escribirPila();
        System.out.println();
        unirPilas(pila1,pila2);
        pila1.escribirPila();

        System.out.println();

        Cola cola1 = new Cola();
        cola1.encolar(20);
        cola1.encolar(40);
        cola1.encolar(10);
        cola1.encolar(50);
        dejarN(2,cola1);
        cola1.escribirCola();
    }

    static int sumarElementos (Pila p){
        int suma=0;
        Pila temp = p;
        while(!temp.pilaVacia()){
            suma=suma + temp.desapilar();
        }
        return suma;
    }

    static void unirPilas(Pila p1, Pila p2){
        ArrayList<Integer> temp = new ArrayList<Integer>();
        while (p2.numElemPila()>0){
            temp.add(p2.desapilar());
        }
        for (int i = temp.size() - 1; i >= 0; i--) {
            p1.apilar(temp.get(i));
        }
    }

    static void dejarN( int n, Cola c){
        if(n==0){
            while(c.numElem!=0){
                c.desencolar();
            }
        }else if(n<c.numElem) {
            Cola aux = new Cola();
            for (int k = 0; k < n; k++) {
                aux.encolar(c.desencolar());
            }
            c = aux;
        }
    }

}
