package clases;

import java.io.*;

public class Ejercicio3Uni2 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String a[];
        int n;
        String ultimo;
        int x;
        n = 3;
        a = new String[n];
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
