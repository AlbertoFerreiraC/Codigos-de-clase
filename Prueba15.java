
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prueba15 {

    public static void main(String[] args) {
        BufferedReader dato = new BufferedReader(new InputStreamReader(System.in));
        String num = "";
        String r = "";
        System.out.print("Ingrese un numero Entero:");
        try {
            num = dato.readLine();
            int n = Integer.parseInt(num);
            r = ((n % 3 == 0) && (n % 5 == 0)) ? "Es multiplo de 3 y 5" : "No es multiplo";
            System.out.println(r);
        } catch (IOException e) {
            System.out.println("Error!");

        }
    }
}

    
