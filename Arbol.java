package Arboles;

/**
 *
 * @author falberto
 */
public class Arbol {

    private NodoArbol raiz;
    private String texto;
    private int suma;
    boolean paraImprimir;
    //construir un objeto Arbol vacio de enteros

    public Arbol() {
        raiz = null;
        texto = "";
        suma = 0;
        paraImprimir = false;
    }

    public String getTexto() {
        return texto;
    }

    public int getSuma() {
        return suma;
    }

    //insertar un nuevo nodo en el arbol de busqueda binaria
    public void insertarNodo(int valorInsertar) {
        paraImprimir = false;
        if (raiz == null) {
            raiz = new NodoArbol(valorInsertar);//crear el nodo raiz aqui
            paraImprimir = true;
        } else {
            paraImprimir = raiz.insertar(valorInsertar);//llamar al metodoInsertar
        }
        if (paraImprimir == true) {
            texto = texto + " " + valorInsertar;
            suma = suma + valorInsertar;
        }
    }

}
