package tarea11;

import javax.swing.JOptionPane;

public class MiAplicacion11 {

    public static void main(String[] args) {
        int opcion = 0, elemento;
        String nombre;
        Arbol11 arbol = new Arbol11();
        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "1. Agregar un nodo\n" + "2. Recorrer inOrden\n" + "3. Recorrer PreOrden\n" + "4. Recorrer PostOrden\n" + "5. Buscar Dato en Arbol\n" + "6. Eliminar un nodo del Arbol\n" + "7. Salir\n" + "Elige una Opcion", "ARBOLES BINARIOS", JOptionPane.QUESTION_MESSAGE));
                switch (opcion) {

                    case 1:

                        elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese dato"));
                        nombre = JOptionPane.showInputDialog(null, "Ingrese nombre");
                        arbol.agregarNodo(elemento);
                        break;
                    case 2:

                        if (!arbol.estaVacio()) {
                            System.out.println();
                            arbol.inOrden(arbol.raiz);

                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");

                        }
                        break;

                    case 3:

                        if (!arbol.estaVacio()) {
                            System.out.println();
                            arbol.preOrden(arbol.raiz);

                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;

                    case 4:
                        if (!arbol.estaVacio()) {
                            System.out.println();
                            arbol.postOrden(arbol.raiz);
                        } else {
                            JOptionPane.showMessageDialog(null, "El arbol esta vacio");
                        }
                        break;

                    case 5:
                        if (!arbol.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero a buscar"));

                            if (arbol.buscarNodo(elemento) == null) {
                                JOptionPane.showMessageDialog(null, "El Dato no se encuentra en el Arbol");
                            } else {
                                JOptionPane.showMessageDialog(null, "El Dato ENCONTRADO!");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol esta vacio");
                        }
                        break;

                    case 6:
                        if (!arbol.estaVacio()) {
                            elemento = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese numero a Eliminar"));
                            if (arbol.eliminar(elemento) == false) {
                                JOptionPane.showMessageDialog(null, "El Dato no se encuentra en el Arbol");
                            } else {
                                JOptionPane.showMessageDialog(null, "Nodo eliminado");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "El Arbol esta vacio");
                        }
                        break;

                    case 7:
                        JOptionPane.showMessageDialog(null, "Selecciono salir de la aplicacion");
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opcion Incorrecta", "Importante", JOptionPane.QUESTION_MESSAGE);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error \n" + e);
            }

        } while (opcion != 7);

    }

}
