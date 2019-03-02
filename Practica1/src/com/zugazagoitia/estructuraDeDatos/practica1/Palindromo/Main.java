package com.zugazagoitia.estructuraDeDatos.practica1.Palindromo;



public class Main {
    public static void main(String[] args) {
        Comprobador2 comp = new Comprobador2( "lavan esa base naval");
        Comprobador2 comp1 = new Comprobador2( "ana lava lana");

        comp.esPalindromo();
        comp1.esPalindromo();
    }
}
