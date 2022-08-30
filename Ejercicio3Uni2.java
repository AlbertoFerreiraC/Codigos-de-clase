package clases;

/**
 *
 * @author falberto
 */
import java.io.*;
import java.util.Scanner;

public class Ejercicio3Uni2 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String a[];
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de elementos del vector");
        int n = leer.nextInt();
        a = new String[n];
        String ultimo;
        int x;
        for (x = 1; x <= n; x++) {
            System.out.println("Ingrese el valor para el elemento " + x + " del Vector A");
            a[x - 1] = bufEntrada.readLine();
        }
        System.out.println("");
        for (x = 1; x <= n; x++) {
            System.out.print(a[x - 1] + ",");
        }
        System.out.println("");
        ultimo = a[n - 1];
        for (x = n - 1; x >= 1; x--) {
            a[x] = a[x - 1];
        }
        a[0] = ultimo;
        for (x = 1; x <= n; x++) {
            System.out.print(a[x - 1] + ",");
        }
        System.out.println("");
    }

}
