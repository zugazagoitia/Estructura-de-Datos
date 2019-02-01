package com.zugazagoitia;

import java.util.Scanner;
public class DivisoresEntero {
    public static void main(String[] args) {
        int valor;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un valor entero positivo: ");
        valor = sc.nextInt();
        if (valor < 1) {
            System.out.println("Número no válido");
        } else {
            visualizarDivisores(valor);
        }
    }
    private static void visualizarDivisores(int valor){

        System.out.print("Divisores: ");
        for (int i = 1 ; i <= valor ; i++) {
            if (valor % i == 0) {
                System.out.print(i+" ");

            }
        }
    }
}
