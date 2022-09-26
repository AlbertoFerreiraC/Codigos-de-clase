package clases;

/**
 *
 * @author Usuario
 */
public class Animal1 {

    private String raza;
    private int edad;
    private String nombre;

    //constructor
    public Animal1(String nom) {
        nombre = nom;
    }

    public Animal1() {
        nombre = "";
        raza = "";
        edad = 0;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
}
