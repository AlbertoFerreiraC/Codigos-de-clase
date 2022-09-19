
import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Prueba23 {

    public static void main(String[] args) {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String nombre = "";
        int salario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el monto por dia"));
        //int salario = 0;
        int horas = 0;
        int sueldo = 0;
        System.out.print("\n" + "Nombre:");
        try {
            nombre = entrada.readLine();
            System.out.print("\n" + "Dias  de la semana\tCantidad Hora\n");
            System.out.print("--------------------\t--------------");
            System.out.print("\nLunes\t\t\t\t");
            horas += Integer.parseInt(entrada.readLine());
            System.out.print("\nMartes\t\t\t\t");
            horas += Integer.parseInt(entrada.readLine());
            System.out.print("\nMiercoles\t\t\t");
            horas += Integer.parseInt(entrada.readLine());
            System.out.print("\nJueves\t\t\t\t");
            horas += Integer.parseInt(entrada.readLine());
            System.out.print("\nViernes\t\t\t\t");
            horas += Integer.parseInt(entrada.readLine());
        } catch (Exception e) {
            System.out.println("Error!");
        }

        sueldo = salario * horas;

        System.out.println("\n\nCantidad Hora Semana: " + horas);
        System.out.println("\n\nSu salario aproximado es: " + sueldo);
    }
}
