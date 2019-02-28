package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Comprobador1 {
    private String frase;

    private PilaCaracteres pila1;
    private PilaCaracteres pila2;


    public Comprobador1() {
        this.frase = "";
        this.pila1 = new PilaCaracteres();
        this.pila2 = new PilaCaracteres();
    }

    public Comprobador1(String frase) {
        this.frase = frase;
        this.pila1 = new PilaCaracteres();
        this.pila2 = new PilaCaracteres();
    }

    public void esPalindromo(){
        if (frase.equals("")){
            System.out.println("No hay ninguna frase introducida.");
        }else {

            for (char c : frase
                    .replaceAll("\\s","")
                    .toLowerCase()
                    .toCharArray()) {
                pila1.apilar(c);
            }
            partirMitad();
            if (pila1.equals(pila2)) System.out.println("La frase \""+frase+"\" es palíndromo.");
            else System.out.println("La frase \""+frase+"\" NO es palíndromo.");
        }
    }
    private void partirMitad(){
        int j = (pila1.numElemPila()/2);

        for (int i = 0;i<j;i++){
            pila2.apilar(pila1.desapilar());
        }
        if (pila1.numElemPila() % 2 !=0){
            pila1.desapilar();
        }
    }

    public void leerFrase() {
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
    }
}
