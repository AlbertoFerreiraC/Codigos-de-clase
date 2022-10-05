package Arboles;

/**
 *
 * @author falberto
 */
public class Arboles {

    private NodoArbol raiz;
    private String texto;
    private int suma;
    boolean paraImprimir;

    public Arbol(){
        raiz = null;
        texto = "";
        suma = 0;
        paraImprimir = false;
    }

    public String getTexto(){
        return texto;
    }
    
    public int getSuma(){
        return suma;
    }
    
    public void insertarNodo (int valorInsertar){
        paraImprimir =false;
        if (raiz == null){
            raiz = new NodoArbol (valorInsertar);
            paraImprimir=true;
        } else {
            paraImprimir=raiz.insertar(valorInsertar);
        }
        if (paraImprimir == true ){
            texto=texto+" "+valorInsertar;
            suma=suma +valorInsertar;
        }
    }
    
}
