package clases; 

import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class AlbertoFor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del 1 al " + n + " utilizando for: ");
        for (i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}
