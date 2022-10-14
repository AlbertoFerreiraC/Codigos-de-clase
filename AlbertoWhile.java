package clases; 

import java.util.Scanner;

/**
 *
 * @author falberto 
 */
public class AlbertoWhile { 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del 1 al " + n +" utilizando while: ");
        int i = 1;
        while (i <= n) {
            System.out.println(i);
            i++;
        }
    }
}
