package clases;

import java.io.*;

/**
 *
 * @author falberto
 */
public class Ejercicio9Uni2 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int i;
        int j;
        int m[][];
        int n;
        m = new int[4][4];
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                System.out.print("Ingresa la calificacion del alumno: " + i + " en la fila  " + j + " ");
                n = Integer.parseInt(bufEntrada.readLine());
                m[i - 1][j - 1] = n;
            }
        }
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= 4; j++) {
                System.out.print(" " + m[i - 1][j - 1]);
            }
            System.out.println(" ");
        }
        // Escribir "El resultado de la suma de todos los elementos de la matriz es :",suma;
    }

}
