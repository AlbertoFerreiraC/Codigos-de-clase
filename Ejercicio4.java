package clases;

import java.util.Scanner;

/**
 *
 * @author falberto
 */
public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre del Empledado ");
        String nombre=teclado.next();
        System.out.println("Que tipo de empleado es " + nombre );
        int tipo =teclado.nextInt();
        System.out.println("Cual es el monto del salario de " + nombre);
        int salario = teclado.nextInt();
        
        

        System.out.println(nombre + ", es un empleado de tipo " + tipo + " y su salario sin aumento es: " + salario);
    }
 
}
