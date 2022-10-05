package Arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author falberto
 */
public class MiAplicacion {

    public static void main(String[] args) {
        
        Arbol arbol = new Arbol();
        int valor;
        
        JOptionPane.showMessageDialog(null, "Inicio se insertar valores al arbol");
        
        
        for (int i=0;i<9;i++){
            valor=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor "+" a insertar en el nodo"));
            arbol.insertarNodo(valor);
        }
        
        JOptionPane.showMessageDialog(null, "Valores: "+arbol.getTexto()+"\n SUMA ES: "+arbol.getSuma());
        
    }
    
}
