package tarea11;

public class NodoARBOL11 {

    int dato;
    String nombre;
    NodoARBOL11 hijoIzquierdo;
    NodoARBOL11 hijoDerecho;

    public NodoARBOL11(int d) {
        this.dato = d;
        this.hijoDerecho = null;
        this.hijoIzquierdo = null;
    }

    public String toString() {
        return nombre + " Su Dato es: " + dato;
    }
}
