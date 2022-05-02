package previoFeb2022;

import apis.ABBTDA;

public class ejercicio2 {

    public static int alturaABB(ABBTDA a) {
        if(a.arbolVacio()){
            return -1;}
        else if(alturaABB(a.hijoIzq())>=alturaABB(a.hijoDer())){
            return alturaABB(a.hijoIzq()) +1;}
        else {
            return alturaABB(a.hijoDer()) +1;}
    }
}
