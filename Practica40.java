public class Practica40{
 public static void main(String [] args){
  //Perso p1 = new Perso();
  //p1.cargaCodigo(Integer.parseInt(args[0]));
  //p1.cargaNombre(args[1]);

  Cliente c1 = new Cliente(Integer.parseInt(args[0]),
			   args[1],Integer.parseInt(args[2]));
  //c1.cargarId(Integer.parseInt(args[2]));

  System.out.println("Codigo: " + c1.recuCodigo() +
		     " Nombre: " + c1.recuNom() + 
		     " Id.Cliente: " + c1.recuId()); 

  
 }
}