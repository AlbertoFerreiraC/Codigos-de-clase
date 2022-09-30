package clases;

import javax.swing.JOptionPane;

/*Ingrese por teclado numero, usuario, que imprima cual es mayor a ? por JOptionPane*/
/**
 *
 * @author falberto
 */
public class MayorMenorIgual {

    public static void main(String[] args) {

        String nombre1 = JOptionPane.showInputDialog("Ingrese el nombre del usuario 1");
        int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un numero"));

        String nombre2 = JOptionPane.showInputDialog("Ingrese el nombre del usuario 2");
        int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Un numero"));

        if (numero1 > numero2) {
            System.out.println("El numero " + numero1 + " es mayor" + " y fue ingresado por " + nombre1);
        } else {
            System.out.println("El numero " + numero2 + " es mayor" + " y fue ingresado por " + nombre2);
        }
        if (numero1 == numero2) {
            System.out.println("Los numeros son iguales");
        }

    }

}
