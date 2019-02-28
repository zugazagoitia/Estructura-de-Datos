package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.stream.Stream;

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
        }else  {

            for (char c : Pattern.compile("\\s")
                    .matcher(frase)
                    .replaceAll("")
                    .toCharArray()) {
                pila1.apilar(c);
            }
            partirMitad();
            //TODO Acabar este método

        }
    }
    private void partirMitad(){
        for (int i = 0;i<(pila1.numElemPila()/2);i++){
            pila2.apilar(pila1.desapilar());
            if (pila1.numElemPila() % 2 !=0){
                pila1.desapilar();
            }
        }
    }

    public void leerFrase() {
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
    }
}
