package Arboles;

/**
 *
 * @author falberto
 */
public class AplicacionArbol1810 {

    public static void main(String[] args) {

        Arbol1810 arbol = new Arbol1810();
        float valor;
        System.out.println("Insertando los siguientes valores");
        //insertar 10 enteros aleatorios del 0 al 99 en arbol

        for (int i = 1; i <= 10; i++) {
            valor = (float) (Math.random() * 100);
            System.out.println(valor + " ");
            arbol.insertarNodo((int) valor);
        }
        System.out.println("\n\nRecorrido Preorden");
        arbol.recorridoPreorden();//realizar el recorrido preorden de arbol

        System.out.println("\n\nRecorrido Inorden");
        arbol.recorridoInorden();//realizar el recorrido Inorden de arbol

        System.out.println("\n\nRecorrido Postorden");
        arbol.recorridoPostorden();//realizar el recorrido Postorden de arbol

    }

}
