package previoFeb2022;

import apis.ConjuntoTDA;
import apis.GrafoTDA;
import apis.PilaTDA;
import impl.ConjuntoLD;
import impl.PilaLD;

public class ejercicio3 {

    public static ConjuntoTDA conjVertIniciales (GrafoTDA g){
        ConjuntoTDA vertIniciales = new ConjuntoLD();
        vertIniciales.inicializarConjunto();
        ConjuntoTDA vertices=g.Vertices();
        while (!vertices.conjuntoVacio()){
            boolean inicial=true;
            int v = vertices.elegir();
            ConjuntoTDA otros=g.Vertices();
            otros.sacar(v);
            while(!otros.conjuntoVacio() && inicial) {
                int otro=otros.elegir();
                if (g.ExisteArista(otro, v )) {
                    inicial = false;}
                otros.sacar(otro);
            }
            if (inicial){
                vertIniciales.agregar(v);
            }
            vertices.sacar(v);
        }
        return vertIniciales;
    }

    public static ConjuntoTDA aislados(GrafoTDA g) {
        ConjuntoTDA conjResultante=new ConjuntoLD();
        conjResultante.inicializarConjunto();
        ConjuntoTDA vertices=g.Vertices();
        while(!vertices.conjuntoVacio()) {//Candidatos a aislado
            int v=vertices.elegir();
            boolean aislado=true;
            ConjuntoTDA otros=g.Vertices();
            otros.sacar(v);
            while(!otros.conjuntoVacio() && aislado) {//Candidatos a w
                int otro=otros.elegir();
                if (g.ExisteArista(v, otro) || g.ExisteArista(otro, v ))// Por cada v debo verificar que sea aislado
                    aislado=false;
                otros.sacar(otro);
            }
            if (aislado)
                conjResultante.agregar(v);

            vertices.sacar(v);
        }

        return conjResultante;
    }

    public static ConjuntoTDA conjVertFinales (GrafoTDA g){
        ConjuntoTDA vertFinales = new ConjuntoLD();
        vertFinales.inicializarConjunto();
        ConjuntoTDA vertices=g.Vertices();
        while (!vertices.conjuntoVacio()){
            boolean finales=true;
            int v = vertices.elegir();
            ConjuntoTDA otros=g.Vertices();
            otros.sacar(v);
            while(!otros.conjuntoVacio() && finales) {
                int otro=otros.elegir();
                if (g.ExisteArista(v,otro)) {
                    finales = false;}
                otros.sacar(otro);
            }
            if (finales){
                vertFinales.agregar(v);
            }
            vertices.sacar(v);
        }
        return vertFinales;
    }
}
