package tarea11;

/*
falberto
 */
public class NodoArbol {

    NodoArbol NodoIzquierdo;
    int ci;
    String nombre;
    int edad;
    NodoArbol NodoDerecho;

    public NodoArbol(int datosNodo, String nom, int ed) {
        ci = datosNodo;
        nombre = nom;
        edad = ed;
        NodoIzquierdo = NodoDerecho = null;

    }

    public void insertar(int valorInsertar, String nom, int ed) {
        //insertar en subarbolizquierdo
        if (valorInsertar < ci) {
            //insertar nuevo nodoarbol
            if (NodoIzquierdo == null) {
                NodoIzquierdo = new NodoArbol(valorInsertar, nom, ed);
            } else {// continnuar recorriendo subarbol izquierdo
                NodoIzquierdo.insertar(valorInsertar, nom, ed);
            }
        } else if (valorInsertar > ci) {
            //insertar nuevo NodoArbol
            if (NodoDerecho == null) {
                NodoDerecho = new NodoArbol(valorInsertar, nom, ed);
            } else {
                NodoDerecho.insertar(valorInsertar, nom, ed);
            }
        }
    }

    public String Mensaje() {
        return "Sus datos son:\nCI: " +
                this.ci + "\nNombre: " +
                this.nombre +
                "\nEdad: " +
                this.edad +
                "\n";
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
