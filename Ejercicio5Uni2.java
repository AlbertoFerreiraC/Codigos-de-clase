package clases;

import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author falberto
 */
public class Ejercicio5Uni2 {

    public static void main(String[] args) {

        int[] pares = new int[20]; //Array de pares
        int i = 0; //Indice para recorrer el array
        int sumaPares = 0; //Para acumular la suma de los pares generados

        //El bucle crea pares empezando de 0 y sumando 2 en cada iteración
        for (int par = 0; i < 20; par += 2) {
            pares[i] = par; //Guardamos el par
            sumaPares += par; //Sumamos el par
            i++; //Aumentamos indice que recorre el array
        }

        //Mostramos resultado
        String resultado = "Pares generados:\n" + Arrays.toString(pares)
                + "\nSuma de los pares: " + sumaPares;
        JOptionPane.showMessageDialog(null, resultado);

    }

}
