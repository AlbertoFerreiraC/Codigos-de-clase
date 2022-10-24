/*

 */
package ArbolBinario;

import javax.swing.JOptionPane;




public class MiMain {

    
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        int ci = 0;
        boolean bandera = false;
        
        System.out.println("Insertando los siguientes valores");
     
       // 
          while(bandera==false){
             ci=Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores enteros"));
             if (ci!=0){
             arbol.insertarNodo(ci);
              }else{
                 bandera = true;
             }
          }
        System.out.println("\n\nRecorrido preorden");
        arbol.recorridoPreorden(); //realiza el recorrido preorden de arbol
        System.out.println("\n\nRecorrido inorden");
        arbol.recorridoInorden(); //realiza el recorrido inorden de arbol
        System.out.println("\n\nRecorrido postorden");
        arbol.recorridoPostorden(); //realiza el recorrido postorden de arbol
    }
    
}