package clases; 

import java.util.Scanner;

/**
 *
 * @author falberto 
 * 
 */
public class AlbertoDo { //Este nombre cambia por DeisyDo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int i;
        System.out.print("Introduce un número entero: ");
        n = sc.nextInt();
        System.out.println("Numeros del 1 hasta " + n + " utilizando do .. while: ");
        i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= n);
    }
}
