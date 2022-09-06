package clases;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class Ejercicio7Uni2 {

    public static void main(String[] args) {

        ArrayList<String> nombres = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        nombres.add("Ever");
        nombres.add("Alberto");
        nombres.add("Samu");

        System.out.println("Ingrese el valor para el elemento ");
        String nom = teclado.next();
        String busqueda = nom;
        boolean existe = nombres.contains(busqueda);
        if (existe) {
            System.out.println("El elemento SÍ existe en la lista");
        } else {
            System.out.println("El elemento no existe");
        }
    }
}
