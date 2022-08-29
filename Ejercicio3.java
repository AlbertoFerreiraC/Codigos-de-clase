package clases;

import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int n;
        int x[];
        int suma = 0;
        int prom = 0;

        //le decimos cuantos numeros le agregamos
        System.out.println("Cantidad de elementos:");
        n = teclado.nextInt();
        x = new int[n];

        //carga hasta los numeros que le asignamos 
        for (int i = 0; i < n; i++) {
            System.out.println("x[" + i + "]");
            x[i] = teclado.nextInt();
        }
        //realiza la suma de los elementos cargados arriba
        for (int i = 0; i < n; i++) {
            suma = x[i] + suma;
        }

        //promedio
        prom = suma / n;

        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + prom);
    }
}
