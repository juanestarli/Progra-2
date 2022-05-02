package ABBTDA;
import apis.ABBTDA;

public class metodosABBTDA {

    public static boolean elemPresente(ABBTDA a, int x) {
        if (a.arbolVacio()) {
            return false;
        } else if (a.info() == x) {
            return true;
        } else if (a.info() > x) {
            return elemPresente(a.hijoIzq(), x);
        } else {
            return elemPresente(a.hijoDer(), x);
        }
    }

    public static boolean esHoja(ABBTDA a, int x) {
        if (a.arbolVacio()) {
            return false;
        } else if (a.info() == x) {
            if (a.hijoIzq().arbolVacio() && a.hijoDer().arbolVacio()) {
                return true;
            } else {
                return false;
            }
        } else if (a.info() > x) {
            return esHoja(a.hijoIzq(), x);
        } else {
            return esHoja(a.hijoDer(), x);
        }
    }

    public static int menorElem(ABBTDA a) {
        if (!a.hijoIzq().arbolVacio()) {
            return menorElem(a.hijoIzq());
        } else {
            return a.info();
        }
    }

    public static int ContarNodos(ABBTDA a) {
        if (a.arbolVacio()){
            return 0;
        }
        else {
            return (1 + ContarNodos(a.hijoIzq()) + ContarNodos(a.hijoDer()));
        }
    }

    public static int SumarNodos(ABBTDA a) {
        if (a.arbolVacio()){
            return 0;
        }
        else {
            return (a.info() + SumarNodos(a.hijoIzq()) + SumarNodos(a.hijoDer()));
        }
    }

    public static int CantHojas(ABBTDA a){
        int cuenta=0;
        if (a.hijoIzq().arbolVacio() && a.hijoDer().arbolVacio()){
            cuenta= 1;
        }
        else{
            if(!a.hijoIzq().arbolVacio()){
                cuenta+=CantHojas(a.hijoIzq());
            }
            if(!a.hijoDer().arbolVacio()){
                cuenta+=CantHojas(a.hijoDer());
            }
        }
        return cuenta;
    }
    public static int alturaABB(ABBTDA a) {
        if(a.arbolVacio()){
            return -1;}
        if(alturaABB(a.hijoIzq())>=alturaABB(a.hijoDer())){
            return alturaABB(a.hijoIzq()) +1;}
        else {
            return alturaABB(a.hijoDer()) +1;}
    }
    }








