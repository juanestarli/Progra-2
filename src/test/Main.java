package test;
import previoFeb2021.*;
import Previo16jul.*;
import Previo16jul.ejercicio3;
import apis.*;
import impl.*;
import metodos.metodosFinal260221;
import ABBTDA.*;
import previoFeb2021.ejercicio1;
import previoFeb2022.*;

public class Main {

	public static void main(String[] args) {
		/*GrafoTDA g = new GrafoLA(); g.inicializarGrafo();

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

		ConjuntoTDA interVecindarios= ejercicio2.interVecindarios(g,6,0);

		while (!interVecindarios.conjuntoVacio()){
			int x= interVecindarios.elegir();
			System.out.println(x);
			interVecindarios.sacar(x);
		}


	}
	ABBTDA a1=new ABB(); a1.inicializarArbol();
	ABBTDA a2=new ABB(); a2.inicializarArbol();

	a1.agregarElem(10);a1.agregarElem(5);a1.agregarElem(15);
	a1.agregarElem(8);a1.agregarElem(12);a1.agregarElem(18);
	a1.agregarElem(9);

	a2.agregarElem(20);a2.agregarElem(16);a2.agregarElem(14);
	a2.agregarElem(7);a2.agregarElem(25);a2.agregarElem(10);

	int x= ejercicio3.CalcularX(a1,a2);
		System.out.println(x);


		ConjuntoTDA c1 = new ConjuntoLD();
		c1.inicializarConjunto();
		ConjuntoTDA c2 = new ConjuntoLD();
		c2.inicializarConjunto();

		c1.agregar(1);c1.agregar(2);c1.agregar(3);
		c2.agregar(5);c2.agregar(6);

		ColaTDA productocartesiano = ejercicio4.productoCartesiano(c1,c2);

		while(!productocartesiano.colaVacia()){
			System.out.println(productocartesiano.primero());
			productocartesiano.desacolar();
		}*/

		ABBTDA a = new ABB();
		a.inicializarArbol();

		a.agregarElem(20);a.agregarElem(16);a.agregarElem(7);a.agregarElem(19);
		a.agregarElem(17);a.agregarElem(6);a.agregarElem(9);a.agregarElem(5);
		a.agregarElem(4);a.agregarElem(3);a.agregarElem(21);

		ConjuntoTDA nodosDesbalanceados = new ConjuntoLD();
		nodosDesbalanceados = ejercicio1.listarNodosDesbalanceados(a,nodosDesbalanceados);

		while (!nodosDesbalanceados.conjuntoVacio()){
			int x= nodosDesbalanceados.elegir();
			System.out.println(x);
			nodosDesbalanceados.sacar(x);
		}
	}
}