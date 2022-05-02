package Previo16jul;

import apis.ColaTDA;
import apis.ConjuntoTDA;
import impl.ColaLD;
import impl.ConjuntoLD;

public class ejercicio4 {

    public static ColaTDA productoCartesiano(ConjuntoTDA c1, ConjuntoTDA c2) {
        ColaTDA productoCartesiano = new ColaLD();
        while (!c1.conjuntoVacio()) {
            int elemC1 = c1.elegir();
            ConjuntoTDA elementosC2 = duplicarConjunto(c2);
            while (!elementosC2.conjuntoVacio()) {
                int elemC2 = elementosC2.elegir();
                productoCartesiano.acolar(elemC1);
                productoCartesiano.acolar(elemC2);
                elementosC2.sacar(elemC2);
            }
            c1.sacar(elemC1);
        }
        return productoCartesiano;
    }

    public static ConjuntoTDA duplicarConjunto(ConjuntoTDA c) {
        ConjuntoTDA c2 = new ConjuntoLD();
        c2.inicializarConjunto();
        ConjuntoTDA aux = new ConjuntoLD();
        aux.inicializarConjunto();

        while (!c.conjuntoVacio()) {
            int x = c.elegir();
            c2.agregar(x);
            aux.agregar(x);
            c.sacar(x);
        }

        while (!aux.conjuntoVacio()) {
            int x = aux.elegir();
            c.agregar(x);
            aux.sacar(x);
        }
        return c2;
    }
}
