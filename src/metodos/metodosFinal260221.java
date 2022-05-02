package metodos;

import apis.*;
import impl.ColaLD;
import impl.ConjuntoLD;
import impl.PilaLD;

import java.math.*;

public class metodosFinal260221 {
	
	public static int ContarNodos(ABBTDA a) {
		if (a.arbolVacio()){
			return 0;
			}
			else {
			return (1 + ContarNodos(a.hijoIzq()) + ContarNodos(a.hijoDer()));
			}
		
	}

	public static void imprimirConjunto(ConjuntoTDA vecindario) {
		PilaTDA pila= new PilaLD();
		while(!vecindario.conjuntoVacio()){
			int x=vecindario.elegir();
			System.out.println(x);
			pila.apilar(x);
			vecindario.sacar(x);
		}
		while ((!pila.pilaVacia())){
			vecindario.agregar(pila.tope());
			pila.desapilar();
		}
	}

	public void preOrder(ABBTDA a){
		if (!a.arbolVacio())
		{
			preOrder(a.hijoIzq());
			preOrder(a.hijoDer());
		}
		}

	public static void imprimir(ABBTDA a){
		if (!a.arbolVacio()){
		System.out.println(a.info());
		imprimir(a.hijoIzq());
		imprimir(a.hijoDer());
		}
		}

	public static int calcularProfIzq(ABBTDA a){
		if (a.arbolVacio()){
			return 0;
		}
		else {
			return 1+(calcularProfIzq(a.hijoIzq()));
		}
	}

	public static int calcularProfDer(ABBTDA a){
		if (a.arbolVacio()){
			return 0;
		}
		else {
			return 1+(calcularProfDer(a.hijoDer()));
		}
	}

	public static boolean ArbolBalanceado(ABBTDA a){
		boolean balance = true;
		int profIzq=metodosFinal260221.calcularProfIzq(a);
		int profDer=metodosFinal260221.calcularProfDer(a);

		if (profDer-profIzq <-2 | profDer-profIzq>2 ){
			balance=false;
		}
		return balance;
	}

	public static void eliminarVec(ConjuntoTDA vertices, ConjuntoTDA vecindario){
		PilaTDA pila= new PilaLD();
		while(!vecindario.conjuntoVacio()){
			int x=vecindario.elegir();
			vertices.sacar(x);
			pila.apilar(x);
			vecindario.sacar(x);
		}
		while (!pila.pilaVacia()){
			vecindario.agregar(pila.tope());
			pila.desapilar();
		}
	}

	public static void complementoSinAd(ConjuntoTDA complem, ConjuntoTDA veci, GrafoTDA g){
		PilaTDA pilaC = new PilaLD();
		PilaTDA pilaV= new PilaLD();
		while (!veci.conjuntoVacio()){
			int vecino=veci.elegir();
			while(!complem.conjuntoVacio()){
				int complemento=complem.elegir();
				if(g.ExisteArista(complemento,vecino) | g.ExisteArista(vecino,complemento)){
					complem.sacar(complemento);
				}
				else{
					pilaC.apilar(complemento);

				}
			}
		}
	}

	public static ConjuntoTDA calcularVecindario(GrafoTDA g, int v){
		ConjuntoTDA vecindario = g.Vertices();
		PilaTDA pilaAux = new PilaLD();
		vecindario.sacar(v);
		while(!vecindario.conjuntoVacio()){
			int opcion=vecindario.elegir();
			if(g.ExisteArista(v,opcion)){
				pilaAux.apilar(opcion);
				vecindario.sacar(opcion);
			}
			else {
				vecindario.sacar(opcion);
			}
		}
		while (!pilaAux.pilaVacia()){
			vecindario.agregar(pilaAux.tope());
			pilaAux.desapilar();
		}
		return vecindario;
	}

	public static ConjuntoTDA interVecindarios(GrafoTDA g,int v1, int v2 ){
		ConjuntoTDA a = calcularVecindario(g,v1);
		ConjuntoTDA b= calcularVecindario(g,v2);
		PilaTDA pila = new PilaLD();

		while (!a.conjuntoVacio()){
			int x=a.elegir();
			if (b.pertenece(x)){
				pila.apilar(x);
			}
			a.sacar(x);
		}
		while (!pila.pilaVacia()){
			a.agregar(pila.tope());
			pila.desapilar();
		}
		return a;
	}

	public static int mayorElem(ABBTDA a){
		if (!a.hijoDer().arbolVacio()){
			return mayorElem(a.hijoDer());
		}
		else{
			return a.info();
		}
	}

	public static int menorElem(ABBTDA a) {
		if (!a.hijoIzq().arbolVacio()) {
			return menorElem(a.hijoIzq());
		} else {
			return a.info();
		}
	}

	/*public static ColaTDA productoCartesiano(ConjuntoTDA a, ConjuntoTDA b){
		ColaTDA c= new ColaLD();
		PilaTDA pila = new PilaLD();

		while(!b.conjuntoVacio());*/
	}

