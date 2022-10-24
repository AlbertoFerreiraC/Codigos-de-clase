package Arboles;

/**
 *
 * @author falberto
 */
//definicion de la calse NodoArbol1810
public class NodoArbol2310 {

    //miembros de acceso al paquete
    NodoArbol nodoIzquierdo;
    int ci;
    String nombre;
    NodoArbol nodoDerecho;

    //inicializare datos y hacer de este nodo hoja
    public NodoArbol2310(int datosNodo, String nom) {
        ci = datosNodo;
        nombre=nom;
        nodoIzquierdo = nodoDerecho = null; //el nodo tiene hijos
    }

    //localizar punto de inserccion e insertar nuevo nodo ignorar valores duplicados
    public void insertar(int valorInsertar, String nom) {
        //insertar en subarbol izquierdo
        if (valorInsertar < ci) {
            //insertar en nuevo NodoArbol
            if (nodoIzquierdo == null) {
                nodoIzquierdo = new NodoArbol(valorInsertar, nom);

            } else { //continuar recorriendo subarbol izquierdo
                nodoIzquierdo.insertar(valorInsertar, nom);
            }
        } else if (valorInsertar > ci) {
            //insertar nuevo NodoArbol
            if (nodoDerecho == null) {
                nodoDerecho = new NodoArbol(valorInsertar, nom);
            } else {//continuar recorriendo subarbol derecho
            
                nodoDerecho.insertar(valorInsertar, nom);
            }
        }
    } //fin insertar
}//fin clase