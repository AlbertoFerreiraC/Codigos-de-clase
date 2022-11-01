package tarea11;

/*
falberto
 */
import java.util.Scanner;

public class Actividad11 {

    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        int cedula;
        String nombre;
        int edad, opcion, buscar, x, salir = 0;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("1)Ingrese registros al árbol.\n"
                    + "2)Imprimir en preOrden.\n"
                    + "3)Imprimir en inOrden.\n"
                    + "4)Imprimir en postOrden.\n"
                    + "5)Imprimir el numero mayor.\n"
                    + "6)Eliminar un numero ingresado\n"
                    + "7)Buscar numero\n"
                    + "8)Salir de la aplicación.");
            opcion = teclado.nextInt();
            System.out.println("");
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese cuantos registros va a ingresar");
                    x = teclado.nextInt();
                    for (int i = 1; i <= x; i++) {
                        System.out.println("Ingrese nombre");
                        nombre = teclado.next();
                        System.out.println("Ingrese cedula");
                        cedula = teclado.nextInt();
                        System.out.println("Ingrese edad");
                        edad = teclado.nextInt();
                        arbol.insertarNodo(cedula, nombre, edad);
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("\n\nRecorrido preorden");
                    arbol.recorridoPreorden();

                    System.out.println("");
                    break;
                case 3:
                    System.out.println("\n\nRecorrido inorden");
                    arbol.recorridoInorden();

                    System.out.println("");
                    break;
                case 4:
                    System.out.println("\n\nRecorrido postorden");
                    arbol.recorridoPostorden();

                    System.out.println("");
                    break;
                case 5:
                    System.out.println("Impresion del mayor numero");

                    System.out.println("");
                    break;
                case 6:
                    System.out.println("Eliminar numero Ingresado");
                    
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("Buscar numero");
                    System.out.println("Ingrese numero a buscar");
                    buscar = teclado.nextInt();
                    arbol.recorridobuscar(buscar);
                    if (arbol.recorridobuscar(buscar) != null) {
                        System.out.println("Se encontró el numero ingresado\n");

                        System.out.println(arbol.recorridobuscar(buscar).Mensaje());
                    } else {
                        System.out.println("No se encontró el numero que esta buscando\n");
                    }
                    break;
                case 8:
                    salir = 1;
                    break;
            }
        } while (salir != 1);
    }
}
