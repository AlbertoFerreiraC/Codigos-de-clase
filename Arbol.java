
package ArbolBinario;

//definicion de la clase Arbol



public class Arbol {
    private nodoArbol raiz;
    
    //construir un objeto Arbol vacio de enteros
    public Arbol(){
        raiz = null;
    }
    
    //insertar un nuevo nodo en el arbol de busqueda binario
    public void insertarNodo(int valorInsertar){
        if (raiz == null)
            raiz = new nodoArbol(valorInsertar );//crear el nodo raiz aqui
        else
            raiz.insertar(valorInsertar);//llamar al modoInsertar
    
    }//fin del metodo insertarNodo
    
    //empezar recorrido preorden
    public void recorridoPreorden(){
        ayudantePreorden(raiz);
    }//fin del recorridoPreorden
    
    //metodo recursivo para realizar recorrido preorden
    public void ayudantePreorden(nodoArbol nodo){
        if(nodo==null)
            return;
        
        System.out.print(nodo.ci+" ");//muestra datos del nodo
        ayudantePreorden(nodo.nodoIzquierdo);//recorre subarbol izquierdo
        ayudantePreorden(nodo.nodoDerecho);//recorre subarbol derecho
        
    }//fin de ayudantePreorden
    
    //empezar recorrido inorden
    public void recorridoInorden(){
        ayudanteInorden(raiz);
    }//fin del recorridoPreorden
    
    //metodo recursivo para realizar recorrido preorden
    public void ayudanteInorden(nodoArbol nodo){
        if(nodo==null)
            return;
        ayudanteInorden(nodo.nodoIzquierdo);//recorre subarbol izquierdo
        System.out.print(nodo.ci+" ");//muestra datos del nodo
        ayudanteInorden(nodo.nodoDerecho);//recorre subarbol derecho
    }//fin de ayudanteInorden 
    
    //empezar recorrido inorden
    public void recorridoPostorden(){
        ayudantePostorden(raiz);
    }//fin del recorridoPreorden
    
    //metodo recursivo para realizar recorrido preorden
    public void ayudantePostorden(nodoArbol nodo){
        if(nodo==null)
            return;
        ayudantePostorden(nodo.nodoIzquierdo);//recorre subarbol izquierdo
        ayudantePostorden(nodo.nodoDerecho);//recorre subarbol derecho
        System.out.print(nodo.ci+" ");//muestra datos del nodo
        
    }//fin de ayudantePostorden 

   

   
    
}//fin de la clase Arbol
