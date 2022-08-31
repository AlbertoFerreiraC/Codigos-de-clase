package clases;

import java.util.*;

/**
 *
 * @author falberto
 */
public class Ejercicio6Uni2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] personas = new String[3];
        double[] edad = new double[3];

        String nombreMayor;
        int mayorEdad;

        int i = 0;

        System.out.println("Lectura del nombre y edad de la persona");
        System.out.print("Nombre " + (i + 1) + ": ");
        personas[i] = sc.nextLine();
        System.out.print("Edad: ");
        edad[i] = sc.nextDouble();

        mayorEdad = (int) edad[i];
        nombreMayor = personas[i];

        for (i = 1; i < personas.length; i++) {
            sc.nextLine(); //limpiar el buffer
            System.out.print("Persona " + (i + 1) + ": ");
            personas[i] = sc.nextLine();
            System.out.print("Edad: ");
            edad[i] = sc.nextDouble();

            if (edad[i] > mayorEdad) {
                mayorEdad = (int) edad[i];
                nombreMayor = personas[i];
            }
        }

        //mostrar resultados
        System.out.println(nombreMayor + " es la persona con mayor edad " + "su edad es " + mayorEdad);
    }
}
