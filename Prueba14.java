import javax.swing.JOptionPane;

public class Prueba14 {

    public static void main(String[] args) {

        String marca = JOptionPane.showInputDialog("Ingrese la marca de su auto");
        String modelo = JOptionPane.showInputDialog("Ingrese el modelo de su auto");
        double velocidad = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad maxima"));

        if (velocidad <= 120) {
            JOptionPane.showMessageDialog(null, "El vehiculo " + marca + " es PARA PASEO");
        } else if (velocidad >= 120 && velocidad <= 250) {
            JOptionPane.showMessageDialog(null, "El vehiculo " + marca + " es PARA DIVERSION");

        } else if (velocidad >= 250) {
            JOptionPane.showMessageDialog(null, "El vehiculo " + marca + " es PARA CARRERA");
        }
    }
}