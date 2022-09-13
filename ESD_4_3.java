package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author falberto
 */
public class ESD_4_3 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int multi = 1;
        int suma;
        int vector[];
        int x;
        vector = new int[10];
        for (x = 1; x <= 10; x++) {
            System.out.println("Ingresa el numero " + x);
            vector[x - 1] = Integer.parseInt(bufEntrada.readLine());
        }
        suma = 0;
        for (x = 1; x <= 10; x++) {
            suma = suma + vector[x - 1];
        }
        for (x = 1; x <= 10; x++) {
            multi = vector[x - 1] * multi;
        }
        System.out.println("La suma de los 10 elementos es: " + suma);
        System.out.println("La multiplicacion de los 10 elementos es: " + multi);
    }

}
