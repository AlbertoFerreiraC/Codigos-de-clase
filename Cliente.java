public class Cliente extends Perso{
 private int idcliente;
 public Cliente(int cod, String nom, int id){
  super(cod, nom);
  idcliente = id;
 }
 public void cargarId(int i){
   idcliente = i;
 }
 public int recuId(){
  return idcliente;
 }
}