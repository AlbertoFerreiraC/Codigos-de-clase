
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test { //Examen Final Fila 2

    public static void main(String[] args) {
        int n;
        int mayor, menor;
        int[] nota;
        String[] nombre;
        String[] correo;
        int salir;
        do {
            String salida = "Nombre\tNota\tCorreo\n";
            mayor = 0;
            menor = 0;
            do {
                n = Integer.parseInt(JOptionPane.showInputDialog("Introduce cantidad de alumnos"));
            } while (n <= 0);
            nombre = new String[n];
            nota = new int[n];
            correo = new String[n];

            for (int i = 0; i < n; i++) {

                nombre[i] = JOptionPane.showInputDialog("Ingrese nombre del alumno: ");
                nota[i] = Integer.parseInt(JOptionPane.showInputDialog("Acumulado del alumno " + nombre[i] + " :"));
                correo[i] = JOptionPane.showInputDialog("Ingrese el correo del estudiante " + nombre[i] + " :");
                if (!correo[i].contains("@")) { //Para controlar el correo
                    JOptionPane.showMessageDialog(null, "El correo de " + nombre[i] + " es incompatible.");
                    if (nota[i] >= 40) {
                        JOptionPane.showMessageDialog(null, "Con posibilidad");
                        mayor = nota[i];
                    } else {
                        JOptionPane.showMessageDialog(null, "Sin posibilidad");
                        menor = nota[i];
                    }
                    if (nota[i] > mayor) {
                        mayor = nota[i];
                    } else {
                        menor = nota[i];
                    }
                    break;
                }
            }
            for (int x = 0; x < n; x++) {
                salida += nombre[x] + "\t" + nota[x] + "\t" + correo[x] + "\n";
            }
            salida += "Nota menor: " + menor + "\n" + "Nota mayor: " + mayor;
            JTextArea areaSalida = new JTextArea();
            areaSalida.setText(salida);

            //para fecha del dia del sistema
            Calendar c = new GregorianCalendar();
            String dia, mes, anho;

            dia = Integer.toString(c.get(Calendar.DATE));
            mes = Integer.toString(c.get(Calendar.MONTH));
            anho = Integer.toString(c.get(Calendar.YEAR));

            JOptionPane.showMessageDialog(null, areaSalida, dia + "/" + mes + "/" + anho, JOptionPane.INFORMATION_MESSAGE);

            salir = Integer.parseInt(JOptionPane.showInputDialog("Desea continuar?"));

        } while (salir != 999);

    }
}
