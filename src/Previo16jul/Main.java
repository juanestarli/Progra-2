package Previo16jul;

import apis.ConjuntoTDA;
import apis.GrafoTDA;
import impl.GrafoLA;
import impl.GrafoMA;

public class Main {
    public static void main(String[] args) {
        GrafoTDA g = new GrafoLA(); g.inicializarGrafo();

        //agregar vertices
        g.agregarVertice(0);g.agregarVertice(1);
        g.agregarVertice(2);g.agregarVertice(3);
        g.agregarVertice(4);g.agregarVertice(5);
        g.agregarVertice(6);g.agregarVertice(7);
        g.agregarVertice(8);g.agregarVertice(9);

        //agregar aristas
        g.agregarArista(0,1,1);g.agregarArista(0,2,1);
        g.agregarArista(1,6,1);g.agregarArista(1,4,1);
        g.agregarArista(2,6,1);
        g.agregarArista(3,0,1);g.agregarArista(3,2,1);g.agregarArista(3,8,1);
        g.agregarArista(4,5,1);g.agregarArista(4,6,1);
        g.agregarArista(5,6,1);g.agregarArista(5,9,1);
        g.agregarArista(6,7,1);g.agregarArista(6,8,1);g.agregarArista(6,9,1);
        g.agregarArista(7,8,1);g.agregarArista(7,9,1);
        g.agregarArista(8,2,1);

        ConjuntoTDA vecindario=ejercicio2.calcularVecindario(g,2);

        while(!vecindario.conjuntoVacio()){
            int x= vecindario.elegir();
            System.out.println(x);
            vecindario.sacar(x);
        }

    }
}
