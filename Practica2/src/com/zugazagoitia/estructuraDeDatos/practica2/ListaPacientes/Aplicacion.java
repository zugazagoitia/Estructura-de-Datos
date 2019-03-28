package com.zugazagoitia.estructuraDeDatos.practica2.ListaPacientes;
public class Aplicacion {

    public static void main(String[] args) {
        Paciente p1 = new Paciente("Alberto","Frecuentes Mareos");
        Paciente p2 = new Paciente("Ana","Infección resistente");
        Paciente p3 = new Paciente("Eva","Problemas digestivos");
        Paciente p4 = new Paciente("Ernesto","Problemas cardiovasculares");
        ListaOrdinal lista = new ListaOrdinal();
        lista.insertar(p1);
        lista.insertar(p2);
        lista.insertar(p3);
        lista.insertar(p4);
        p1.darAlta();
        p3.darAlta();

        Iterador it = lista.obtenerIterador();

        while (it.hasNext()){
            it.next().verPaciente();
        }
        System.out.println();
        verAlta(lista);
        /*
        lista.borrarAltas();
        it = lista.obtenerIterador();
        System.out.println();
        while (it.hasNext()){
            it.next().verPaciente();
        }
        */
        System.out.println("Prueba");
        ListaOrdinal l2 = pacientesSintoma(lista,"Mareos");

        it = l2.obtenerIterador();

        while (it.hasNext()){
            it.next().verPaciente();
        }


    }

    static void verAlta(ListaOrdinal lista){
        Iterador it = lista.obtenerIterador();
        Paciente aux;
        while (it.hasNext()){
            aux=it.next();
            if (aux.estaAlta()){
                aux.verPaciente();
            }
        }
    }
    static ListaOrdinal pacientesSintoma(ListaOrdinal lista, String sintoma){
        ListaOrdinal l = new ListaOrdinal();
        Iterador it = lista.obtenerIterador();
        Paciente aux;
        while (it.hasNext()){
            aux=it.next();
            if (aux.getSintomas().contains(sintoma)){
                l.insertar(aux);
            }
        }
        return l;
    }
}