
package vertice;


public class GrafoMatriz {
int numVertices;
Vertice [] verts;
int [][]matAdy;

     public GrafoMatriz(int mx) { 
         matAdy = new int[mx][mx];
         verts = new Vertice[mx];
         for (int i = 0; i < mx; i++) {
         for (int j = 0; j < mx; j++) {
         matAdy[i][j] = 0;
  }
    }

        
        numVertices = 0;
}
// devuelve -1 si no lo encuentra
     public int numVertice(String vs){
      Vertice v = new Vertice(vs);
       boolean encontrado = false;
       int i = 0;
       for (; (i < numVertices) && !encontrado;) {
       encontrado = verts[i].equals(v);
       if (!encontrado) i++;
}
       if (i < numVertices){
   return i;
      }else {
   return -1;
 }

    }

        
        // crear nuvo Vértice
     public void nuevoVertice(String nombre) {
         
       boolean existe = numVertice(nombre) >= 0;
       if (!existe) {
       Vertice v = new Vertice(nombre);
       v.asigVertice(numVertices);
       verts[numVertices++] = v;
}
       
   }
        
        
        
        // busca en el array ambos vértices y marca la matriz
      public void nuevoArco(String a, String b)throws Exception {
          
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
         matAdy[va][vb] = 1;
         
}

        // comprueba si hay un arco entre dos vértices
      public boolean adyacente (String a, String b) throws Exception {
          
        int va, vb;
        va = numVertice(a);
        vb = numVertice(b);
        if (va < 0 || vb < 0) throw new Exception("Vértice no existe");
        return matAdy[va][vb] == 1;
   
          
    }
    
}
