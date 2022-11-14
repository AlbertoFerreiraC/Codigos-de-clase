
package vertice;

public class Vertice {

    String dato;
     int numVertice;
     
    public Vertice (String x ) {
        dato= x;
       
    }
    public String nomVertice(){ // devuelve el nombre del vértice

       return dato; 
      
   }
    
    public boolean equals(Vertice n) { // devuelve true si dos vértices son iguales
       
       return dato.equals(n.dato);
   }
    
    public void asigVertice(int n) { // establece el número de vértices
     
        numVertice = n;
  
    }
    
    
   public String toString() { // caracteristicas del vértice
     
       return dato + " (" + numVertice + ")";
 
   }
}



    

  

