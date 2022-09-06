
import javax.swing.JOptionPane;

public class Practica16 {

    public static void main(String[] args) {
        int nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
        String msg = "";
        switch (nota) {
            case 100:
                msg = "Excelente";
                break;
            case 90:
                msg = "Nuen trabajo";
                break;
            case 80:
                msg = "Estudiar mas";
                break;
            default:
                msg = "Lo siento fallaste";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
}
