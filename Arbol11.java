package tarea11;

import javax.swing.*;

public class Arbol11 {

    NodoARBOL11 raiz;

    public Arbol11() {
        raiz = null;
    }

    //Metodo para insertar un nodo al arbol
    public void agregarNodo(int d) {
        NodoARBOL11 nuevo = new NodoARBOL11(d);
        if (raiz == null) {
            raiz = nuevo;
        } else {
            NodoARBOL11 auxiliar = raiz;
            NodoARBOL11 padre;
            while (true) {
                padre = auxiliar;
                if (d < auxiliar.dato) {
                    auxiliar = auxiliar.hijoIzquierdo;
                    if (auxiliar == null) {
                        padre.hijoIzquierdo = nuevo;
                        return;
                    }
                } else {
                    auxiliar = auxiliar.hijoDerecho;
                    if (auxiliar == null) {
                        padre.hijoDerecho = nuevo;
                        return;
                    }

                }
            }
        }
    }
    //Metodo para buscar un nodo en el Arbol

    public NodoARBOL11 buscarNodo(int d) {
        NodoARBOL11 aux = raiz;
        while (aux.dato != d) {
            if (d < aux.dato) {
                aux = aux.hijoIzquierdo;
            } else {
                aux = aux.hijoDerecho;
            }
            if (aux == null) {
                return null;
            }
        }
        return aux;
    }
    //Metodo para saber si el arbol esta vacio

    public boolean estaVacio() {
        return raiz == null;
    }

    // Metodo para recorrer el Arbol InOrden
    public void inOrden(NodoARBOL11 r) {
        if (r != null) {
            inOrden(r.hijoIzquierdo);
            System.out.print(r.dato + ", ");
            inOrden(r.hijoDerecho);
        }
    }

    //Metodo para recorrer el Arbol PreOrden
    public void preOrden(NodoARBOL11 r) {
        if (r != null) {
            System.out.print(r.dato + ", ");
            preOrden(r.hijoIzquierdo);
            preOrden(r.hijoDerecho);

        }
    }

    //Metodo para recorrer el Arbol PreOrden
    public void postOrden(NodoARBOL11 r) {
        if (r != null) {
            postOrden(r.hijoIzquierdo);
            postOrden(r.hijoDerecho);
            System.out.print(r.dato + ", ");
        }
    }
    // Método para imprimir el mayor número

    public void datoMayor() {
        int numeroMayor = 0;
        NodoARBOL11 nodoAuxiliar = raiz;
        while (nodoAuxiliar.hijoDerecho != null) {
            nodoAuxiliar = nodoAuxiliar.hijoDerecho;
            numeroMayor = nodoAuxiliar.dato;
        }
        JOptionPane.showMessageDialog(null,
                "El mayor número ingresado es: " + numeroMayor
                + "\n");
    }
    //Metodo para eliminar un Nodo de Arbol

    public boolean eliminar(int d) {
        NodoARBOL11 auxiliar = raiz;
        NodoARBOL11 padre = raiz;
        boolean esHijoIzq = true;
        while (auxiliar.dato != d) {//recorrer para saber si existe el dato
            padre = auxiliar;
            if (d < auxiliar.dato) {
                esHijoIzq = true;
                auxiliar = auxiliar.hijoIzquierdo; //se apunta a la izquierda
            } else {
                esHijoIzq = false;
                auxiliar = auxiliar.hijoDerecho; //se apunta a la derecha
            }
            if (auxiliar == null) { //llego hasta el final y nunca encontro al nodo.
                return false;
            }
        }//findelwhile
        if (auxiliar.hijoIzquierdo == null
                && auxiliar.hijoDerecho == null) {// si es hoja o raiz
            if (auxiliar == raiz) {
                raiz = null;
            } else if (esHijoIzq) {
                padre.hijoIzquierdo = null;
            } else {
                padre.hijoDerecho = null;
            }
        } else if (auxiliar.hijoDerecho == null) {// se reacomandando los punteros.
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoIzquierdo;
            } else if (esHijoIzq) {
                padre.hijoIzquierdo = auxiliar.hijoIzquierdo;
            } else {
                padre.hijoDerecho = auxiliar.hijoIzquierdo;
            }
        } else if (auxiliar.hijoIzquierdo == null) {// se reacomandando los punteros.
            if (auxiliar == raiz) {
                raiz = auxiliar.hijoDerecho;
            } else if (esHijoIzq) {
                padre.hijoIzquierdo = auxiliar.hijoDerecho;
            } else {
                padre.hijoDerecho = auxiliar.hijoIzquierdo;
            }
        } else {
            NodoARBOL11 reemplazo = obtenerNodoReemplazo(auxiliar);
            if (auxiliar == raiz) {
                raiz = reemplazo;
            } else if (esHijoIzq) {
                padre.hijoIzquierdo = reemplazo;
            } else {
                padre.hijoDerecho = reemplazo;
            }
            reemplazo.hijoIzquierdo = auxiliar.hijoIzquierdo;
        }
        return true;
    }

    //Metodo encargado de volvernos el nodo reemplazo
    public NodoARBOL11 obtenerNodoReemplazo(NodoARBOL11 nodoReemp) {
        NodoARBOL11 reemplazarPadre = nodoReemp;
        NodoARBOL11 reemplazo = nodoReemp;
        NodoARBOL11 auxiliar = nodoReemp.hijoDerecho;
        while (auxiliar != null) { //Recorrer para buscar el candidato areemplazar
            reemplazarPadre = reemplazo;
            reemplazo = auxiliar;
            auxiliar = auxiliar.hijoIzquierdo;
        }
        if (reemplazo != nodoReemp.hijoDerecho) { //Reacomodar los enlaces
            reemplazarPadre.hijoIzquierdo = reemplazo.hijoDerecho;
            reemplazo.hijoDerecho = nodoReemp.hijoDerecho;
        }
        System.out.println("El Nodo reemplazo es: " + reemplazo);
        return reemplazo;
    }
}
