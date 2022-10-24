package Arboles;

/**
 *
 * @author falberto
 */
//definicion de la clase Arbol
public class Arbol2310 { //Arbol 18-10-2022

    private NodoArbol raiz;
    String nombre;
    int cedula;

    //construir un objeto Arbol vacio de enteros
    public Arbol2310() {
        raiz = null;
    }

    //insertar un nuevo nodo en el arbol de busqueda binaria
    public void insertarNodo(int valorInsertar, String nom) {
        if (raiz == null) {
            raiz = new NodoArbol(valorInsertar);//crea el nodo raiz
        } else {
            raiz.insertar(valorInsertar); // llamar al metodoInsertar
        }
    } //fin del metodo insertar nodo

    //empezar recorrido preorden
    public void recorridoPreorden() {
        ayudantePreorden(raiz);
    }

    //metodo recursivo para realizar recorrido preorden
    public void ayudantePreorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.datos + " ");//muestra datos del nodo
        ayudantePreorden(nodo.nodoIzquierdo);//recorre el subarbol izquierdo
        ayudantePreorden(nodo.nodoDerecho);//recorre el subarbol derecho
    }//fin del ayudantePreorden

    //empezar recorrido inorden
    public void recorridoInorden() {
        ayudanteInorden(raiz);
    }//fin de recorrido Inorden

    //metodo recursivo para realizar recorrido inorden
    public void ayudanteInorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        ayudanteInorden(nodo.nodoIzquierdo);//recorrer subarbol izqierdo
        System.out.println(nodo.datos + " ");//mostrar datos de nodo
        ayudanteInorden(nodo.nodoDerecho);//recorrer subarbol derecho
    } //fin de ayudante Inorden

    //empezar recorrido postorden
    public void recorridoPostorden() {
        ayudantePostorden(raiz);
    }//fin de recorrido Posrtorden

    //metodo recursivo para realizar recorrido postorden
    public void ayudantePostorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        ayudantePostorden(nodo.nodoIzquierdo);//recorrer subarbol izquierdo
        ayudantePostorden(nodo.nodoDerecho);//recorrer subarbol derecho
        System.out.println(nodo.datos + " ");//mostrar datos del nodo
    } //fin del ayudante postorden

}// fin de la clase Arbol1810
