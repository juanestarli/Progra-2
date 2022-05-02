package Previo16jul;

import apis.ABBTDA;

public class ejercicio3 {

    public static int menorElem(ABBTDA a) {
        if (!a.hijoIzq().arbolVacio()) {
            return menorElem(a.hijoIzq());
        } else {
            return a.info();
        }
    }
    public static int mayorElem(ABBTDA a) {
        if (!a.hijoDer().arbolVacio()) {
            return mayorElem(a.hijoDer());
        } else {
            return a.info();
        }
    }

    public static int CalcularX(ABBTDA a1, ABBTDA a2) {
        int x1=mayorElem(a1)-menorElem(a1);
        int x2=mayorElem(a2)-menorElem(a2);
        int x= x1-x2;

        return x;
    }

    }

