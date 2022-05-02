package Previo16jul;

import apis.ConjuntoTDA;
import apis.GrafoTDA;
import impl.ConjuntoLD;

public class ejercicio2 {

    public static ConjuntoTDA calcularVecindario (GrafoTDA grafo, int v1){
        ConjuntoTDA vecindario = new ConjuntoLD();
        vecindario.inicializarConjunto();

        ConjuntoTDA verticesGrafo = grafo.Vertices();
        verticesGrafo.sacar(v1);

        while (!verticesGrafo.conjuntoVacio()){
            int destino= verticesGrafo.elegir();
            if (grafo.ExisteArista(v1,destino)){
                vecindario.agregar(destino);
            }
            verticesGrafo.sacar(destino);
        }
        return vecindario;
        }

        public static ConjuntoTDA interseccion(ConjuntoTDA c1, ConjuntoTDA c2){
            ConjuntoTDA interseccion = new ConjuntoLD();
            interseccion.inicializarConjunto();

            while (!c1.conjuntoVacio()){
                int x=c1.elegir();
                if (c2.pertenece(x)){
                    interseccion.agregar(x);
                }
                c1.sacar(x);
            }
            return interseccion;
        }

        public static ConjuntoTDA interVecindarios(GrafoTDA g, int v1, int v2){
            ConjuntoTDA vecindario1= calcularVecindario(g,v1);
            ConjuntoTDA vecindario2 = calcularVecindario(g,v2);
            ConjuntoTDA interVencindarios=interseccion(vecindario1,vecindario2);

            return interVencindarios;
        }
}
