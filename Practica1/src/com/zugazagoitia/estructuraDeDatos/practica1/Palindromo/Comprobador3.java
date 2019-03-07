package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;

import java.util.Scanner;
import java.util.Stack;

public class Comprobador3 {
    private String frase;

    private Stack<Character> pila1;
    private Stack<Character> pila2;


    public Comprobador3() {
        this.frase = "";
        this.pila1 = new Stack<Character>();
        this.pila2 = new Stack<Character>();
    }

    public Comprobador3(String frase) {
        this.frase = frase;
        this.pila1 = new Stack<Character>();
        this.pila2 = new Stack<Character>();
    }

    public void esPalindromo(){
        if (frase.equals("")){
            System.out.println("No hay ninguna frase introducida.");
        }else {

            for (char c : frase
                    .replaceAll("\\s","")
                    .toLowerCase()
                    .toCharArray()) {
                pila1.push(c);
            }
            partirMitad();
            if (pila1.equals(pila2)) System.out.println("La frase \""+frase+"\" es palíndromo.");
            else System.out.println("La frase \""+frase+"\" NO es palíndromo.");
        }
    }
    private void partirMitad(){
        int n = pila1.size();
        int j = n/2;

        for (int i = 0;i<j;i++){
            pila2.push(pila1.pop());
        }
        if (n % 2 !=0){
            pila1.pop();
        }
    }

    public void leerFrase() {
        Scanner sc = new Scanner(System.in);
        frase = sc.nextLine();
    }
}
