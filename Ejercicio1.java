package clases;

/**
 *
 * @author falberto
 */
public class Ejercicio1 {

    public static void main(String[] args) {

        String nombre = "Alberto";
        int cal1 = 20;
        int cal2 = 39;
        int cal3 = 19;
        int cal4 = 20;
        int suma = cal1 + cal2 + cal3 + cal4;

        if (suma >= 60) {
            
            System.out.println(nombre + "." + " Su calificacion final es: " + suma + " y esta aprobado");
        
        } else {
            
            System.out.println(nombre +"." + " Su calificacion final es: " + suma + " y esta reprobado");
        
        }

    }

}
