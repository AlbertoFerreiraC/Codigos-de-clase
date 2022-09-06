package clases;

import java.util.*;

/**
 *
 * @author falberto
 */
public class Ejercicio4Uni2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nombreEmmple = new String[3];
        double[] horas = new double[3];

        String nombreConHora;
        int hora;

        int salario = 0;
        int i = 0;

        System.out.println("Lectura de Nombre y horas trabajadas de una persona");
        System.out.print("Nombre " + (i + 1) + ": ");
        nombreEmmple[i] = sc.nextLine();
        System.out.print("Horas trabajadas: ");
        horas[i] = sc.nextDouble();

        hora = (int) horas[i];
        nombreConHora = nombreEmmple[i];

        for (i = 1; i < nombreEmmple.length; i++) {
            sc.nextLine(); //limpiar el buffer
            System.out.print("Empleado " + (i + 1) + ": ");
            nombreEmmple[i] = sc.nextLine();
            System.out.print("Horas: ");
            horas[i] = sc.nextDouble();

            if (horas[i] > hora) {
                hora = (int) horas[i];
                nombreConHora = nombreEmmple[i];
            }
            salario = 8500 * hora;
        }
        //mostrar resultados
        System.out.println(nombreConHora + " es la persona con mayor Horas trabajadas " + hora + " su salario promedio es " + salario);
    }
}
