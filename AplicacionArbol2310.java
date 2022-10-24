package Arboles;

import javax.swing.JOptionPane;

/**
 *
 * @author falberto
 */
public class AplicacionArbol2310 {

    public static void main(String[] args) {

        Arbol2310 arbol = new Arbol2310();
        int num = 0;
        String nombre;

        nombre = JOptionPane.showInputDialog("Ingrese nombre");

        for (int i = 0; i < 5; i++) {
            do {
                num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Valores Enteros"));
                System.out.println(num + " ");
                arbol.insertarNodo(num, nombre);
            } while (num == 0);
        }

        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();//realizar el recorrido preorden de arbol

        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();//realizar el recorrido Inorden de arbol

        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPostorden();//realizar el recorrido Postorden de arbol

    }

}
