package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;



public class Main {
    public static void main(String[] args) {
        Comprobador3 comp = new Comprobador3( "lavan esa base naval");
        Comprobador3 comp1 = new Comprobador3( "ana lava lana");

        comp.esPalindromo();
        comp1.esPalindromo();
    }
}
