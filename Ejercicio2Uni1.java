package clases;

/**
 *
 * @author falberto
 */
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio2Uni1 {

    public static void main(String args[]) throws IOException {
        Scanner leer = new Scanner(System.in);
        int n = 10;
        int x[];
        x = new int[n];
        int suma = 0;
        double prom = 0;
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su Calificacion " + i);
            x[i] = leer.nextInt();
        }

        for (int i = 0; i < n; i++) {
            suma = suma + x[i];
        }
        prom = suma / n;
        System.out.println("El promedio es: " + prom);
        for (int i = 0; i < n; i++) {
            if (x[i] > prom) {
                System.out.println("Las calififcaciones mayores al promedio son: " + x[i]);
            }
        }
    }

}
