public class Perso{
 private int codper;
 private String nombre;
 public Perso(int cod, String nom){
  codper = cod;
  nombre = nom;
 }
 public void cargaCodigo(int cod){
  codper = cod;
 }
 public void cargaNombre(String nom){
  nombre = nom;
 }
 public int recuCodigo(){
  return codper;
 }
 public String recuNom(){
  return nombre;
 }
}