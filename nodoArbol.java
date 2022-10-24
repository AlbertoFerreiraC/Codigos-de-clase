/*

 */
package ArbolBinario;


public class nodoArbol {
    //miembros de acceso del paquete
    nodoArbol nodoIzquierdo;
    int ci;
    nodoArbol nodoDerecho;
    
    //inicializar datos y hacer de este nodo un nodo hoja
    public nodoArbol(int datosNodo ){
        this.ci= datosNodo;
        
        nodoIzquierdo = nodoDerecho= null; // el nodo no tiene hijos
    }
    //Localizar punto de insercion e insertar nuevo nodo, ignorar valores duplicados

   
    
    public synchronized void insertar (int valorInsertar ){
        //insertar en subarbol izquierdo
        if (valorInsertar < ci){
            //insertar nuevo Nodo Arbol
            if (nodoIzquierdo ==null)
                nodoIzquierdo= new nodoArbol(valorInsertar);
            else//continuar recorrienfo subarbol izquierdo
                nodoIzquierdo.insertar(valorInsertar);
        }   else if(valorInsertar>ci){
            //insertar nuevo NodoArbol
            if(nodoDerecho==null)
                nodoDerecho=new nodoArbol (valorInsertar);
            else //continuar recorriendo subarbol derecho
                nodoDerecho.insertar(valorInsertar);
                     
        }
    }//fin de insertar

   
    
}//fin de la clase NodoArbol
    
