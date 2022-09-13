package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author falberto
 */
public class ESD_4_1 {

    public static int factorial(int n) {
        int valor;
        if (n == 0) {
            valor = 1;
        } else {
            valor = n * factorial(n - 1);
        }
        return valor;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Ingrese un numero para obtener su factorial: ");
        n = Integer.parseInt(bufEntrada.readLine());
        System.out.println("Su factorial es: " + factorial(n));
    }

}
