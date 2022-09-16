package clases;

import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class ESD_5_2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Primer numero");
        int num1 = leer.nextInt();
        System.out.println("Ingrese segundo numero");
        int num2 = leer.nextInt();
        Operaciones(num1, num2);
    }

    public static int Operaciones(int a, int b) {
        int suma = (a + b);
        System.out.println("La suma de " + a + " y " + b + " es: " + suma);
        int resta = (a - b);
        System.out.println("La resta de " + a + " y " + b + " es: " + resta);
        int multiplicacion = (a * b);
        System.out.println("La Multiplicacion de " + a + " y " + b + " es: " + multiplicacion);
        int division = (a / b);
        System.out.println("La Division de " + a + " y " + b + " es: " + division);
        return 0;
    }
}
