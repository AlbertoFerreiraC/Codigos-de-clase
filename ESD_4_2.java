package clases;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author falberto
 */
public class ESD_4_2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufEntrada = new BufferedReader(new InputStreamReader(System.in));
        String linea;
        int numero1;
        int numero2;
        int opcion;
        boolean repite;
        double resultado;
        repite = true;
        do {
            System.out.println("MENU DE OPCIONES");
            System.out.println("1. Cuadrado");
            System.out.println("2. Triangulo");
            System.out.println("0. SALIR");
            System.out.println("Ingrese una opcion: ");
            opcion = Integer.parseInt(bufEntrada.readLine());
            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el un lado del cuadrado: ");
                    numero1 = Integer.parseInt(bufEntrada.readLine());
                    System.out.println("Ingrese el otro lado del cuadrado: ");
                    numero2 = Integer.parseInt(bufEntrada.readLine());
                    resultado = numero1 * numero2;
                    System.out.println("Resultado: " + resultado);
                    linea = bufEntrada.readLine();
                    break;
                case 2:
                    System.out.println("Ingrese la base del triangulo: ");
                    numero1 = Integer.parseInt(bufEntrada.readLine());
                    System.out.println("Ingrese la altura del triangulo: ");
                    numero2 = Integer.parseInt(bufEntrada.readLine());
                    resultado = (numero1 * numero2) / 2;
                    System.out.println("Resultado: " + resultado);
                    linea = bufEntrada.readLine();
                    break;
                case 0:
                    repite = false;
                    break;
            }
        } while ((repite != false));
    }

}
