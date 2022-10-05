package Arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author falberto
 */
public class NodoArbol {

    NodoArbol nodoIzquierdo;
    int datos;
    NodoArbol nodoDerecho;
    boolean bool;

    //inicializar datos y hacer de este nodo un nodo hoja
    public NodoArbol(int datosNodo) {
        datos = datosNodo;
        nodoIzquierdo = nodoDerecho = null; //el nodo no tiene hijos
        bool = false;
    }

    //localizar punto de inserción e insertar nuevo nodo
    //ignorar valores duplicados
    public boolean insertar(int valorInsertar) {
        bool = false;
        //insertar en subarbol izquierdo
        if (valorInsertar < datos) {
            //insertar nuevo nodo
            if (nodoIzquierdo == null) {
                nodoIzquierdo = new NodoArbol(valorInsertar);
            } else //continuar recorriendo subarbol izquierdo
            {
                nodoIzquierdo.insertar(valorInsertar);
            }
        } else if (valorInsertar > datos) {
            //insertar nuevo NodoArbol
            if (nodoDerecho == null) {
                nodoDerecho = new NodoArbol(valorInsertar);
            } else //continuar recorriendo subarbol derecho
            {
                nodoDerecho.insertar(valorInsertar);
            }
        }
        if (valorInsertar == datos) {
            JOptionPane.showMessageDialog(null, "Duplicado");
            return bool = false;
        } else {
            return bool = true;
        }
    }

}
