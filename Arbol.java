package tarea11;
/*
falberto
*/
public class Arbol {
    
    private NodoArbol raiz;
    
    public Arbol(){
        raiz=null;
    }
    
    public void insertarNodo(int valorInsertar, String nom, int ed){
        if (raiz==null)
            raiz = new NodoArbol(valorInsertar, nom, ed);
        else
            raiz.insertar(valorInsertar, nom, ed);
    }
    
    public void recorridoPreorden(){
        ayudantePreorden(raiz);
    }
    
    public void ayudantePreorden(NodoArbol nodo){
        if (nodo==null)
            return;
        
        System.out.print(nodo.ci+" ");
        ayudantePreorden(nodo.NodoIzquierdo);
        ayudantePreorden(nodo.NodoDerecho);    
    }
    
    public NodoArbol recorridobuscar(int buscador){
        NodoArbol aux=raiz;
        while (aux.ci!=buscador){
            if (buscador<aux.ci){
                aux = aux.NodoIzquierdo;
            }else{
                aux = aux.NodoDerecho;
            }
            if (aux==null){
                return null;
            }  
        }
        return aux;
    }
    
    public void recorridoInorden(){
        ayudanteInorden(raiz);
    }
    
    public void ayudanteInorden(NodoArbol nodo){
        if (nodo==null)
            return;
        
        ayudanteInorden(nodo.NodoIzquierdo);
        System.out.print(nodo.ci+" ");
        ayudanteInorden(nodo.NodoDerecho);
        
    }
    
    public void recorridoPostorden(){
        ayudantePostorden(raiz);
    }
    
    public void ayudantePostorden(NodoArbol nodo){
        if (nodo==null)
            return;
        
        ayudantePostorden(nodo.NodoIzquierdo);
        ayudantePostorden(nodo.NodoDerecho);
        System.out.print(nodo.ci+" ");
        
    }
    
    
}
