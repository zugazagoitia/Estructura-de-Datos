package com.zugazagoitia.estructuraDeDatos.practica2.ColaPriPacientes;

public class Aplicacion {

    public static void main(String[] args) {

        ColaPrioridades c1 = new ColaPrioridades();

        Paciente p1 = new Paciente("Alberto","Frecuentes Mareos");
        Paciente p2 = new Paciente("Ana","Infección Resistente");
        Paciente p3 = new Paciente("Eva","Problemas Digestivos");

        c1.encolar(4,p1);
        c1.encolar(2,p2);
        c1.encolar(4,p3);

        c1.verColaPrioridades();
 
    }

}

