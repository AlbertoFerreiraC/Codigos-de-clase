package clases;
/**
 *
 * @author falberto
 */
import java.io.*;

public class Ejercicio8Uni2 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String a[];
        int n;
        String ultimo;
        int x;
        n = 5;
        a = new String[n];
        for (x = 1; x <= n; x++) {
            System.out.println("Ingrese el valor para el elemento " + x + " del Vector A");
            a[x - 1] = bufEntrada.readLine();
        }
        System.out.println("");
        for (x = 1; x <= n; x++) {
            System.out.print(a[x - 1] + " ");
        }
        System.out.println("");
        ultimo = a[n - 1];
        for (x = 1; x >= n; x--) {
            a[x - 2] = a[x - 1];
        }
        // a(1)=ultimo
        for (x = n; x >= 1; x--) {
            System.out.print(a[x - 1] + " ");
        }
        System.out.println("");
        System.out.println("");
    }

}
