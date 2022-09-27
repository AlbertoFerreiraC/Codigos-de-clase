package clases;

import java.io.*;
import java.util.Scanner;

public class ESD_2_TEST {

    public static void main(String args[]) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int vector[] = new int[20];
        int x;
        int n = 0;

        for (x = 1; x <= 10; x++) {
            System.out.println("Ingrese un número: ");
            vector[x] = entrada.nextInt();

            if (x % 2 == 1) {
                System.out.println("Elemento en posición impar: " + vector[x]);
            }
        }

    }

}
