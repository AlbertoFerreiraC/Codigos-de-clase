
package clases;

import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el nombre del alumno ");
        String nombre=teclado.next();
        System.out.println("Ingrese puntaje de su Parcial: ");
        int parcial=teclado.nextInt();
        System.out.println("Ingrese puntaje de su TP: ");       
        int tp=teclado.nextInt();
        System.out.println("Ingrese puntaje de su Participacion en calses: ");       
        int parti=teclado.nextInt();
        System.out.println("Ingrese puntaje de su Examen Final: ");       
        int examen=teclado.nextInt();
        
        int suma = parcial + tp + parti + examen;
        
        if (suma >= 60) {
            
            System.out.println("El alumno " + nombre + "con puntaje final " + suma + " APRUEBA el semestre");
        
        } else {
            
            System.out.println("El alumno " + nombre + "con puntaje final " + suma + " REPRUEBA el semestre");
        
        }
        
    }
    
}
