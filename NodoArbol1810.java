package Arboles;

/**
 *
 * @author falberto
 */
//definicion de la calse NodoArbol1810
public class NodoArbol1810 {

    //miembros de acceso al paquete
    NodoArbol nodoIzquierdo;
    int datos;
    NodoArbol nodoDerecho;

    //inicializare datos y hacer de este nodo hoja
    public NodoArbol1810(int datosNodo) {
        datos = datosNodo;
        nodoIzquierdo = nodoDerecho = null; //el nodo tiene hijos
    }

    //localizar punto de inserccion e insertar nuevo nodo ignorar valores duplicados
    public synchronized void insertar(int valorInsertar) {
        //insertar en subarbol izquierdo
        if (valorInsertar < datos) {
            //insertar en nuevo NodoArbol
            if (nodoIzquierdo == null) {
                nodoIzquierdo = new NodoArbol(valorInsertar);

            } else { //continuar recorriendo subarbol izquierdo
                nodoIzquierdo.insertar(valorInsertar);
            }
        } else if (valorInsertar > datos) {
            //insertar nuevo NodoArbol
            if (nodoDerecho == null) {
                nodoDerecho = new NodoArbol(valorInsertar);
            } else {//continuar recorriendo subarbol derecho
            
                nodoDerecho.insertar(valorInsertar);
            }
        }
    } //fin insertar
}//fin clase
