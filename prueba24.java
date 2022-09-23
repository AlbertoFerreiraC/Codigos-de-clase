
import java.io.*;

public class prueba24 {

    public static void main(String args[]) throws IOException {
        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        int contador1;
        int contador2;
        int contador3;
        int i;
        int n;
        int num[];
        int x[];
        System.out.println("Ingrese un numero");
        n = Integer.parseInt(bufEntrada.readLine());
        contador1 = 0;
        contador2 = 0;
        contador3 = 0;
        x = new int[n];
        num = new int[n];
        for (i = 1; i <= n; i++) {
            System.out.println("El elemento en la posicion " + i);
            num[n - 1] = Integer.parseInt(bufEntrada.readLine());
            if (num[n - 1] < 0) {
                contador1 = contador1 + 1;
            }
            if (num[n - 1] == 0) {
                contador2 = contador2 + 1;
            }
            if (num[n - 1] > 0) {
                contador3 = contador3 + 1;
            }
        }
        System.out.println("La cantidad de elementos negativos del Vector X es: " + contador1);
        System.out.println("La cantidad de elementos nulos del Vector X es: " + contador2);
        System.out.println("La cantidad de elementos positivos del Vector X es: " + contador3);
    }

}
