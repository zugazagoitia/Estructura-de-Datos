package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;

import java.util.Scanner;

public class Comprobador2 {

    private String frase;

    private PilaCaracteres pila;
    private ColaCaracteres cola;


    public Comprobador2() {
        this.frase = "";
        this.pila = new PilaCaracteres();
        this.cola = new ColaCaracteres();
    }

    public Comprobador2(String frase) {
        this.frase = frase;
        this.pila = new PilaCaracteres();
        this.cola = new ColaCaracteres();
    }

    public void esPalindromo(){
        if (frase.equals("")){
            System.out.println("No hay ninguna frase introducida.");
        }else {

            for (char c : frase
                    .replaceAll("\\s","")
                    .toLowerCase()
                    .toCharArray()) {
                pila.apilar(c);
                cola.encolar(c);
            }
            if (pila.equals(cola)) System.out.println("La frase \""+frase+"\" es palíndromo.");
            else System.out.println("La frase \""+frase+"\" NO es palíndromo.");
        }
    }


    public void leerFrase() {
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
    }

}
