package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;



public class Main {
    public static void main(String[] args) {
        Comprobador1 comp = new Comprobador1( "lavan esa base naval");
        Comprobador1 comp1 = new Comprobador1( "ana lava lana");

        comp.esPalindromo(); //TODO fix this shit
        comp1.esPalindromo();
    }
}
