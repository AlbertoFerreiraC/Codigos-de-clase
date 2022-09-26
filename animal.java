package clases; //la clase debe tener otro nombre

/**
 *
 * @author falberto
 */
public class animal {

    public static void main(String[] args) {
        
        Animal1 miAnimal = new Animal1();
        Animal1 perro=new Animal1("Rompe");
        miAnimal.setRaza("Pitbull");
        miAnimal.setNombre("Peter");
        
        perro.setEdad(5);
        System.out.println("La edad es");
        System.out.println(perro.getEdad());
        System.out.println(perro.getNombre());
        perro.setNombre("Firu");
        System.out.println(perro.getNombre());
        System.out.println(miAnimal.getNombre());
        System.out.println(miAnimal.getRaza());
        
    }

}
