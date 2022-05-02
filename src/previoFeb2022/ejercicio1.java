package previoFeb2022;
import apis.ConjuntoTDA;
import apis.PilaTDA;
import impl.ConjuntoLD;
import impl.PilaLD;

public class ejercicio1 {

    public static void pilaAConjunto(PilaTDA p1, ConjuntoTDA c1){
        PilaTDA pAux= new PilaLD(); pAux.inicializarPila();
        while (! p1.pilaVacia()){
            int x= p1.tope();
            pAux.apilar(x);
            c1.agregar(x);
            p1.desapilar();}
        while (! pAux.pilaVacia()){
            int x= pAux.tope();
            p1.apilar(x);
            pAux.desapilar();}
    }

    public static boolean conjuntosIguales(ConjuntoTDA c1, ConjuntoTDA c2){
        boolean iguales=true;
        while(! c1.conjuntoVacio()){
            int elem=c1.elegir();
            if (!c2.pertenece(elem)){
                iguales=false;
                break;
            }
            else{
                c1.sacar(elem);
            }
        }
        return iguales;
    }
    public static boolean pilasIguales(PilaTDA p1, PilaTDA p2){

        ConjuntoTDA c1= new ConjuntoLD();c1.inicializarConjunto();
        ConjuntoTDA c2= new ConjuntoLD();c2.inicializarConjunto();
        pilaAConjunto(p1,c1);
        pilaAConjunto(p2,c2);

        boolean pilasIguales=conjuntosIguales(c1,c2);

        return pilasIguales;

    }
}
