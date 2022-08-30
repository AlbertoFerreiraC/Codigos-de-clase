package clases;

/**
 *
 * @author falberto
 */
public class Ejercicio1Uni2 {

    public static void main(String[] args) {
        int mes, capital;
        double saldo, interes, total_interes;
        System.out.println("Informe de capitalizacion: ");
        capital = 100000;
        total_interes = 0;
        interes = 0;
        int porcentaje = 0;
        for (mes = 1; mes <= 24; mes++) {
            porcentaje = porcentaje + 3000;
            saldo = (capital + porcentaje);
            interes = capital + interes;
            System.out.println(mes + " " + capital + " " + porcentaje + " " + saldo);
        }
    }
}
