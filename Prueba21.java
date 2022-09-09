package clases;

import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class Prueba21 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int notas;
        int suma = 0;
        int promedio;
        int a;

        for (a = 1; a <= 5; a++) {
            System.out.println("Ingresa el numero: " + a + "");
            notas = leer.nextInt();
            suma = suma + notas;

        }

        promedio = suma / (a - 1);
        System.out.println("El promedio de las suma es:" + promedio);
    }

}
