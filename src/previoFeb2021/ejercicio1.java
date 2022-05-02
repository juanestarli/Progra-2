package previoFeb2021;

import apis.ABBTDA;
import apis.ConjuntoTDA;
import impl.ConjuntoLD;

public class ejercicio1 {

    public static ConjuntoTDA listarNodosDesbalanceados(ABBTDA a, ConjuntoTDA nodosDesbalanceados){
        if (!a.arbolVacio()){
            boolean balanceado= Balanceado(a);
            if (!balanceado){
                nodosDesbalanceados.agregar(a.info());
            }
            listarNodosDesbalanceados(a.hijoIzq(),nodosDesbalanceados);
            listarNodosDesbalanceados(a.hijoDer(), nodosDesbalanceados);

        }
        return nodosDesbalanceados;
    }



    public static int alturaABB(ABBTDA a) {
        if(a.arbolVacio()){
            return -1;}
        if(alturaABB(a.hijoIzq())>=alturaABB(a.hijoDer())){
            return alturaABB(a.hijoIzq()) +1;}
        else {
            return alturaABB(a.hijoDer()) +1;}
    }



    public static boolean Balanceado (ABBTDA a){
        int calculo= alturaABB(a.hijoDer())-alturaABB(a.hijoIzq());
        if (calculo >= 2 || calculo <= -2){
            return false;
        }
        else {
            return true;
        }
    }
}
