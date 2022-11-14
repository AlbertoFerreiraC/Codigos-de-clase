
package vertice;
import java.util.Scanner;

public class GrafosMain {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x;
        int ar;
        String a,b; 
        
         System.out.println("Ingrese la canitidad de valores que desea conectar"); 
         x=teclado.nextInt();
         
      GrafoMatriz matriz = new GrafoMatriz(x);
     
     
     for( int i=0; i<x;i++){
       System.out.println("Ingrese el vector" );
       
        matriz.nuevoVertice(teclado.next());
           
     }
     
     try{
         
        System.out.println("Ingrese los vectores que desea conectar"); 
        ar=teclado.nextInt();
         
      for( int i=0; i<ar;i++){
        System.out.println("Ingrese el primer punto" );
        a=teclado.next();
        
        System.out.println("Ingrese el segundo punto" );
        b=teclado.next();
        
        matriz.nuevoArco(a,b);
       
      }
      
     
     
    } catch (Exception e) {
       System.out.println(e);
    }
    for (int i=0;i<matriz.numVertices;i++) {
        for (int j=0;j<matriz.numVertices;j++) {
             System.out.print(matriz.matAdy[i][j]+" ");
        }
         
         System.out.println();
         
     }
     } //fin main
}