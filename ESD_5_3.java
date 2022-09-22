package clases;

/**
 *
 * @author User
 */
import javax.swing.JOptionPane;

public class ESD_5_3 {

    public static void Primo(int n) {
        int restador = 0;
        for (int i = n; i > 0; i--) {
            restador = i - 1;
            if (restador % 2 != 0) {
                System.out.println("El numero " + restador + " es primo");
            }
        }
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        Primo(num);
    }
}
